package com.example.backlenguajesformales.controllers;

import com.example.backlenguajesformales.entities.Jurado;
import com.example.backlenguajesformales.entities.Mesa;
import com.example.backlenguajesformales.services.JuradoServices;
import com.example.backlenguajesformales.services.MesaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaServices mesaServices;


    @GetMapping("/listMesas")
    public List<Mesa> listMesas(){
        return mesaServices.listMesas();
    }




}
