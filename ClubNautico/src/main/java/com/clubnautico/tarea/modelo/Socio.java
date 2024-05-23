package com.clubnautico.tarea.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Socio {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private char dni;
	private String nombre;
	private String direccion;
	private LocalDate fechaNac;
	private char sexo;

	// Constructor
	public Socio(Long id, char dni, String nombre, String direccion, LocalDate fechaNac, char sexo) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// toString
	public String toString() {
		return "Socio [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaNac="
				+ fechaNac + ", sexo=" + sexo + "]";
	}

}
