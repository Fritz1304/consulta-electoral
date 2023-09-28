package com.example.backlenguajesformales.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name= "votante")
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

    public Votante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
}
