package com.clubnautico.tarea.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubnautico.tarea.modelo.Patron;
import com.clubnautico.tarea.repositorio.PatronRepositorio;

@Service
public class PatronServicio {
	@Autowired
	private PatronRepositorio patronRepo;

	public Collection<Patron> getAll() {
		return patronRepo.findAll();
	}

	public Patron getById(Long id) {
		Patron unPatron = patronRepo.findById(id).orElse(null);

		return unPatron;
	}

	public Patron create(Patron item) {
		return patronRepo.save(item);
	}

	public Patron update(Patron item) {
		return patronRepo.save(item);
	}

	public void delete(Patron item) {
		patronRepo.delete(item);
	}

	public void deleteById(Long id) {
		patronRepo.deleteById(id);
	}

}
