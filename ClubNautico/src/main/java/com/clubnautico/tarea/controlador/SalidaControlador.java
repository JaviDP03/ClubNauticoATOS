package com.clubnautico.tarea.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clubnautico.tarea.servicio.SalidaServicio;

@Controller
public class SalidaControlador {
	@Autowired
	private SalidaServicio salidaService;
	
}
