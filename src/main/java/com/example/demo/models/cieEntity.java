/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table (name = "cie")
public class cieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idcie;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "id_diagnos")
    private diagnosticoEntity diag;

    public Long getIdcie() {
        return idcie;
    }

    public void setIdcie(Long idcie) {
        this.idcie = idcie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public diagnosticoEntity getDiag() {
        return diag;
    }

    public void setDiag(diagnosticoEntity diag) {
        this.diag = diag;
    }

 

 

   

}
