package com.example.backlenguajesformales.services;

import com.example.backlenguajesformales.entities.Jurado;
import com.example.backlenguajesformales.repositories.IARepositoryJurado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuradoServices {



    private IARepositoryJurado iaRepositoryJurado;


    public Jurado saveJurado(Jurado jurado){
        iaRepositoryJurado.save(jurado);
        return jurado;
    }

    public List<Jurado> listJurados(){
        return iaRepositoryJurado.findAll();
    }





}
