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
 * ListeMatriel generated by hbm2java
 */
@Entity
@Table(name="liste_matriel"
    ,catalog="crm"
)
public class ListeMatriel  implements java.io.Serializable {


     private Integer idListe;
     private Reclamation reclamation;
     private String numSerie;
     private String typeMatRec;
     private String marqueMatRec;

    public ListeMatriel() {
    }

    public ListeMatriel(Reclamation reclamation, String numSerie, String typeMatRec, String marqueMatRec) {
       this.reclamation = reclamation;
       this.numSerie = numSerie;
       this.typeMatRec = typeMatRec;
       this.marqueMatRec = marqueMatRec;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_liste", unique=true, nullable=false)
    public Integer getIdListe() {
        return this.idListe;
    }
    
    public void setIdListe(Integer idListe) {
        this.idListe = idListe;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_rec", nullable=false)
    public Reclamation getReclamation() {
        return this.reclamation;
    }
    
    public void setReclamation(Reclamation reclamation) {
        this.reclamation = reclamation;
    }

    
    @Column(name="Num_serie", nullable=false, length=20)
    public String getNumSerie() {
        return this.numSerie;
    }
    
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    
    @Column(name="Type_mat_rec", nullable=false, length=20)
    public String getTypeMatRec() {
        return this.typeMatRec;
    }
    
    public void setTypeMatRec(String typeMatRec) {
        this.typeMatRec = typeMatRec;
    }

    
    @Column(name="Marque_mat_rec", nullable=false, length=30)
    public String getMarqueMatRec() {
        return this.marqueMatRec;
    }
    
    public void setMarqueMatRec(String marqueMatRec) {
        this.marqueMatRec = marqueMatRec;
    }




}


