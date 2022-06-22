/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "historia_clinica")


public class Historia_ClinicaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idHistoriaClinica;
    private Long idHistoriaEnfermedad;
    private Long idAnamnesis;
    private Long idGrupoFamiliar;
    private Long idCita;
    private Long idFuncionPsiquica;
    private Long idHistoriaLaboral;
    private Long idHistoraSocial;
    @OneToMany(mappedBy = "historiacli")
    private List<diagnosticoEntity> idDiagnostico;
    private Long idPlan;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    private PersonaEntity idPersona;
    
    private String referencia;
    private String transtorno;
    private String alergia;
    private String conflicto;
    private String atencionPrevia;

    public Long getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Long idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Long getIdHistoriaEnfermedad() {
        return idHistoriaEnfermedad;
    }

    public void setIdHistoriaEnfermedad(Long idHistoriaEnfermedad) {
        this.idHistoriaEnfermedad = idHistoriaEnfermedad;
    }

    public Long getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(Long idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
    }

    public Long getIdGrupoFamiliar() {
        return idGrupoFamiliar;
    }

    public void setIdGrupoFamiliar(Long idGrupoFamiliar) {
        this.idGrupoFamiliar = idGrupoFamiliar;
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public Long getIdFuncionPsiquica() {
        return idFuncionPsiquica;
    }

    public void setIdFuncionPsiquica(Long idFuncionPsiquica) {
        this.idFuncionPsiquica = idFuncionPsiquica;
    }

    public Long getIdHistoriaLaboral() {
        return idHistoriaLaboral;
    }

    public void setIdHistoriaLaboral(Long idHistoriaLaboral) {
        this.idHistoriaLaboral = idHistoriaLaboral;
    }

    public Long getIdHistoraSocial() {
        return idHistoraSocial;
    }

    public void setIdHistoraSocial(Long idHistoraSocial) {
        this.idHistoraSocial = idHistoraSocial;
    }

    public List<diagnosticoEntity> getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(List<diagnosticoEntity> idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public PersonaEntity getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaEntity idPersona) {
        this.idPersona = idPersona;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTranstorno() {
        return transtorno;
    }

    public void setTranstorno(String transtorno) {
        this.transtorno = transtorno;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getConflicto() {
        return conflicto;
    }

    public void setConflicto(String conflicto) {
        this.conflicto = conflicto;
    }

    public String getAtencionPrevia() {
        return atencionPrevia;
    }

    public void setAtencionPrevia(String atencionPrevia) {
        this.atencionPrevia = atencionPrevia;
    }

    
    
}
