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
    private Long idPaciente;
    private Long idMedico;
    private String medico;
    private String paciente;
    private Date fecha = new Date();
    private Long tratamiento;
    private String atencionprevia;
    
    @OneToMany(mappedBy = "histcli")
        private List<seguimientoEntity>  seguimiento;

    public historia_clinicaEntity() {
    }

    public Long getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Long idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Long tratamiento) {
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
