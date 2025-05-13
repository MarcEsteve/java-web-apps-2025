package com.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("mensaje", "¡Hola desde Spring MVC con solo anotaciones!");
        model.addAttribute("nombre", "Marc");
        return "saludo";
    }
}
