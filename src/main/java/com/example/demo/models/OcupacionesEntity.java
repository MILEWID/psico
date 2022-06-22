package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="ocupacion")

public class OcupacionesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long idOcupacion;
	
	private String descripcion;

	public Long getIdOcupacion() {
		return idOcupacion;
	}

	public void setIdOcupacion(Long idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
