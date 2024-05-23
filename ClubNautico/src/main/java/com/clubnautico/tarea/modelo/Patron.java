package com.clubnautico.tarea.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patron {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private char dni;
	private String nombre;
	private LocalDate fechaLicencia;

	// Constructor
	public Patron(Long id, char dni, String nombre, LocalDate fechaLicencia) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaLicencia = fechaLicencia;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public char getDni() {
		return dni;
	}

	public void setDni(char dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaLicencia() {
		return fechaLicencia;
	}

	public void setFechaLicencia(LocalDate fechaLicencia) {
		this.fechaLicencia = fechaLicencia;
	}

	// toString
	public String toString() {
		return "Patron [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", fechaLicencia=" + fechaLicencia + "]";
	}

}
