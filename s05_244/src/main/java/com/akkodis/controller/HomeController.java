package com.akkodis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String redirigirInicio() {
        return "redirect:/inicio";
    }

    @GetMapping("/inicio")
    public String home() {
        return "inicio";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    
    @GetMapping("/sesion")
    public String login() {
        return "sesion";
    }
}