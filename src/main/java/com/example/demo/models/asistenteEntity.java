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


    	public List<especialidadEntity> getEspecialidad() {
			return especialidad;
		}
		public void setEspecialidad(List<especialidadEntity> especialidad) {
			this.especialidad = especialidad;
		}
		
    	
    	 @OneToMany(mappedBy = "asist")
    	 private List<especialidadEntity>  especialidad;
    	
    	 public void setOcupacion(List<ocupacionEntity> ocupacion) {
			this.ocupacion = ocupacion;
		}
		@OneToOne(mappedBy = "asiste")
    	 private List<ocupacionEntity>  ocupacion;
    	 
    	 @OneToOne(mappedBy = "asisten")
    	 private List<tipousuarioEntity>  tipo_usuario;
    	 
		public Long getIdasistente() {
			return idasistente;
		}
		public void setIdasistente(Long idasistente) {
			this.idasistente = idasistente;
		}

		public List<ocupacionEntity> getOcupacion() {
			return ocupacion;
		}
        
}

