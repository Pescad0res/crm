package com.crm1.entity;
// Generated May 16, 2018 11:55:53 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Activite generated by hbm2java
 */
@Entity
@Table(name="activite"
    ,catalog="crm"
)
public class Activite  implements java.io.Serializable {


     private Integer idAct;
     private String typeAct;
     private String domaineAct;
     private String descAct;
     private Set<SelectActivite> selectActivites = new HashSet<SelectActivite>(0);

    public Activite() {
    }

	
    public Activite(String typeAct, String domaineAct, String descAct) {
        this.typeAct = typeAct;
        this.domaineAct = domaineAct;
        this.descAct = descAct;
    }
    public Activite(String typeAct, String domaineAct, String descAct, Set<SelectActivite> selectActivites) {
       this.typeAct = typeAct;
       this.domaineAct = domaineAct;
       this.descAct = descAct;
       this.selectActivites = selectActivites;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_act", unique=true, nullable=false)
    public Integer getIdAct() {
        return this.idAct;
    }
    
    public void setIdAct(Integer idAct) {
        this.idAct = idAct;
    }

    
    @Column(name="type_act", nullable=false, length=13)
    public String getTypeAct() {
        return this.typeAct;
    }
    
    public void setTypeAct(String typeAct) {
        this.typeAct = typeAct;
    }

    
    @Column(name="domaine_act", nullable=false, length=30)
    public String getDomaineAct() {
        return this.domaineAct;
    }
    
    public void setDomaineAct(String domaineAct) {
        this.domaineAct = domaineAct;
    }

    
    @Column(name="desc_act", nullable=false, length=30)
    public String getDescAct() {
        return this.descAct;
    }
    
    public void setDescAct(String descAct) {
        this.descAct = descAct;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="activite")
    public Set<SelectActivite> getSelectActivites() {
        return this.selectActivites;
    }
    
    public void setSelectActivites(Set<SelectActivite> selectActivites) {
        this.selectActivites = selectActivites;
    }




}


