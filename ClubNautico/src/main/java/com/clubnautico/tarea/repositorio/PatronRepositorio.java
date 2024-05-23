package com.clubnautico.tarea.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubnautico.tarea.modelo.Patron;

@Repository
public interface PatronRepositorio extends JpaRepository<Patron, Long> {

}
