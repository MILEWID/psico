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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAnamnesis", referencedColumnName = "idAnamnesis")
    private AnamnesisEntity idAnamnesis;
    
    private Long idGrupoFamiliar;

    private Long idFuncionPsiquica;
    private Long idHistoriaLaboral;
    private Long idHistoraSocial;
    @OneToMany(mappedBy = "historiacli")
    private List<diagnosticoEntity> idDiagnostico;
    
    @OneToMany(mappedBy = "historiaclin")
    private List<planesEntity> idPlan;
    
    @OneToMany(mappedBy = "historiaclin")
    private List<CitaEntity> cita;
    
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

    public Long getIdGrupoFamiliar() {
        return idGrupoFamiliar;
    }

    public void setIdGrupoFamiliar(Long idGrupoFamiliar) {
        this.idGrupoFamiliar = idGrupoFamiliar;
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

    public List<planesEntity> getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(List<planesEntity> idPlan) {
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

	public List<CitaEntity> getCita() {
		return cita;
	}

	public void setCita(List<CitaEntity> cita) {
		this.cita = cita;
	}

    public AnamnesisEntity getIdAnamnesis() {
        return idAnamnesis;
    }

    public void setIdAnamnesis(AnamnesisEntity idAnamnesis) {
        this.idAnamnesis = idAnamnesis;
    }
    
}
