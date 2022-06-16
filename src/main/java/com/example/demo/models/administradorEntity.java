/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class administradorEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(unique = true, nullable = false)
	    private Long idAdministrador;
	 	private Long tipo_usuario;
	 	private Long ocupacion;
		public Long getIdAdministrador() {
			return idAdministrador;
		}
		public void setIdAdministrador(Long idAdministrador) {
			this.idAdministrador = idAdministrador;
		}
		public Long getTipo_usuario() {
			return tipo_usuario;
		}
		public void setTipo_usuario(Long tipo_usuario) {
			this.tipo_usuario = tipo_usuario;
		}
		public Long getOcupacion() {
			return ocupacion;
		}
		public void setOcupacion(Long ocupacion) {
			this.ocupacion = ocupacion;
		}



}
