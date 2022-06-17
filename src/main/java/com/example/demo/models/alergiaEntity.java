package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alergia")

public class alergiaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	private Long id;	
	
	@ManyToOne
    @JoinColumn(name="idPaciente")
	private pacienteEntity paciente;
	
	
	private String descripcion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public pacienteEntity getPaciente() {
		return paciente;
	}
	public void setPaciente(pacienteEntity paciente) {
		this.paciente = paciente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
