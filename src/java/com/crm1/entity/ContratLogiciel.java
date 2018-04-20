package com.crm1.entity;
// Generated Apr 20, 2018 2:07:18 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContratLogiciel generated by hbm2java
 */
@Entity
@Table(name="contrat_logiciel"
    ,catalog="crm"
)
public class ContratLogiciel  implements java.io.Serializable {


     private ContratLogicielId id;
     private Contrat contrat;
     private Produit produit;

    public ContratLogiciel() {
    }

    public ContratLogiciel(ContratLogicielId id, Contrat contrat, Produit produit) {
       this.id = id;
       this.contrat = contrat;
       this.produit = produit;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idP", column=@Column(name="Id_p", nullable=false) ), 
        @AttributeOverride(name="idC", column=@Column(name="Id_c", nullable=false) ) } )
    public ContratLogicielId getId() {
        return this.id;
    }
    
    public void setId(ContratLogicielId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cfk", nullable=false)
    public Contrat getContrat() {
        return this.contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_p", nullable=false, insertable=false, updatable=false)
    public Produit getProduit() {
        return this.produit;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }




}


