package com.backend.portfolioWeb.service;

import com.backend.portfolioWeb.model.Persona;
import com.backend.portfolioWeb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public void crearPersona(Persona per){
        persoRepo.save(per);
    }

    @Override
    public List<Persona> verPersonas(){
        return persoRepo.findAll();
    }

    @Override
    public void borrarPersona(Long id){
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
}
