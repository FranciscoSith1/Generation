package com.equipouno.practicando.controllers;

import com.equipouno.practicando.models.Cliente;
import com.equipouno.practicando.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @RequestMapping("")
    public String cliente(@ModelAttribute("cliente") Cliente cliente){
        return "usuario.jsp";
    }

    /*@PostMapping("/login")
    public String login(@Valid @ModelAttribute("cliente") Cliente cliente,
                        BindingResult result,
                        Model model){

    }*/
}
