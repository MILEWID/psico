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
	private int idMedico;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private int idPaciente;
	
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
        return (Date) fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = (List<horarioEntity>) fecha;
    }
	public List<horarioEntity> getHora() {
		return hora;
	}
	public void setHora(List<horarioEntity> hora) {
		this.hora = hora;
	}
	
	
}
