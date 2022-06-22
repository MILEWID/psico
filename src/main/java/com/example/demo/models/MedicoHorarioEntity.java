package com.example.demo.models;

import javax.persistence.*;

@Entity

@Table(name="medico_horario")

public class MedicoHorarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long idMedicoHorario;
	
	private Long idMedico;
	private Long idHorario;
	public Long getIdMedicoHorario() {
		return idMedicoHorario;
	}
	public void setIdMedicoHorario(Long idMedicoHorario) {
		this.idMedicoHorario = idMedicoHorario;
	}
	public Long getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}
	public Long getIdHorario() {
		return idHorario;
	}
	public void setIdHorario(Long idHorario) {
		this.idHorario = idHorario;
	}
	
	
	//comentario para probar
	
	

}
