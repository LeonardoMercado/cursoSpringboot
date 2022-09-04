package com.leonardo.cursoSpringboot.controllers;

import com.leonardo.cursoSpringboot.dao.UsuarioDao;
import com.leonardo.cursoSpringboot.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuario();
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario usuario = new Usuario(id,"Leonardo","Mercado","3185262110","lfmercadobe@unal.edu.co","123456");
        return usuario;
    }

    @RequestMapping(value = "usuario/crear")
    public Usuario createUsuario(){
        Usuario usuario = new Usuario();

        return usuario;
    }

    @RequestMapping(value = "usuario/editar")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();

        return usuario;
    }

    @RequestMapping(value = "usuario/buscar")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();

        return usuario;
    }

    @RequestMapping(value = "usuario/eliminar")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();

        return usuario;
    }



}
