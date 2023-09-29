package com.example.backlenguajesformales.controllers;

import com.example.backlenguajesformales.entities.Mesa;
import com.example.backlenguajesformales.entities.Votante;
import com.example.backlenguajesformales.services.VotanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/votante")
public class VotanteController {

    @Autowired
    private VotanteServices votanteServices;


    @GetMapping("/listVotante")
    public List<Votante> listVotante(){
        return votanteServices.listVotantes();
    }

}
