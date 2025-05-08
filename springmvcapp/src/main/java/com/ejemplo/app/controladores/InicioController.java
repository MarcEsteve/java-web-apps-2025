package com.ejemplo.app.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    @GetMapping("/inicio")
    public String inicio(Model modelo) {
        modelo.addAttribute("mensaje", "¡Hola desde Spring MVC!");
        return "inicio";
    }
}	
// Este controlador maneja la ruta "/inicio" y devuelve la vista "inicio" con un mensaje.