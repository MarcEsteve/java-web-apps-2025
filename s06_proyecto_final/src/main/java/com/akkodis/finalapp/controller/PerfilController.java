package com.akkodis.finalapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.akkodis.finalapp.model.Usuario;

public class PerfilController {
	@GetMapping("/")
    public String redirigirInicio() {
        return "redirect:/perfil";
    }
    
    @GetMapping("/perfil")
    public String inicio() {
        return "perfil";
    }


    @PostMapping("/editar")
    public String editarUsuario(@ModelAttribute Usuario usuario) {
        usuario.setNombre("");
        return "perfil";
    }
}
