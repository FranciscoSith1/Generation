package com.generation.services;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/** Logica de negocio, o validaciones del sistmea */

@Service
public class UsuarioService {
    /** llamar al Repository (inyeccion de dependencias) */
    @Autowired
    UsuarioRepository usuarioRepository;

    public void saveUsuario(@Valid Usuario usuario) {

        usuarioRepository.save(usuario);

    }

}
