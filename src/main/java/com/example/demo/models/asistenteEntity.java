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
    	private Long ocupacion;
    	public List<especialidadEntity> getEspecialidad() {
			return especialidad;
		}
		public void setEspecialidad(List<especialidadEntity> especialidad) {
			this.especialidad = especialidad;
		}
		private Long tipo_usuario;
    	
    	 @OneToMany(mappedBy = "asist")
    	 private List<especialidadEntity>  especialidad;
    	
		public Long getIdasistente() {
			return idasistente;
		}
		public void setIdasistente(Long idasistente) {
			this.idasistente = idasistente;
		}
		public Long getOcupacion() {
			return ocupacion;
		}
		public void setOcupacion(Long ocupacion) {
			this.ocupacion = ocupacion;
		}

		public Long getTipo_usuario() {
			return tipo_usuario;
		}
		public void setTipo_usuario(Long tipo_usuario) {
			this.tipo_usuario = tipo_usuario;
		}

 
        
}

