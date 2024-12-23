package lesson_12;

public class ClientInterface {
    public static GUIFactory getGUIFactory(String platform) {
        if (platform.equalsIgnoreCase("Windows")) return new WinGUIFactory();
        else if (platform.equalsIgnoreCase("MacOS")) return new MacGUIFactory();
        throw new IllegalArgumentException("Warning: Invalid platform.");
    }

    public static void main(String[] args) {
        String platform = "MacOS";
        GUIFactory guiFactory = null;
        try {
            guiFactory = getGUIFactory(platform);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        Button button = guiFactory != null ? guiFactory.createButton() : null;
        Checkbox checkbox = guiFactory != null ? guiFactory.createCheckbox() : null;

        if (button != null) {
            button.draw();
        }
        if (checkbox != null) {
            checkbox.draw();
        }

    }
}
