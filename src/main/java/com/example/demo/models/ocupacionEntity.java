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
	
	 @OneToOne
	 @JoinColumn(name = "asiste")
	 private List<asistenteEntity>  asiste;
	 
	 @OneToOne
	 @JoinColumn(name = "admin")
	 private List<administradorEntity> administrador;
	 
	 public List<pacienteEntity> getPaciente() {
		return paciente;
	}
	public void setPaciente(List<pacienteEntity> paciente) {
		this.paciente = paciente;
	}
	@ManyToOne
	 @JoinColumn(name = "pacie")
	 private List<pacienteEntity> paciente;
	 
	public List<administradorEntity> getAdministrador() {
		return administrador;
	}
	public void setAdministrador(List<administradorEntity> administrador) {
		this.administrador = administrador;
	}
	public Long getIdocupacion() {
		return idocupacion;
	}
	public List<asistenteEntity> getAsiste() {
		return asiste;
	}
	public void setAsiste(List<asistenteEntity> asiste) {
		this.asiste = asiste;
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
}
