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
@Table (name = "anamnesis")
public class AnamnesisEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idAnamnesis;
    private Long id_seguimiento;
    private int edad;
    private String descripcion;

    public Long getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(Long idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
    }

    public Long getId_seguimiento() {
        return id_seguimiento;
    }

    public void setId_seguimiento(Long id_seguimiento) {
        this.id_seguimiento = id_seguimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<SeguimientoEdadesEntity> getSeguimientos() {
        return seguimientos;
    }

    public void setSeguimientos(List<SeguimientoEdadesEntity> seguimientos) {
        this.seguimientos = seguimientos;
    }
        
}
