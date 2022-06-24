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
	@JoinColumn(name="idHistoriaClinica")
	private Historia_ClinicaEntity historiaclin;
	
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
	
	public Historia_ClinicaEntity getHistoriaclin() {
		return historiaclin;
	}
	public void setHistoriaclin(Historia_ClinicaEntity historiaclin) {
		this.historiaclin = historiaclin;
	}
	public PersonaEntity getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(PersonaEntity idPersona) {
		this.idPersona = idPersona;
	}
	
	
	

}
