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
@Table (name = "GrupoFamiliar")
public class Grupo_FamiliarEntity { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private String familiaOrigen;
    private String familiaPropio;
	public String getFamiliaOrigen() {
		return familiaOrigen;
	}
	public void setFamiliaOrigen(String familiaOrigen) {
		this.familiaOrigen = familiaOrigen;
	}
	public String getFamiliaPropio() {
		return familiaPropio;
	}
	public void setFamiliaPropio(String familiaPropio) {
		this.familiaPropio = familiaPropio;
	}


}