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
@Table(name = "paciente")
public class pacienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idPaciente;
 //   private Long ocupacion;
    private Long tipo_usuario;
    private Long cita_medica;
    private String telefono;
    private Long alergia;
    private Long trastorno;
    
    @OneToOne(mappedBy = "idPaciente")
    private historia_clinicaEntity idHistoria_Clinica;
    
    @OneToOne(mappedBy = "idMedico")
        private conflictoEntity conflicto;
    
    @OneToMany(mappedBy = "paciente")
    private List<ocupacionEntity> ocupacion;

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Long tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Long getCita_medica() {
        return cita_medica;
    }

    public void setCita_medica(Long cita_medica) {
        this.cita_medica = cita_medica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getAlergia() {
        return alergia;
    }

    public void setAlergia(Long alergia) {
        this.alergia = alergia;
    }

    public Long getTrastorno() {
        return trastorno;
    }

    public void setTrastorno(Long trastorno) {
        this.trastorno = trastorno;
    }

    public historia_clinicaEntity getIdHistoria_Clinica() {
        return idHistoria_Clinica;
    }

    public void setIdHistoria_Clinica(historia_clinicaEntity idHistoria_Clinica) {
        this.idHistoria_Clinica = idHistoria_Clinica;
    }

    public conflictoEntity getConflicto() {
        return conflicto;
    }

    public void setConflicto(conflictoEntity conflicto) {
        this.conflicto = conflicto;
    }

    public List<ocupacionEntity> getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(List<ocupacionEntity> ocupacion) {
        this.ocupacion = ocupacion;
    }


    
}
