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

import com.clubnautico.tarea.modelo.Barco;
import com.clubnautico.tarea.servicio.BarcoServicio;

@RestController
@RequestMapping("/barco")
public class BarcoControlador {
	@Autowired
	BarcoServicio barcoService;

	// Obtener todos los barcos
	@GetMapping
	public ResponseEntity<Collection<Barco>> obtenerBarcos() {
		Collection<Barco> barcos = barcoService.getAll();
		return new ResponseEntity<>(barcos, HttpStatus.OK);
	}

	// Obtener un barco por ID
	@GetMapping("/{id}")
	public ResponseEntity<Barco> obtenerBarcoPorId(@PathVariable Long id) {
		Barco barco = barcoService.getById(id);
		return barco != null ? new ResponseEntity<>(barco, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Crear un nuevo barco
	@PostMapping
	public ResponseEntity<Barco> crearBarco(@RequestBody Barco barco) {
		Barco nuevoBarco = barcoService.create(barco);
		return new ResponseEntity<>(nuevoBarco, HttpStatus.CREATED);
	}

	// Actualizar un barco existente
	@PutMapping("/{id}")
	public ResponseEntity<Barco> actualizarBarco(@PathVariable Long id, @RequestBody Barco Barco) {
		Barco BarcoActualizado = barcoService.update(Barco);
		return BarcoActualizado != null ? new ResponseEntity<>(BarcoActualizado, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Eliminar un barco por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarBarco(@PathVariable Long id) {
		barcoService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
