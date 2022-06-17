/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "historiaclinica")
public class historia_clinicaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long idHistoriaClinica;
    private Date fecha = new Date();
    private String atencionprevia;
    
    @OneToMany(mappedBy = "histcli")
        private List<seguimientoEntity>  seguimiento;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id", referencedColumnName = "idPaciente")
        private pacienteEntity  idPaciente;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico_id", referencedColumnName = "idMedico")
        private medicoEntity idMedico;
    
    @OneToMany(mappedBy = "id")
        private List<tratamientoEntity>  tratamiento;

    public historia_clinicaEntity() {
    }

    public Long getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Long idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public pacienteEntity getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(pacienteEntity idPaciente) {
        this.idPaciente = idPaciente;
    }

    public medicoEntity getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(medicoEntity idMedico) {
        this.idMedico = idMedico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<tratamientoEntity> getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(List<tratamientoEntity> tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getAtencionprevia() {
        return atencionprevia;
    }

    public void setAtencionprevia(String atencionprevia) {
        this.atencionprevia = atencionprevia;
    }

    public List<seguimientoEntity> getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(List<seguimientoEntity> seguimiento) {
        this.seguimiento = seguimiento;
    }

    
    
}
