package com.generation.controllers;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    //inyeccion de dependencias
    @Autowired
    UsuarioService usuarioService;

    //Ruta para desplegar el jsp
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario")Usuario usuario){
        //pasamos el objeto vacio
        return "registro.jsp"; //la pagina a desplegar
    }

    //rut para capturar los datos del formulario
    @PostMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam(value="nombre") String nombre,
                                  @RequestParam(value="apellido") String apellido,
                                  @RequestParam(value="edad") String edad){
        System.out.println("Estamos en el metodo de registro usuario " + nombre + " " + apellido + " " + edad);
        return "registro.jsp"; //la pagina a desplegar
    }

    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario")Usuario usuario,
                                 BindingResult resultado,
                                 Model model){

        if(resultado.hasErrors()){ //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "registro.jsp";
        }else {

            //capturamos el objeto con los atributos llenos
            System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getEdad());

            //enviar el objeto al service
            usuarioService.saveUsuario(usuario);
            //List<Usuario> listaUsuarios =
            return "tablaUsuarios.jsp"; //la pagina a desplegar
        }
    }

}
