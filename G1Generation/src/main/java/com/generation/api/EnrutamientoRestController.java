package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrutamientoRestController {

    /**
     * Enrutamiento --> Establecer URL
     */
    //http://localhost:8080/usuario
    @RequestMapping("/usuario")
    public String usuario() {
        return "estamos en la url usuario";
    }

    @RequestMapping("/usuario/inscrito")
    public String inscrito() {
        return "estamos en la url usuario/inscrito";
    }

    @RequestMapping("/cliente/registrado")
    public String cliente() {
        return "estamos en la url cliente";
    }

    @RequestMapping(value = "/proveedor/registrado", method = RequestMethod.GET)
    public String proveedor() {
        return "ruta de proveedor";
    }
}



