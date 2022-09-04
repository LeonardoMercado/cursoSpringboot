package com.leonardo.cursoSpringboot.controllers;

import com.leonardo.cursoSpringboot.dao.UsuarioDao;
import com.leonardo.cursoSpringboot.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuario();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable int id){
        Usuario usuario = new Usuario(id,"Leonardo","Mercado","3185262110","lfmercadobe@unal.edu.co","123456");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable int id){
        usuarioDao.deleteUsuario(id);
    }



}
