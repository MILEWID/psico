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
@Table(name = "conflicto")
public class conflictoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long idConflicto;
    private int idPaciente;
    private String descripcion;

    public Long getIdConflicto() {
        return idConflicto;
    }

    public void setIdConflicto(Long idConflicto) {
        this.idConflicto = idConflicto;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
