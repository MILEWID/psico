/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//
//
//salvando el semestre
package com.example.demo.models;
import java.util.List;


import javax.persistence.*;

@Entity
@Table(name = "ocupacion")
public class ocupacionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long idocupacion;
	private String descripcion;
	
	@OneToOne(mappedBy = "ocupa")
    private asistenteEntity  asiste;
	 
	 @OneToOne(mappedBy = "admin")
     private administradorEntity  admin;
	 
	@ManyToOne
	 @JoinColumn(name = "paciente")
	 private pacienteEntity paciente;

	public Long getIdocupacion() {
		return idocupacion;
	}

	public void setIdocupacion(Long idocupacion) {
		this.idocupacion = idocupacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public asistenteEntity getAsiste() {
		return asiste;
	}

	public void setAsiste(asistenteEntity asiste) {
		this.asiste = asiste;
	}

	public administradorEntity getAdmin() {
		return admin;
	}

	public void setAdmin(administradorEntity admin) {
		this.admin = admin;
	}

	public pacienteEntity getPaciente() {
		return paciente;
	}

	public void setPaciente(pacienteEntity paciente) {
		this.paciente = paciente;
	}
	
}
