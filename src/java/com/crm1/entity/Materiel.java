package com.crm1.entity;
// Generated May 16, 2018 11:55:53 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Materiel generated by hbm2java
 */
@Entity
@Table(name="materiel"
    ,catalog="crm"
)
public class Materiel  implements java.io.Serializable {


     private Integer idM;
     private ContratTechnique contratTechnique;
     private String numSerie;
     private String typeMat;
     private String marque;
     private String versionMat;
     private Date dateInst;

    public Materiel() {
    }

    public Materiel(ContratTechnique contratTechnique, String numSerie, String typeMat, String marque, String versionMat, Date dateInst) {
       this.contratTechnique = contratTechnique;
       this.numSerie = numSerie;
       this.typeMat = typeMat;
       this.marque = marque;
       this.versionMat = versionMat;
       this.dateInst = dateInst;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_m", unique=true, nullable=false)
    public Integer getIdM() {
        return this.idM;
    }
    
    public void setIdM(Integer idM) {
        this.idM = idM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_c", nullable=false)
    public ContratTechnique getContratTechnique() {
        return this.contratTechnique;
    }
    
    public void setContratTechnique(ContratTechnique contratTechnique) {
        this.contratTechnique = contratTechnique;
    }

    
    @Column(name="Num_serie", nullable=false, length=20)
    public String getNumSerie() {
        return this.numSerie;
    }
    
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    
    @Column(name="Type_mat", nullable=false, length=30)
    public String getTypeMat() {
        return this.typeMat;
    }
    
    public void setTypeMat(String typeMat) {
        this.typeMat = typeMat;
    }

    
    @Column(name="marque", nullable=false, length=30)
    public String getMarque() {
        return this.marque;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }

    
    @Column(name="Version_mat", nullable=false, length=20)
    public String getVersionMat() {
        return this.versionMat;
    }
    
    public void setVersionMat(String versionMat) {
        this.versionMat = versionMat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_inst", nullable=false, length=10)
    public Date getDateInst() {
        return this.dateInst;
    }
    
    public void setDateInst(Date dateInst) {
        this.dateInst = dateInst;
    }




}


