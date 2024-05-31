package com.clubnautico.tarea.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Barco {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String matricula;
	private String nombre;
	private int numeroAmarre;
	private float cuota;

	@ManyToOne
	@JoinColumn(name = "id_socio")
	private Socio socio;

	// Constructor
	public Barco() {
	}

	public Barco(Long id, String matricula, String nombre, int numeroAmarre, float cuota) {
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
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
