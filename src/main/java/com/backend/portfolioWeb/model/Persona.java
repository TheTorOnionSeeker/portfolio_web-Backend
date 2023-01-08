package com.backend.portfolioWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String apellido;

    public Persona(){}

    public Persona(Long id, String nombre, String apellido){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }
}
