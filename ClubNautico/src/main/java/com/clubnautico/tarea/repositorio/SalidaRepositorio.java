package com.clubnautico.tarea.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubnautico.tarea.modelo.Salida;

@Repository
public interface SalidaRepositorio extends JpaRepository<Salida, Long> {

}
