package com.crm1.entity;
// Generated Mar 30, 2018 5:12:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Produit generated by hbm2java
 */
@Entity
@Table(name="produit"
    ,catalog="crm"
)
public class Produit  implements java.io.Serializable {


     private Integer idP;
     private String idProd;
     private String libProd;
     private String typeDuProduit;
     private String descProd;
     private String versionProd;
     private Date dateCreaProd;
     private String chefProd;
     private Set<Reclamation> reclamations = new HashSet<Reclamation>(0);
     private Set<Affectation> affectations = new HashSet<Affectation>(0);
     private Set<ContratLogiciel> contratLogiciels = new HashSet<ContratLogiciel>(0);

    public Produit() {
    }

	
    public Produit(String idProd, String libProd, String typeDuProduit, String descProd, String versionProd, Date dateCreaProd, String chefProd) {
        this.idProd = idProd;
        this.libProd = libProd;
        this.typeDuProduit = typeDuProduit;
        this.descProd = descProd;
        this.versionProd = versionProd;
        this.dateCreaProd = dateCreaProd;
        this.chefProd = chefProd;
    }
    public Produit(String idProd, String libProd, String typeDuProduit, String descProd, String versionProd, Date dateCreaProd, String chefProd, Set<Reclamation> reclamations, Set<Affectation> affectations, Set<ContratLogiciel> contratLogiciels) {
       this.idProd = idProd;
       this.libProd = libProd;
       this.typeDuProduit = typeDuProduit;
       this.descProd = descProd;
       this.versionProd = versionProd;
       this.dateCreaProd = dateCreaProd;
       this.chefProd = chefProd;
       this.reclamations = reclamations;
       this.affectations = affectations;
       this.contratLogiciels = contratLogiciels;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_p", unique=true, nullable=false)
    public Integer getIdP() {
        return this.idP;
    }
    
    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    
    @Column(name="Id_prod", nullable=false, length=12)
    public String getIdProd() {
        return this.idProd;
    }
    
    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    
    @Column(name="Lib_prod", nullable=false, length=30)
    public String getLibProd() {
        return this.libProd;
    }
    
    public void setLibProd(String libProd) {
        this.libProd = libProd;
    }

    
    @Column(name="Type du produit", nullable=false, length=11)
    public String getTypeDuProduit() {
        return this.typeDuProduit;
    }
    
    public void setTypeDuProduit(String typeDuProduit) {
        this.typeDuProduit = typeDuProduit;
    }

    
    @Column(name="Desc_prod", nullable=false, length=50)
    public String getDescProd() {
        return this.descProd;
    }
    
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    
    @Column(name="Version_prod", nullable=false, length=20)
    public String getVersionProd() {
        return this.versionProd;
    }
    
    public void setVersionProd(String versionProd) {
        this.versionProd = versionProd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_crea_prod", nullable=false, length=10)
    public Date getDateCreaProd() {
        return this.dateCreaProd;
    }
    
    public void setDateCreaProd(Date dateCreaProd) {
        this.dateCreaProd = dateCreaProd;
    }

    
    @Column(name="Chef_prod", nullable=false, length=12)
    public String getChefProd() {
        return this.chefProd;
    }
    
    public void setChefProd(String chefProd) {
        this.chefProd = chefProd;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produit")
    public Set<Reclamation> getReclamations() {
        return this.reclamations;
    }
    
    public void setReclamations(Set<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produit")
    public Set<Affectation> getAffectations() {
        return this.affectations;
    }
    
    public void setAffectations(Set<Affectation> affectations) {
        this.affectations = affectations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produit")
    public Set<ContratLogiciel> getContratLogiciels() {
        return this.contratLogiciels;
    }
    
    public void setContratLogiciels(Set<ContratLogiciel> contratLogiciels) {
        this.contratLogiciels = contratLogiciels;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.idP);
        hash = 23 * hash + Objects.hashCode(this.idProd);
        hash = 23 * hash + Objects.hashCode(this.libProd);
        hash = 23 * hash + Objects.hashCode(this.typeDuProduit);
        hash = 23 * hash + Objects.hashCode(this.descProd);
        hash = 23 * hash + Objects.hashCode(this.versionProd);
        hash = 23 * hash + Objects.hashCode(this.dateCreaProd);
        hash = 23 * hash + Objects.hashCode(this.chefProd);
        hash = 23 * hash + Objects.hashCode(this.reclamations);
        hash = 23 * hash + Objects.hashCode(this.affectations);
        hash = 23 * hash + Objects.hashCode(this.contratLogiciels);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.idProd, other.idProd)) {
            return false;
        }
        if (!Objects.equals(this.libProd, other.libProd)) {
            return false;
        }
        if (!Objects.equals(this.typeDuProduit, other.typeDuProduit)) {
            return false;
        }
        if (!Objects.equals(this.descProd, other.descProd)) {
            return false;
        }
        if (!Objects.equals(this.versionProd, other.versionProd)) {
            return false;
        }
        if (!Objects.equals(this.chefProd, other.chefProd)) {
            return false;
        }
        if (!Objects.equals(this.idP, other.idP)) {
            return false;
        }
        if (!Objects.equals(this.dateCreaProd, other.dateCreaProd)) {
            return false;
        }
        if (!Objects.equals(this.reclamations, other.reclamations)) {
            return false;
        }
        if (!Objects.equals(this.affectations, other.affectations)) {
            return false;
        }
        if (!Objects.equals(this.contratLogiciels, other.contratLogiciels)) {
            return false;
        }
        return true;
    }




}


