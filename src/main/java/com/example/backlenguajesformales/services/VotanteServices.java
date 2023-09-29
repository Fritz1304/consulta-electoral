package com.example.backlenguajesformales.services;

import com.example.backlenguajesformales.entities.Votante;
import com.example.backlenguajesformales.repositories.IARepositoryVotante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotanteServices {

    private IARepositoryVotante iaRepositoryVotante;

    public List<Votante> listVotantes(){
        return iaRepositoryVotante.findAll();
    }


}
