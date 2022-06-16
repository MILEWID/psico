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
@Table(name = "especialidad")
public class especialidadEntity {
    	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column(unique = true, nullable = false)
	private Long id;
	private String descripcion;
	
    @ManyToOne
    @JoinColumn(name = "id_asist")
    private asistenteEntity asist;

    public asistenteEntity getAsist() {
		return asist;
	}

	public void setAsist(asistenteEntity asist) {
		this.asist = asist;
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
        
}

//me quiero morir
//SE MURIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//ayudaaaaaaaaaaa
