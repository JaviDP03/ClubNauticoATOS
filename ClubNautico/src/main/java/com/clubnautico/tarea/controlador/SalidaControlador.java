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

import com.clubnautico.tarea.modelo.Salida;
import com.clubnautico.tarea.servicio.SalidaServicio;

@RestController
@RequestMapping("/salida")
public class SalidaControlador {
	@Autowired
	SalidaServicio salidaService;

	// Obtener todos los salidas
	@GetMapping
	public ResponseEntity<Collection<Salida>> obtenerSalidas() {
		Collection<Salida> salidas = salidaService.getAll();
		return new ResponseEntity<>(salidas, HttpStatus.OK);
	}

	// Obtener un salida por ID
	@GetMapping("/{id}")
	public ResponseEntity<Salida> obtenerSalidaPorId(@PathVariable Long id) {
		Salida salida = salidaService.getById(id);
		return salida != null ? new ResponseEntity<>(salida, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Crear un nuevo salida
	@PostMapping
	public ResponseEntity<Salida> crearSalida(@RequestBody Salida salida) {
		Salida nuevoSalida = salidaService.create(salida);
		return new ResponseEntity<>(nuevoSalida, HttpStatus.CREATED);
	}

	// Actualizar un salida existente
	@PutMapping("/{id}")
	public ResponseEntity<Salida> actualizarSalida(@PathVariable Long id, @RequestBody Salida salida) {
		Salida SalidaActualizado = salidaService.update(salida);
		return SalidaActualizado != null ? new ResponseEntity<>(SalidaActualizado, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Eliminar un salida por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarSalida(@PathVariable Long id) {
		salidaService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
