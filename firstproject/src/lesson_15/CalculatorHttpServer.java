package lesson_15;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class CalculatorHttpServer {
    private static final int PORT = 1313;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Calculate HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), StandardCharsets.UTF_8), true);

        String requestLine = in.readLine();
        System.out.println("Получен запрос: " + requestLine); // Логируем тест запрос

        if (requestLine == null || !requestLine.startsWith("GET")) {
            sendHttpResponse(out, 400, "Чушпанский запрос.");
            return;
        }

        String[] requestParts = requestLine.split(" ");
        String path = requestParts[1];
        System.out.println("Путь запроса: " + path); // Логируем путь

        if (path.startsWith("/calculate")) {
            handleCalculate(path, out);
        } else {
            sendHttpResponse(out, 404, "Чушпан не найден");
        }

        out.flush();
        System.out.println("Ответ отправлен клиенту."); // Логируем отправку ответа
    }

    private static void handleCalculate(String path, PrintWriter out) {
        try {
            String[] params = path.split("\\?")[1].split("&");
            double a = 0, b = 0;
            String op = "";

            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue.length != 2) {
                    sendHttpResponse(out, 400, "Параметр неверен: " + param);
                    return;
                }
                switch (keyValue[0]) {
                    case "a" -> a = Double.parseDouble(keyValue[1]);
                    case "b" -> b = Double.parseDouble(keyValue[1]);
                    case "op" -> op = keyValue[1];
                }
            }

            double result = calculate(a, b, op, out);
            if (!Double.isNaN(result)) {
                sendHttpResponse(out, 200, String.format("Чушпанчик: %.1f %s %.1f = %.1f", a, op, b, result));
            }

        } catch (Exception e) {
            sendHttpResponse(out, 400, "Ошибка чушпана: " + e.getMessage());
        }
    }

    private static double calculate(double a, double b, String op, PrintWriter out) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    sendHttpResponse(out, 400, "Жестокая разделка чушпана на ноль");
                    yield Double.NaN;
                }
                yield a / b;
            }
            default -> {
                sendHttpResponse(out, 404, "Неизвестный чушпан!");
                yield Double.NaN;
            }
        };
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String message) {
        String fullMessage = "Кудряшов Дмитрий Сергеевич; Шифр: 23И0056\n" + message + "                                                           ";

        out.println("HTTP/1.1 " + statusCode + " " + getStatusMessage(statusCode));
        out.println("Content-Type: text/plain; charset=UTF-8");
        out.println("Content-Length: " + fullMessage.length());
        out.println();
        out.println(fullMessage);
        System.out.println("Отправлено: " + fullMessage);
        out.flush();
    }

    private static String getStatusMessage(int statusCode) {
        return switch (statusCode) {
            case 200 -> "OK";
            case 400 -> "Bad Request";
            case 404 -> "Not Found";
            default -> "Unknown Status";
        };
    }
}