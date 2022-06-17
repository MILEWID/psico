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
    private String descripcion;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id", referencedColumnName = "idPaciente")
        private pacienteEntity  idPaciente;

    public Long getIdConflicto() {
        return idConflicto;
    }

    public void setIdConflicto(Long idConflicto) {
        this.idConflicto = idConflicto;
    }

    public pacienteEntity getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(pacienteEntity idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
