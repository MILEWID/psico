/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table (name = "HistoriaSocial")
public class Historia_SocialEntity { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idHistoraSocial;
    private String descripcion;

    @OneToOne(mappedBy = "idHistoriaSocial")
    private Historia_ClinicaEntity idHistoriaClinica;
    
    public Historia_ClinicaEntity getIdHistoriaClinica() {
		return idHistoriaClinica;
	}

	public void setIdHistoriaClinica(Historia_ClinicaEntity idHistoriaClinica) {
		this.idHistoriaClinica = idHistoriaClinica;
	}

	public Long getIdHistoraSocial() {
        return idHistoraSocial;
    }

    public void setIdHistoraSocial(Long idHistoraSocial) {
        this.idHistoraSocial = idHistoraSocial;
    }



	public String getDescripcion() {
		
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

