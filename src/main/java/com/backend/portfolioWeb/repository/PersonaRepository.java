package com.backend.portfolioWeb.repository;

import com.backend.portfolioWeb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
