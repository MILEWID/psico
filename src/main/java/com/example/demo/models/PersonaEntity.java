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
    
    @ManyToOne
    @JoinColumn(name = "idOcupacion")
    private OcupacionesEntity idOcupacion;
    
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

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Historia_ClinicaEntity getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Historia_ClinicaEntity idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public PersonaNombreEntity getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(PersonaNombreEntity idNombre) {
        this.idNombre = idNombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<ContactosEntity> getContactos() {
        return contactos;
    }

    public void setContactos(List<ContactosEntity> contactos) {
        this.contactos = contactos;
    }

    public List<CitaEntity> getCita() {
        return cita;
    }

    public void setCita(List<CitaEntity> cita) {
        this.cita = cita;
    }

    public TipoUsuarioEntity getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TipoUsuarioEntity idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public PersonaDireccionEntity getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(PersonaDireccionEntity idDireccion) {
        this.idDireccion = idDireccion;
    }

    public OcupacionesEntity getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(OcupacionesEntity idOcupacion) {
        this.idOcupacion = idOcupacion;
    }
    
    

}
