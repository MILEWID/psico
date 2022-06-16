/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "ocupacion")
public class ocupacionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long idocupacion;
	private String idpersona;
	private Long idasistente;
	private Long idadministrador;
	private String idpaciente;
	private Long idmedico;
	private String descripcion;
	public Long getIdocupacion() {
		return idocupacion;
	}
	public void setIdocupacion(Long idocupacion) {
		this.idocupacion = idocupacion;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public Long getIdasistente() {
		return idasistente;
	}
	public void setIdasistente(Long idasistente) {
		this.idasistente = idasistente;
	}
	public Long getIdadministrador() {
		return idadministrador;
	}
	public void setIdadministrador(Long idadministrador) {
		this.idadministrador = idadministrador;
	}
	public String getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(String idpaciente) {
		this.idpaciente = idpaciente;
	}
	public Long getIdmedico() {
		return idmedico;
	}
	public void setIdmedico(Long idmedico) {
		this.idmedico = idmedico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
