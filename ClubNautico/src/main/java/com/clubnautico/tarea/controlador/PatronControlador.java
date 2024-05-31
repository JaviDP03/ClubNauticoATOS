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

import com.clubnautico.tarea.modelo.Patron;
import com.clubnautico.tarea.servicio.PatronServicio;

@RestController
@RequestMapping("/patron")
public class PatronControlador {
	@Autowired
	PatronServicio patronService;

	// Obtener todos los patrones
	@GetMapping
	public ResponseEntity<Collection<Patron>> obtenerPatrones() {
		Collection<Patron> patrones = patronService.getAll();
		return new ResponseEntity<>(patrones, HttpStatus.OK);
	}

	// Obtener un patron por ID
	@GetMapping("/{id}")
	public ResponseEntity<Patron> obtenerPatronPorId(@PathVariable Long id) {
		Patron patron = patronService.getById(id);
		return patron != null ? new ResponseEntity<>(patron, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Crear un nuevo patron
	@PostMapping
	public ResponseEntity<Patron> crearPatron(@RequestBody Patron patron) {
		Patron nuevoPatron = patronService.create(patron);
		return new ResponseEntity<>(nuevoPatron, HttpStatus.CREATED);
	}

	// Actualizar un patron existente
	@PutMapping("/{id}")
	public ResponseEntity<Patron> actualizarPatron(@PathVariable Long id, @RequestBody Patron patron) {
		Patron patronActualizado = patronService.update(patron);
		return patronActualizado != null ? new ResponseEntity<>(patronActualizado, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Eliminar un patron por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarPatron(@PathVariable Long id) {
		patronService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
