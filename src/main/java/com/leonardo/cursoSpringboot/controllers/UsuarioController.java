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
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuarios(@PathVariable int id){
        Usuario usuario = usuarioDao.getUsuario(id);
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable int id){
        usuarioDao.deleteUsuario(id);
    }



}
