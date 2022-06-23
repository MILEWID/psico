/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author USUARIO
 */

@Entity
@Table (name = "TipoUsuario")
public class TipoUsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idTipoUsuario;
    private String descripcion;

    @OneToMany(mappedBy = "idTipoUsuario")
    private List<PersonaEntity> persona;

    public Long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<PersonaEntity> getPersona() {
        return persona;
    }

    public void setPersona(List<PersonaEntity> persona) {
        this.persona = persona;
    }
}
