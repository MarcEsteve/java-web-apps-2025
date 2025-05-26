package com.akkodis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.akkodis.model.Usuario;

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
    
    @GetMapping("/login")
    public String login(Model model) {
    	model.addAttribute("usuario", new Usuario());
        return "login";
    }
    
//	@PostMapping
//    public String procesarLogin(@ModelAttribute("usuario") Usuario usuario, Model model) {
//        // Validación básica: usuario = admin, contraseña = 1234
//        if ("Marc".equals(usuario.getName()) && "123456".equals(usuario.getPass())) {
//            model.addAttribute("name", usuario.getName());
//            return "bienvenido";
//        } else {
//            model.addAttribute("mensaje", "Nombre de usuario o contraseña incorrectos.");
//            return "login";
//        }
//    }


//    @GetMapping("/servicios")
//    public String servicios() {
//        return "servicios";
//    }
//    
//    @GetMapping("/somos")
//    public String somos() {
//        return "somos";
//    }


}
