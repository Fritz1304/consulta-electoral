package com.example.backlenguajesformales.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name= "MESA")
public class Mesa implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @Column(name = "table")
    private int table;

    @Column(name= "ubication")
    private String ubication;


}
