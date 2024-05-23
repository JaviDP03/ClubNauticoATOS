package com.clubnautico.tarea.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clubnautico.tarea.servicio.PatronServicio;

@Controller
public class PatronControlador {
	@Autowired
	private PatronServicio patronService;
	
}
