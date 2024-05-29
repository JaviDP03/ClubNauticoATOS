package com.clubnautico.tarea.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Salida {
	// Propiedades de la instancia
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private LocalDate fecha;
	private String destino;

	@ManyToOne
	@JoinColumn(name = "fk_id_patron")
	private Patron patron;

	// Constructor
	public Salida() {
	}

	public Salida(Long id, LocalDate fecha, String destino) {
		this.id = id;
		this.fecha = fecha;
		this.destino = destino;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	// toString
	public String toString() {
		return "Salida [id=" + id + ", fecha=" + fecha + ", destino=" + destino + "]";
	}

}
