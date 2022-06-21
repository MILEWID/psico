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
@Table (name = "FuncionPsiquica")
public class Funcion_PsiquicaEntity { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long orientacion;
    private String telefono;
    private String conciencia;
    private String sensopercepcion;
    private String memoria;
    private String pensamiento;
    private String lenguaje;
    private String inteligencia;

    public Long getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Long orientacion) {
        this.orientacion = orientacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getConciencia() {
        return conciencia;
    }

    public void setConciencia(String conciencia) {
        this.conciencia = conciencia;
    }

    public String getSensopercepcion() {
        return sensopercepcion;
    }

    public void setSensopercepcion(String sensopercepcion) {
        this.sensopercepcion = sensopercepcion;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPensamiento() {
        return pensamiento;
    }

    public void setPensamiento(String pensamiento) {
        this.pensamiento = pensamiento;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }
    
}
