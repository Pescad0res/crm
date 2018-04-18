package com.crm1.entity;
// Generated Apr 18, 2018 5:23:38 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Adresse generated by hbm2java
 */
@Entity
@Table(name="adresse"
    ,catalog="crm"
)
public class Adresse  implements java.io.Serializable {


     private Integer idAdr;
     private Client client;
     private String rue;
     private int ville;
     private int codePost;
     private String etatAdr;

    public Adresse() {
    }

	
    public Adresse(Client client, String rue, int ville, int codePost) {
        this.client = client;
        this.rue = rue;
        this.ville = ville;
        this.codePost = codePost;
    }
    public Adresse(Client client, String rue, int ville, int codePost, String etatAdr) {
       this.client = client;
       this.rue = rue;
       this.ville = ville;
       this.codePost = codePost;
       this.etatAdr = etatAdr;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_adr", unique=true, nullable=false)
    public Integer getIdAdr() {
        return this.idAdr;
    }
    
    public void setIdAdr(Integer idAdr) {
        this.idAdr = idAdr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_cli", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    
    @Column(name="rue", nullable=false, length=50)
    public String getRue() {
        return this.rue;
    }
    
    public void setRue(String rue) {
        this.rue = rue;
    }

    
    @Column(name="ville", nullable=false)
    public int getVille() {
        return this.ville;
    }
    
    public void setVille(int ville) {
        this.ville = ville;
    }

    
    @Column(name="code_post", nullable=false)
    public int getCodePost() {
        return this.codePost;
    }
    
    public void setCodePost(int codePost) {
        this.codePost = codePost;
    }

    
    @Column(name="etat_adr", length=8)
    public String getEtatAdr() {
        return this.etatAdr;
    }
    
    public void setEtatAdr(String etatAdr) {
        this.etatAdr = etatAdr;
    }




}


