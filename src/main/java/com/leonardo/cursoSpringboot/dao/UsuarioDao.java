package com.leonardo.cursoSpringboot.dao;

import com.leonardo.cursoSpringboot.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void deleteUsuario(int id);

    Usuario getUsuario(int id);
}
