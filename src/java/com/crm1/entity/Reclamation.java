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
 * Reclamation generated by hbm2java
 */
@Entity
@Table(name="reclamation"
    ,catalog="crm"
)
public class Reclamation  implements java.io.Serializable {


     private Integer idRec;
     private Client client;
     private Produit produit;
     private String nomRec;
     private Date dateCreRec;
     private String typeRec;
     private boolean preventive;
     private String descCli;
     private String situation;
     private boolean recEstim;
     private String persEstim;
     private Integer estimation;
     private String degUrgence;
     private String descExpert;
     private Date dateDebut;
     private Date dateFin;
     private Set<PvIntervention> pvInterventions = new HashSet<PvIntervention>(0);
     private Set<ListeMatriel> listeMatriels = new HashSet<ListeMatriel>(0);
     private Affectation affectation;

    public Reclamation() {
    }

	
    public Reclamation(Client client, String typeRec, boolean preventive, String descCli, String situation, boolean recEstim, String degUrgence) {
        this.client = client;
        this.typeRec = typeRec;
        this.preventive = preventive;
        this.descCli = descCli;
        this.situation = situation;
        this.recEstim = recEstim;
        this.degUrgence = degUrgence;
    }
    public Reclamation(Client client, Produit produit, String nomRec, Date dateCreRec, String typeRec, boolean preventive, String descCli, String situation, boolean recEstim, String persEstim, Integer estimation, String degUrgence, String descExpert, Date dateDebut, Date dateFin, Set<PvIntervention> pvInterventions, Set<ListeMatriel> listeMatriels, Affectation affectation) {
       this.client = client;
       this.produit = produit;
       this.nomRec = nomRec;
       this.dateCreRec = dateCreRec;
       this.typeRec = typeRec;
       this.preventive = preventive;
       this.descCli = descCli;
       this.situation = situation;
       this.recEstim = recEstim;
       this.persEstim = persEstim;
       this.estimation = estimation;
       this.degUrgence = degUrgence;
       this.descExpert = descExpert;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.pvInterventions = pvInterventions;
       this.listeMatriels = listeMatriels;
       this.affectation = affectation;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_rec", unique=true, nullable=false)
    public Integer getIdRec() {
        return this.idRec;
    }
    
    public void setIdRec(Integer idRec) {
        this.idRec = idRec;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_cli", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_p")
    public Produit getProduit() {
        return this.produit;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    
    @Column(name="NomRec", length=50)
    public String getNomRec() {
        return this.nomRec;
    }
    
    public void setNomRec(String nomRec) {
        this.nomRec = nomRec;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_cre_rec", length=10)
    public Date getDateCreRec() {
        return this.dateCreRec;
    }
    
    public void setDateCreRec(Date dateCreRec) {
        this.dateCreRec = dateCreRec;
    }

    
    @Column(name="Type_rec", nullable=false, length=30)
    public String getTypeRec() {
        return this.typeRec;
    }
    
    public void setTypeRec(String typeRec) {
        this.typeRec = typeRec;
    }

    
    @Column(name="Preventive", nullable=false)
    public boolean isPreventive() {
        return this.preventive;
    }
    
    public void setPreventive(boolean preventive) {
        this.preventive = preventive;
    }

    
    @Column(name="Desc_cli", nullable=false, length=200)
    public String getDescCli() {
        return this.descCli;
    }
    
    public void setDescCli(String descCli) {
        this.descCli = descCli;
    }

    
    @Column(name="Situation", nullable=false, length=8)
    public String getSituation() {
        return this.situation;
    }
    
    public void setSituation(String situation) {
        this.situation = situation;
    }

    
    @Column(name="Rec_estim", nullable=false)
    public boolean isRecEstim() {
        return this.recEstim;
    }
    
    public void setRecEstim(boolean recEstim) {
        this.recEstim = recEstim;
    }

    
    @Column(name="Pers_estim", length=12)
    public String getPersEstim() {
        return this.persEstim;
    }
    
    public void setPersEstim(String persEstim) {
        this.persEstim = persEstim;
    }

    
    @Column(name="estimation")
    public Integer getEstimation() {
        return this.estimation;
    }
    
    public void setEstimation(Integer estimation) {
        this.estimation = estimation;
    }

    
    @Column(name="Deg_urgence", nullable=false, length=13)
    public String getDegUrgence() {
        return this.degUrgence;
    }
    
    public void setDegUrgence(String degUrgence) {
        this.degUrgence = degUrgence;
    }

    
    @Column(name="Desc_expert")
    public String getDescExpert() {
        return this.descExpert;
    }
    
    public void setDescExpert(String descExpert) {
        this.descExpert = descExpert;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_debut", length=10)
    public Date getDateDebut() {
        return this.dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_fin", length=10)
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="reclamation")
    public Set<PvIntervention> getPvInterventions() {
        return this.pvInterventions;
    }
    
    public void setPvInterventions(Set<PvIntervention> pvInterventions) {
        this.pvInterventions = pvInterventions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="reclamation")
    public Set<ListeMatriel> getListeMatriels() {
        return this.listeMatriels;
    }
    
    public void setListeMatriels(Set<ListeMatriel> listeMatriels) {
        this.listeMatriels = listeMatriels;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="reclamation")
    public Affectation getAffectation() {
        return this.affectation;
    }
    
    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }




}


