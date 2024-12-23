package com.example.lessonSpring.controller;

import com.example.lessonSpring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    private User registeredUser;

    private boolean isAuthenticated = false;

    @GetMapping("/")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, Model model) {
        if (username.isEmpty() || password.isEmpty()) {
            model.addAttribute("error", "Имя пользователя и пароль не должны быть пустыми!");
            return "register";
        }
        registeredUser = new User(username, password);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (registeredUser == null ||
                !registeredUser.getUsername().equals(username) ||
                !registeredUser.getPassword().equals(password)) {
            model.addAttribute("error", "Неверное имя пользователя или пароль!");
            return "login";
        }
        isAuthenticated = true;
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {
        if (!isAuthenticated) {
            return "redirect:/login";
        }
        return "home";
    }

    @PostMapping("/home")
    public String voting(@RequestParam String option, Model model) {
        return switch (option) {
            case "Python" -> {
                model.addAttribute("voteResult", "Вы выбрали язык Python (плохой выбор)");
                registeredUser.setLikelyLanguage(option);
                yield "home";
            }
            case "Java" -> {
                model.addAttribute("voteResult", "Вы выбрали язык Java (нормальный выбор)");
                registeredUser.setLikelyLanguage(option);
                yield "home";
            }
            case "C++" -> {
                model.addAttribute("voteResult", "Вы выбрали язык C++ (правильный выбор)");
                registeredUser.setLikelyLanguage(option);
                yield "home";
            }
            default -> {
                model.addAttribute("voteResult", "Вы ничего не выбрали, идите метите улицы!");
                registeredUser.setLikelyLanguage(option);
                yield "home";
            }
        };
    }
}

