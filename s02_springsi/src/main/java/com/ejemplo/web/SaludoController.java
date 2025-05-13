package com.ejemplo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoController {

  @GetMapping("/saludo")
  public String saludar(Model modelo) {
    modelo.addAttribute("nombre", "Marc");
    return "saludo"; // Vista llamada saludo.jsp
  }
}
