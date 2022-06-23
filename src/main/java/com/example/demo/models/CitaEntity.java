package com.example.demo.models;

import javax.persistence.*;

@Entity

@Table(name="cita")

public class CitaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	
	private Long idCita;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idHorario", referencedColumnName="idHorario")
	private HorarioEntity idHorario;
	
	@ManyToOne
	@JoinColumn(name="idPersona")
	private PersonaEntity idPersona;
	
	@ManyToOne
	@JoinColumn(name="historiaclin")
	private Historia_ClinicaEntity idHistoriaClinica;
	
	public Long getIdCita() {
		return idCita;
	}
	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}
	public HorarioEntity getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(HorarioEntity idHorario) {
		this.idHorario = idHorario;
	}
	
	public Historia_ClinicaEntity getIdHistoriaClinica() {
		return idHistoriaClinica;
	}
	public void setIdHistoriaClinica(Historia_ClinicaEntity idHistoriaClinica) {
		this.idHistoriaClinica = idHistoriaClinica;
	}
	public PersonaEntity getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(PersonaEntity idPersona) {
		this.idPersona = idPersona;
	}
	
	
	

}
