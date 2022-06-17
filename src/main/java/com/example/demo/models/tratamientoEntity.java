package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="tratamiento")

public class tratamientoEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="idHistoriaClinica")
    private historia_clinicaEntity idHistoriaClinica;
    
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private historia_clinicaEntity idPaciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

    public historia_clinicaEntity getIdHistoriaClinica() {
		return idHistoriaClinica;
	}

	public void setIdHistoriaClinica(historia_clinicaEntity idHistoriaClinica) {
		this.idHistoriaClinica = idHistoriaClinica;
	}

	public historia_clinicaEntity getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(historia_clinicaEntity idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
}
