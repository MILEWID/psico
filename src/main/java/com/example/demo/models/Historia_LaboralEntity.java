
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
@Table (name = "HistoriaLaboral")
public class Historia_LaboralEntity { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idHistoriaLaboral;
    private String descripcion;
    
    @OneToOne(mappedBy = "idHistoriaLaboral")
    private Historia_ClinicaEntity idHistoriaClinica;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    public Long getIdHistoriaLaboral() {
        return idHistoriaLaboral;
    }

    public void setIdHistoriaLaboral(Long idHistoriaLaboral) {
        this.idHistoriaLaboral = idHistoriaLaboral;
    }


}
