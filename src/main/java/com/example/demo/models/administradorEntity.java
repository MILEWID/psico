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
	 		 
    @OneToOne(mappedBy = "administrador")
    private tipousuarioEntity tipousuario;

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public tipousuarioEntity getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(tipousuarioEntity tipousuario) {
        this.tipousuario = tipousuario;
    }

   
 
   

}
