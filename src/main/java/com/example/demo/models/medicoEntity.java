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
@Table(name = "medico")
public class medicoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idMedico;
    private Long especialidad;
    private Long tipo_usuario;

    
    
    
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Long getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Long especialidad) {
        this.especialidad = especialidad;
    }

    public Long getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Long tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
        
}
