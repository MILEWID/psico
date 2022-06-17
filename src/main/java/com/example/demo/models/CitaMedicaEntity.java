package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cita_medica")
public class CitaMedicaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
	
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idMedico")
	private int idMedico;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private int idPaciente;
	
	@OneToMany(mappedBy="fecha")
	private Date fecha;
	
	@OneToMany(mappedBy="hora")
	private String hora;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(char idPaciente) {
		this.idPaciente = idPaciente;
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
	
}
