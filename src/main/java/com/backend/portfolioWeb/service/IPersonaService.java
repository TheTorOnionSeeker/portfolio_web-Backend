package com.backend.portfolioWeb.service;

import com.backend.portfolioWeb.model.Persona;

import java.util.List;

public interface IPersonaService {

    public void crearPersona(Persona per);
    public List<Persona> verPersonas();
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}