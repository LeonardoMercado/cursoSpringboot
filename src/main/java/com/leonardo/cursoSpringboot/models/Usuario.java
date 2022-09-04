package com.leonardo.cursoSpringboot.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "password")
    private String password;

    public Usuario() {};

    public Usuario(int id, String nombre, String apellido,String telefono, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

}
