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
@Table (name = "HistoriaEnfermedad")
public class Historia_EnfermedadEntity { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idHistoriaEnfermedad;
    private String descripcion;

    public Long getIdHistoriaEnfermedad() {
        return idHistoriaEnfermedad;
    }

    public void setIdHistoriaEnfermedad(Long idHistoriaEnfermedad) {
        this.idHistoriaEnfermedad = idHistoriaEnfermedad;
    }


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
//AASFSDF
}