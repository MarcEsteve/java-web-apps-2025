package com.akkodis.controller;

import com.akkodis.model.Contacto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    
    @GetMapping("/")
    public String redirigirInicio() {
        return "redirect:/inicio";
    }
    
    @GetMapping("/inicio")
    public String inicio() {
        return "index";
    }


    @GetMapping("/servicios")
    public String servicios() {
        return "servicios";
    }
    
    @GetMapping("/somos")
    public String somos() {
        return "somos";
    }

    @GetMapping("/contacto")
    public String contactoForm(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "contacto";
    }

    @PostMapping("/contacto")
    public String enviarFormulario(@ModelAttribute Contacto contacto, Model model) {
        model.addAttribute("nombre", contacto.getNombre());
        return "gracias";
    }

}
