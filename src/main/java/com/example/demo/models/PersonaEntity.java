/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author USUARIO
 */
@Entity
@Table (name = "Persona")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idPersona;
    
    @OneToOne(mappedBy = "idPersona")
    private Historia_ClinicaEntity idHistoriaClinica;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idNombre", referencedColumnName = "idNombre")
    private PersonaNombreEntity idNombre;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date fechaNacimiento;
    private String genero;
    private String estadoCivil;
    private String religion;
    private String correo;
    
    @OneToMany(mappedBy = "idPersona")
    private List<ContactosEntity> contactos;
    
    @OneToMany(mappedBy="idPersona")
    private List<CitaEntity> cita;

    @ManyToOne
    @JoinColumn(name = "idTipoUsuario")
    private TipoUsuarioEntity idTipoUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDireccion", referencedColumnName = "idDireccion")
    private PersonaDireccionEntity idDireccion;

    
