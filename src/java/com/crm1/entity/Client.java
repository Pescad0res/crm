package com.crm1.entity;
// Generated Mar 30, 2018 5:12:53 PM by Hibernate Tools 4.3.1


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
import javax.persistence.UniqueConstraint;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name="client"
    ,catalog="crm"
    , uniqueConstraints = @UniqueConstraint(columnNames="mat_fisc") 
)
public class Client  implements java.io.Serializable {


     private Integer idCli;
     private String matFisc;
     private String nomCli;
     private String loginCli;
     private String pwdCli;
     private String nomRep;
     private String prenomRep;
     private Set<Contact> contacts = new HashSet<Contact>(0);
     private Set<Adresse> adresses = new HashSet<Adresse>(0);
     private Set<Reclamation> reclamations = new HashSet<Reclamation>(0);
     private Set<SelectActivite> selectActivites = new HashSet<SelectActivite>(0);
     private Set<Contrat> contrats = new HashSet<Contrat>(0);

    public Client() {
    }

    public Client(String matFisc, String nomCli, String loginCli, String pwdCli, String nomRep, String prenomRep, Set<Contact> contacts, Set<Adresse> adresses, Set<Reclamation> reclamations, Set<SelectActivite> selectActivites, Set<Contrat> contrats) {
       this.matFisc = matFisc;
       this.nomCli = nomCli;
       this.loginCli = loginCli;
       this.pwdCli = pwdCli;
       this.nomRep = nomRep;
       this.prenomRep = prenomRep;
       this.contacts = contacts;
       this.adresses = adresses;
       this.reclamations = reclamations;
       this.selectActivites = selectActivites;
       this.contrats = contrats;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_cli", unique=true, nullable=false)
    public Integer getIdCli() {
        return this.idCli;
    }
    
    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    
    @Column(name="mat_fisc", unique=true, length=12)
    public String getMatFisc() {
        return this.matFisc;
    }
    
    public void setMatFisc(String matFisc) {
        this.matFisc = matFisc;
    }

    
    @Column(name="nom_cli", length=50)
    public String getNomCli() {
        return this.nomCli;
    }
    
    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    
    @Column(name="login_cli", length=30)
    public String getLoginCli() {
        return this.loginCli;
    }
    
    public void setLoginCli(String loginCli) {
        this.loginCli = loginCli;
    }

    
    @Column(name="pwd_cli", length=30)
    public String getPwdCli() {
        return this.pwdCli;
    }
    
    public void setPwdCli(String pwdCli) {
        this.pwdCli = pwdCli;
    }

    
    @Column(name="nom_rep", length=20)
    public String getNomRep() {
        return this.nomRep;
    }
    
    public void setNomRep(String nomRep) {
        this.nomRep = nomRep;
    }

    
    @Column(name="prenom_rep", length=20)
    public String getPrenomRep() {
        return this.prenomRep;
    }
    
    public void setPrenomRep(String prenomRep) {
        this.prenomRep = prenomRep;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Adresse> getAdresses() {
        return this.adresses;
    }
    
    public void setAdresses(Set<Adresse> adresses) {
        this.adresses = adresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Reclamation> getReclamations() {
        return this.reclamations;
    }
    
    public void setReclamations(Set<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="activite")
    public Set<SelectActivite> getSelectActivites() {
        return this.selectActivites;
    }
    
    public void setSelectActivites(Set<SelectActivite> selectActivites) {
        this.selectActivites = selectActivites;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Contrat> getContrats() {
        return this.contrats;
    }
    
    public void setContrats(Set<Contrat> contrats) {
        this.contrats = contrats;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idCli);
        hash = 29 * hash + Objects.hashCode(this.matFisc);
        hash = 29 * hash + Objects.hashCode(this.nomCli);
        hash = 29 * hash + Objects.hashCode(this.loginCli);
        hash = 29 * hash + Objects.hashCode(this.pwdCli);
        hash = 29 * hash + Objects.hashCode(this.nomRep);
        hash = 29 * hash + Objects.hashCode(this.prenomRep);
        hash = 29 * hash + Objects.hashCode(this.contacts);
        hash = 29 * hash + Objects.hashCode(this.adresses);
        hash = 29 * hash + Objects.hashCode(this.reclamations);
        hash = 29 * hash + Objects.hashCode(this.selectActivites);
        hash = 29 * hash + Objects.hashCode(this.contrats);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.matFisc, other.matFisc)) {
            return false;
        }
        if (!Objects.equals(this.nomCli, other.nomCli)) {
            return false;
        }
        if (!Objects.equals(this.loginCli, other.loginCli)) {
            return false;
        }
        if (!Objects.equals(this.pwdCli, other.pwdCli)) {
            return false;
        }
        if (!Objects.equals(this.nomRep, other.nomRep)) {
            return false;
        }
        if (!Objects.equals(this.prenomRep, other.prenomRep)) {
            return false;
        }
        if (!Objects.equals(this.idCli, other.idCli)) {
            return false;
        }
        if (!Objects.equals(this.contacts, other.contacts)) {
            return false;
        }
        if (!Objects.equals(this.adresses, other.adresses)) {
            return false;
        }
        if (!Objects.equals(this.reclamations, other.reclamations)) {
            return false;
        }
        if (!Objects.equals(this.selectActivites, other.selectActivites)) {
            return false;
        }
        if (!Objects.equals(this.contrats, other.contrats)) {
            return false;
        }
        return true;
    }




}


