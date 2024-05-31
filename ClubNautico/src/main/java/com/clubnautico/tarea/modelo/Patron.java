package com.clubnautico.tarea.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patron {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	private String nombre;
	private LocalDate fechaLicencia;

	@OneToMany(mappedBy = "patron", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Salida> salidas = new ArrayList<>();

	// Constructor
	public Patron() {
	}

	public Patron(Long id, String dni, String nombre, LocalDate fechaLicencia) {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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
