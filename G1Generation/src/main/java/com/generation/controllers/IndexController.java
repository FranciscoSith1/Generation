package com.generation.controllers;

import com.generation.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //http://localhost:8080/
    @RequestMapping("/") //ANOTACION PARA CAPTURAR RUTAS
    public String index(Model model) {
        model.addAttribute("apellidos", "Cid Segovia");
        model.addAttribute("Nombres", "Francisco Andres");
        model.addAttribute("Edad", 25);

        //Instancia de usuario
        //Usuario usuario = new Usuario("Donato", "Loren", 12, "Donato1234");
        //pasando el objeto a la vista (jsp)
        //model.addAttribute("usuario", usuario);

        return "index.jsp";
    }
}