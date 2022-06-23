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
@Table (name = "seguimientoedades")
public class SeguimientoEdadesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_seguimiento;
    private String nombre;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "idAnamnesis")
    private AnamnesisEntity idAnamnesis;

    public Long getId_seguimiento() {
        return id_seguimiento;
    }

    public void setId_seguimiento(Long id_seguimiento) {
        this.id_seguimiento = id_seguimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AnamnesisEntity getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(AnamnesisEntity idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
    }

    
}
