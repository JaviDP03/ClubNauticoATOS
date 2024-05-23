package com.clubnautico.tarea.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clubnautico.tarea.servicio.SocioServicio;

@Controller
@RequestMapping("/socio")
public class SocioControlador {
	@Autowired
	private SocioServicio socioService;

	@GetMapping("/")
	public String listarSocios(Model modelo) {
		modelo.addAttribute("listaSocios", socioService.getAll());
		return "socio/listar";
	}

}
