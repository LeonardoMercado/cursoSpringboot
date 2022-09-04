package com.leonardo.cursoSpringboot.controllers;

import com.leonardo.cursoSpringboot.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario("Leonardo","Mercado","lfmercadobe@unal.edu.co","123456");
        return usuario;
    }

}
