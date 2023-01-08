package com.backend.portfolioWeb.controller;

import com.backend.portfolioWeb.model.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    List<Persona> listaPersonas=new ArrayList<>();

    @GetMapping("/hola/{nombre}")
    public String saludarHola(@PathVariable String nombre){
        return "Hola "+nombre+ "!!!";
    }

    @GetMapping("/chau")
    public String saludarChau(@RequestParam String nombre){
        return "Chau "+nombre+"!!!";
    }

    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        listaPersonas.add(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return listaPersonas;
    }

}