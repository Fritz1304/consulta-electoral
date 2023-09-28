package com.example.backlenguajesformales.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name= "VOTANTE")
public class Votante implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @Column(name = "id")
    private int id;

    @Column(name= "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "rol")
    private String rol;

    @Column(name = "table")
    private String table;

    @Column(name = "ubication")
    private String ubication;


}
