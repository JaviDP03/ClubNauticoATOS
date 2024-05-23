package com.clubnautico.tarea.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubnautico.tarea.modelo.Barco;

@Repository
public interface BarcoRepositorio extends JpaRepository<Barco, Long> {

}
