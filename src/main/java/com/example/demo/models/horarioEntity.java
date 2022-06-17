package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

import com.example.demo.models.CitaMedicaEntity;

@Entity
@Table(name="horario")

public class horarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fecha")
	private Date fecha = new Date();
	
	@ManyToOne
	@JoinColumn(name = "hora")
	private String hora;
	
	@OneToOne(mappedBy="id")	
	private CitaMedicaEntity  citaMedica;
	
	@OneToOne(mappedBy="idMedico")
	private medicoEntity medico;
	
	private Long idEstado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public CitaMedicaEntity getCitaMedica() {
		return citaMedica;
	}
	public void setCitaMedica(CitaMedicaEntity citaMedica) {
		this.citaMedica = citaMedica;
	}
	public medicoEntity getMedico() {
		return medico;
	}
	public void setMedico(medicoEntity medico) {
		this.medico = medico;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	

}
