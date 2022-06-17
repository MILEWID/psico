/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class administradorEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(unique = true, nullable = false)
	    private Long idAdministrador;
	 	
	 	
	 	@OneToOne(mappedBy = "admin")
		 private List<ocupacionEntity>  ocupacion;
		 
		 @OneToOne(mappedBy = "admini")
		 private List<tipousuarioEntity>  tipo_usuario;
		 
		public List<tipousuarioEntity> getTipo_usuario() {
			return tipo_usuario;
		}
		public void setTipo_usuario(List<tipousuarioEntity> tipo_usuario) {
			this.tipo_usuario = tipo_usuario;
		}
		public List<ocupacionEntity> getOcupacion() {
			return ocupacion;
		}
		public void setOcupacion(List<ocupacionEntity> ocupacion) {
			this.ocupacion = ocupacion;
		}
		public Long getIdAdministrador() {
			return idAdministrador;
		}
		public void setIdAdministrador(Long idAdministrador) {
			this.idAdministrador = idAdministrador;
		}

}
