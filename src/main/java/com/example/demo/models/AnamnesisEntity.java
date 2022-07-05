/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import java.util.List;
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
    private int edad;
    private String descripcion;
    
    @OneToOne(mappedBy = "idAnamnesis")
    private Historia_ClinicaEntity idHistoriaClinica;
    
    @OneToMany(mappedBy = "id_seguimiento")
    private List<SeguimientoEdadesEntity> seguimientos;

    public Long getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(Long idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
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
