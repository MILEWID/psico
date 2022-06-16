/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "persona")
public class personaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long id;
	
	private String nombres;
        private String apellidos;
        // uno a muchos 
        private Long genero;
        // uno a muhcos 
        private Long ocupaion;
        private String direccion;
        private String telefono;
        private String correo;
        private Long tipouser;
        private String contrasena;
        // muchos a uno 

        @ManyToOne
        @JoinColumn(name = "id_estciv")
        private estadocivilEntity estciv;

    public personaEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getGenero() {
        return genero;
    }

    public void setGenero(Long genero) {
        this.genero = genero;
    }

    public Long getOcupaion() {
        return ocupaion;
    }

    public void setOcupaion(Long ocupaion) {
        this.ocupaion = ocupaion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getTipouser() {
        return tipouser;
    }

    public void setTipouser(Long tipouser) {
        this.tipouser = tipouser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public estadocivilEntity getEstciv() {
        return estciv;
    }

    public void setEstciv(estadocivilEntity estciv) {
        this.estciv = estciv;
    }

        
}
