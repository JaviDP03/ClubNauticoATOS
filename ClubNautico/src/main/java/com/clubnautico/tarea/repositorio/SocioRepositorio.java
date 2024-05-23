package com.clubnautico.tarea.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubnautico.tarea.modelo.Socio;

@Repository
public interface SocioRepositorio extends JpaRepository<Socio, Long> {

}
