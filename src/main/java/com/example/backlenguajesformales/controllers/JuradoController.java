package com.example.backlenguajesformales.controllers;

import com.example.backlenguajesformales.entities.Jurado;
import com.example.backlenguajesformales.services.JuradoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jurado")
public class JuradoController {


    @Autowired
    private JuradoServices juradoServices;


    @GetMapping("/listJurados")
    public List<Jurado> listJurados(){
        return juradoServices.listJurados();
    }

}
