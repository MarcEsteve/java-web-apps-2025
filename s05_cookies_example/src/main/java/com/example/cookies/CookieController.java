package com.example.cookies;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class CookieController {

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        String user = "invitado";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("usuario")) {
                    user = c.getValue();
                }
            }
        }
        model.addAttribute("nombre", user);
        return "home";
    }

    @GetMapping("/setcookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("usuario", "Marc");
        cookie.setMaxAge(60 * 60); // 1 hora
        response.addCookie(cookie);
        return "redirect:/";
    }
}
