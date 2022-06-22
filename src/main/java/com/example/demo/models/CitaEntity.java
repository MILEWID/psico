package com.example.demo.models;

import javax.persistence.*;

@Entity

@Table(name="cita")

public class CitaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	
	private Long idCita;
	private Long idHorario;
	private Long idPersona;
	private Long idHistoriaClinica;
	public Long getIdCita() {
		return idCita;
	}
	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}
	public Long getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(Long idHorario) {
		this.idHorario = idHorario;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public Long getIdHistoriaClinica() {
		return idHistoriaClinica;
	}
	public void setIdHistoriaClinica(Long idHistoriaClinica) {
		this.idHistoriaClinica = idHistoriaClinica;
	}
	

}
