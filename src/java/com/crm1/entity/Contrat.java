package com.crm1.entity;
// Generated May 16, 2018 11:55:53 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contrat generated by hbm2java
 */
@Entity
@Table(name="contrat"
    ,catalog="crm"
)
public class Contrat  implements java.io.Serializable {


     private Integer idC;
     private Client client;
     private String idContrat;
     private Date dateContrat;
     private String refManuelle;
     private Date dateSign;
     private Date dateEffet;
     private int duree;
     private Date dateFin;
     private int nbInterPrev;
     private Set<ContratLogiciel> contratLogiciels = new HashSet<ContratLogiciel>(0);
     private ContratTechnique contratTechnique;

    public Contrat() {
    }

	
    public Contrat(Client client, String idContrat, Date dateContrat, String refManuelle, Date dateSign, Date dateEffet, int duree, Date dateFin, int nbInterPrev) {
        this.client = client;
        this.idContrat = idContrat;
        this.dateContrat = dateContrat;
        this.refManuelle = refManuelle;
        this.dateSign = dateSign;
        this.dateEffet = dateEffet;
        this.duree = duree;
        this.dateFin = dateFin;
        this.nbInterPrev = nbInterPrev;
    }
    public Contrat(Client client, String idContrat, Date dateContrat, String refManuelle, Date dateSign, Date dateEffet, int duree, Date dateFin, int nbInterPrev, Set<ContratLogiciel> contratLogiciels, ContratTechnique contratTechnique) {
       this.client = client;
       this.idContrat = idContrat;
       this.dateContrat = dateContrat;
       this.refManuelle = refManuelle;
       this.dateSign = dateSign;
       this.dateEffet = dateEffet;
       this.duree = duree;
       this.dateFin = dateFin;
       this.nbInterPrev = nbInterPrev;
       this.contratLogiciels = contratLogiciels;
       this.contratTechnique = contratTechnique;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_c", unique=true, nullable=false)
    public Integer getIdC() {
        return this.idC;
    }
    
    public void setIdC(Integer idC) {
        this.idC = idC;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_cli", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    
    @Column(name="Id_contrat", nullable=false, length=100)
    public String getIdContrat() {
        return this.idContrat;
    }
    
    public void setIdContrat(String idContrat) {
        this.idContrat = idContrat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_contrat", nullable=false, length=10)
    public Date getDateContrat() {
        return this.dateContrat;
    }
    
    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    
    @Column(name="Ref_manuelle", nullable=false, length=20)
    public String getRefManuelle() {
        return this.refManuelle;
    }
    
    public void setRefManuelle(String refManuelle) {
        this.refManuelle = refManuelle;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_sign", nullable=false, length=10)
    public Date getDateSign() {
        return this.dateSign;
    }
    
    public void setDateSign(Date dateSign) {
        this.dateSign = dateSign;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_effet", nullable=false, length=10)
    public Date getDateEffet() {
        return this.dateEffet;
    }
    
    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    
    @Column(name="duree", nullable=false, precision=8, scale=0)
    public int getDuree() {
        return this.duree;
    }
    
    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_fin", nullable=false, length=10)
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    
    @Column(name="Nb_inter_prev", nullable=false)
    public int getNbInterPrev() {
        return this.nbInterPrev;
    }
    
    public void setNbInterPrev(int nbInterPrev) {
        this.nbInterPrev = nbInterPrev;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrat")
    public Set<ContratLogiciel> getContratLogiciels() {
        return this.contratLogiciels;
    }
    
    public void setContratLogiciels(Set<ContratLogiciel> contratLogiciels) {
        this.contratLogiciels = contratLogiciels;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="contrat")
    public ContratTechnique getContratTechnique() {
        return this.contratTechnique;
    }
    
    public void setContratTechnique(ContratTechnique contratTechnique) {
        this.contratTechnique = contratTechnique;
    }




}


