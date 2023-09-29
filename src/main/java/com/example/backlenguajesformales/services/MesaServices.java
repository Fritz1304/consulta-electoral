package com.example.backlenguajesformales.services;

import com.example.backlenguajesformales.entities.Mesa;
import com.example.backlenguajesformales.repositories.IARepositoryMesa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaServices {

    private IARepositoryMesa iaRepositoryMesa;


    public List<Mesa> listMesas(){
        return iaRepositoryMesa.findAll();
    }


}
