package com.crm1.entity;
// Generated May 16, 2018 11:55:53 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ContratTechnique generated by hbm2java
 */
@Entity
@Table(name="contrat_technique"
    ,catalog="crm"
)
public class ContratTechnique  implements java.io.Serializable {


     private int idC;
     private Contrat contrat;
     private Set<Materiel> materiels = new HashSet<Materiel>(0);

    public ContratTechnique() {
    }

	
    public ContratTechnique(Contrat contrat) {
        this.contrat = contrat;
    }
    public ContratTechnique(Contrat contrat, Set<Materiel> materiels) {
       this.contrat = contrat;
       this.materiels = materiels;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="contrat"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="Id_c", unique=true, nullable=false)
    public int getIdC() {
        return this.idC;
    }
    
    public void setIdC(int idC) {
        this.idC = idC;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Contrat getContrat() {
        return this.contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contratTechnique")
    public Set<Materiel> getMateriels() {
        return this.materiels;
    }
    
    public void setMateriels(Set<Materiel> materiels) {
        this.materiels = materiels;
    }




}


