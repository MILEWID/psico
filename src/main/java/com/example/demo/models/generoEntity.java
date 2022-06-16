package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
public class generoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idGenero;
    private String idPersona;
    private String descripcion;

    public Long getIdGenero() {
        return idGenero;
    }   
        
    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdPersona() {
        return idPersona;
    }   
        
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
    
    public String getDescripcion() {
        return descripcion;
    }   
        
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
