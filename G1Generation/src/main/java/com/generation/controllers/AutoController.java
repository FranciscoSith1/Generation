package com.generation.controllers;

import com.generation.models.Auto;
import com.generation.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/auto")
public class AutoController {

    @Autowired
    AutoService autoService;

    @RequestMapping("") //ANOTACION PARA CAPTURAR RUTAS
    public String inicio(@ModelAttribute("auto") Auto auto) {
        return "auto.jsp";

    }

    @PostMapping("/guardar")
    public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto,
                              BindingResult resultado,
                              Model model) {
        if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "auto.jsp";
        }else {
            autoService.guardarAuto(auto);

            List<Auto> listaAutos = autoService.findAll();

            model.addAttribute("autosCapturados", listaAutos);
            return "Autos2.jsp";
        }
    }
}

