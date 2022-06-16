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
@Table(name = "paciente")
public class pacienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idPaciente;
    private Long idHistoria_Clinica;
    private String ocupacion;
    private Long tipo_usuario;
    private Long cita_medica;
    private String telefono;
    private Long alergia;
    private Long trastorno;
    private Long conflicto;

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdHistoria_Clinica() {
        return idHistoria_Clinica;
    }

    public void setIdHistoria_Clinica(Long idHistoria_Clinica) {
        this.idHistoria_Clinica = idHistoria_Clinica;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public Long getConflicto() {
        return conflicto;
    }

    public void setConflicto(Long conflicto) {
        this.conflicto = conflicto;
    }
    
    
    
}
