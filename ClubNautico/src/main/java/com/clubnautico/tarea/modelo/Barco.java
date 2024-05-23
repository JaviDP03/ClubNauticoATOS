package com.clubnautico.tarea.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Barco {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private char matricula;
	private String nombre;
	private int numeroAmarre;
	private float cuota;

	// Constructor
	public Barco(Long id, char matricula, String nombre, int numeroAmarre, float cuota) {
		this.id = id;
		this.matricula = matricula;
		this.nombre = nombre;
		this.numeroAmarre = numeroAmarre;
		this.cuota = cuota;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public char getMatricula() {
		return matricula;
	}

	public void setMatricula(char matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroAmarre() {
		return numeroAmarre;
	}

	public void setNumeroAmarre(int numeroAmarre) {
		this.numeroAmarre = numeroAmarre;
	}

	public float getCuota() {
		return cuota;
	}

	public void setCuota(float cuota) {
		this.cuota = cuota;
	}

	// toString
	public String toString() {
		return "Barco [id=" + id + ", matricula=" + matricula + ", nombre=" + nombre + ", numeroAmarre=" + numeroAmarre
				+ ", cuota=" + cuota + "]";
	}

}
