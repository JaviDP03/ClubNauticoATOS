package com.clubnautico.tarea.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubnautico.tarea.modelo.Socio;
import com.clubnautico.tarea.repositorio.SocioRepositorio;

@Service
public class SocioServicio {
	@Autowired
	private SocioRepositorio socioRepo;

	public Collection<Socio> getAll() {
		return socioRepo.findAll();
	}
	
	public Socio getById(Long id) {
		Socio unSocio = socioRepo.findById(id).orElse(null);
		
		return unSocio;
	}
	
	public Socio create(Socio item) {
		return socioRepo.save(item);
	}
	
	public Socio update(Socio item) {
		return socioRepo.save(item);
	}
	
	public void delete(Socio item) {
		socioRepo.delete(item);
	}
	
	public void deleteById(Long id) {
		socioRepo.deleteById(id);
	}
	
}
