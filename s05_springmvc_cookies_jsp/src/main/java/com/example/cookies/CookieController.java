package com.example.cookies;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

    @GetMapping("/")
    public String mostrarHome(HttpServletRequest request, Model model) {
        String usuario = "invitado";
        if (request.getCookies() != null) {
            for (Cookie c : request.getCookies()) {
                if ("usuario".equals(c.getName())) {
                    usuario = c.getValue();
                }
            }
        }
        model.addAttribute("usuario", usuario);
        return "index";
    }

    @GetMapping("/setcookie")
    public String establecerCookie(HttpServletResponse response) {
        Cookie c = new Cookie("usuario", "Marc");
        c.setMaxAge(3600); // 1 hora
        response.addCookie(c);
        return "redirect:/";
    }
}
