package com.clubnautico.tarea.controlador;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clubnautico.tarea.modelo.Socio;
import com.clubnautico.tarea.servicio.SocioServicio;

@RestController
@RequestMapping("/socio")
public class SocioControlador {
	@Autowired
	SocioServicio socioService;

	// Obtener todos los socios
	@GetMapping
	public ResponseEntity<Collection<Socio>> obtenerTodosLosSocios() {
		Collection<Socio> socios = socioService.getAll();
		return new ResponseEntity<>(socios, HttpStatus.OK);
	}

	// Obtener un socio por ID
	@GetMapping("/{id}")
	public ResponseEntity<Socio> obtenerSocioPorId(@PathVariable Long id) {
		Socio socio = socioService.getById(id);
		return socio != null ? new ResponseEntity<>(socio, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Crear un nuevo socio
	@PostMapping
	public ResponseEntity<Socio> crearSocio(@RequestBody Socio socio) {
		Socio nuevoSocio = socioService.create(socio);
		return new ResponseEntity<>(nuevoSocio, HttpStatus.CREATED);
	}

	// Actualizar un socio existente
	@PutMapping("/{id}")
	public ResponseEntity<Socio> actualizarSocio(@PathVariable Long id, @RequestBody Socio socio) {
		Socio socioActualizado = socioService.update(socio);
		return socioActualizado != null ? new ResponseEntity<>(socioActualizado, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Eliminar un socio por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarSocio(@PathVariable Long id) {
		socioService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
