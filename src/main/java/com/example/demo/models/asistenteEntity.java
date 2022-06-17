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
@Table(name = "asistente")
public class asistenteEntity {
    	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	
    	private Long idasistente;

    	 @OneToMany(mappedBy = "asist")
    	 private List<especialidadEntity>  especialidad;
    	
                @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ocupacion_id", referencedColumnName = "idOcupacion")
    private ocupacionEntity ocupacion;
    	 
    	 @OneToOne
    	    @JoinColumn(name = "ocup")
    	    private ocupacionEntity ocupa;
    	 
    	 
         
         @OneToOne(mappedBy = "asistente")
     private tipousuarioEntity  tipo_usuario;

    public Long getIdasistente() {
        return idasistente;
    }

    public void setIdasistente(Long idasistente) {
        this.idasistente = idasistente;
    }

    public List<especialidadEntity> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<especialidadEntity> especialidad) {
        this.especialidad = especialidad;
    }

    public ocupacionEntity getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(ocupacionEntity ocupacion) {
        this.ocupacion = ocupacion;
    }

    public ocupacionEntity getOcupa() {
        return ocupa;
    }

    public void setOcupa(ocupacionEntity ocupa) {
        this.ocupa = ocupa;
    }

    public tipousuarioEntity getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(tipousuarioEntity tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    	
        
}

