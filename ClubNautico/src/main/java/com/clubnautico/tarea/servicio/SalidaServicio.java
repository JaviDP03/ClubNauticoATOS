package com.clubnautico.tarea.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubnautico.tarea.modelo.Salida;
import com.clubnautico.tarea.repositorio.SalidaRepositorio;

@Service
public class SalidaServicio {
	@Autowired
	private SalidaRepositorio salidaRepo;

	public Collection<Salida> getAll() {
		return salidaRepo.findAll();
	}

	public Salida getById(Long id) {
		Salida unSalida = salidaRepo.findById(id).orElse(null);

		return unSalida;
	}

	public Salida create(Salida item) {
		return salidaRepo.save(item);
	}

	public Salida update(Salida item) {
		return salidaRepo.save(item);
	}

	public void delete(Salida item) {
		salidaRepo.delete(item);
	}

	public void deleteById(Long id) {
		salidaRepo.deleteById(id);
	}

}
