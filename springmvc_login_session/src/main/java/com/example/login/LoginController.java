package com.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        model.addAttribute("usuario", session.getAttribute("SPRING_SECURITY_CONTEXT") != null ? "Usuario autenticado" : "Invitado");
        return "home";
    }
}
