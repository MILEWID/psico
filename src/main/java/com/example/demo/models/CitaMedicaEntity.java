package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="cita_medica")
public class CitaMedicaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idMedico")
	private medicoEntity medico;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private pacienteEntity paciente;
	
	@OneToMany(mappedBy="fecha")
	private List<horarioEntity>  fecha;

	
	@OneToMany(mappedBy="hora")
	private List<horarioEntity>  hora;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public medicoEntity getMedico() {
		return medico;
	}
	public void setMedico(medicoEntity medico) {
		this.medico = medico;
	}
	public pacienteEntity getPaciente() {
		return paciente;
	}
	public void setPaciente(pacienteEntity paciente) {
		this.paciente = paciente;
	}
	public List<horarioEntity> getFecha() {
		return fecha;
	}
	public void setFecha(List<horarioEntity> fecha) {
		this.fecha = fecha;
	}
	public List<horarioEntity> getHora() {
		return hora;
	}
	public void setHora(List<horarioEntity> hora) {
		this.hora = hora;
	}
	
	
}
