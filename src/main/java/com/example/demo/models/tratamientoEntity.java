package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="tratamiento")

public class tratamientoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)

	private Long id;
	private Long idHistoriaClinica;
	private Long idPaciente;
	private String descripcion;
}
