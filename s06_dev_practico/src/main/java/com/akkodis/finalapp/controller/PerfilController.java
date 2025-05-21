package com.akkodis.finalapp.controller;

import com.akkodis.finalapp.model.Usuario;
import com.akkodis.finalapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PerfilController {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @GetMapping("/perfil")
    public String verPerfil(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        Optional<Usuario> usuario = usuarioRepo.findByCorreo(userDetails.getUsername());
        usuario.ifPresent(u -> model.addAttribute("usuario", u));
        return "perfil";
    }

    @GetMapping("/editar")
    public String editarPerfil(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        Optional<Usuario> usuario = usuarioRepo.findByCorreo(userDetails.getUsername());
        usuario.ifPresent(u -> model.addAttribute("usuario", u));
        return "editarPerfil";
    }

    @PostMapping("/editar")
    public String guardarPerfil(@ModelAttribute("usuario") Usuario usuario) {
        usuarioRepo.save(usuario);
        return "redirect:/perfil";
    }
}
