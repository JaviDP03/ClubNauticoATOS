package com.clubnautico.tarea.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubnautico.tarea.modelo.Barco;
import com.clubnautico.tarea.modelo.Socio;
import com.clubnautico.tarea.repositorio.BarcoRepositorio;

@Service
public class BarcoServicio {
	@Autowired
	private BarcoRepositorio barcoRepo;

	public Collection<Barco> getAll() {
		return barcoRepo.findAll();
	}
	
	public Barco getById(Long id) {
		Barco unBarco = barcoRepo.findById(id).orElse(null);
		
		return unBarco;
	}
	
	public Barco create(Barco item) {
		return barcoRepo.save(item);
	}
	
	public Barco update(Barco item) {
		return barcoRepo.save(item);
	}
	
	public void delete(Barco item) {
		barcoRepo.delete(item);
	}
	
	public void deleteById(Long id) {
		barcoRepo.deleteById(id);
	}
	
}
