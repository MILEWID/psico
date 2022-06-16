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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "estadocivil")
public class estadocivilEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long id;
	
	private String descripcion;
        
        // uno amuchos 
        @OneToMany(mappedBy = "estciv")
        private List<personaEntity>  persona;

    public estadocivilEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<personaEntity> getPersona() {
        return persona;
    }

    public void setPersona(List<personaEntity> persona) {
        this.persona = persona;
    }

    
    
}
