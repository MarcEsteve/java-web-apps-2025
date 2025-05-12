package com.akkodis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akkodis.model.Usuario;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
    public String mostrarFormularioLogin(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login";
    }

	
	@PostMapping
    public String procesarLogin(@ModelAttribute("usuario") Usuario usuario, Model model) {
        // Validación básica: usuario = admin, contraseña = 1234
        if ("Marc".equals(usuario.getName()) && "123456".equals(usuario.getPass())) {
            model.addAttribute("name", usuario.getName());
            return "bienvenido";
        } else {
            model.addAttribute("mensaje", "Nombre de usuario o contraseña incorrectos.");
            return "login";
        }
    }


}
