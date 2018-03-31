package com.crm1.entity;
// Generated Mar 30, 2018 5:12:53 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BonCommande generated by hbm2java
 */
@Entity
@Table(name="bon_commande"
    ,catalog="crm"
)
public class BonCommande  implements java.io.Serializable {


     private int idCmd;
     private Date dateCreaC;
     private String observ;
     private BigDecimal TTh;
     private BigDecimal TRemise;
     private BigDecimal TTva;
     private BigDecimal ttc;
     private BigDecimal timbre;
     private BigDecimal netPayer;
     private String modePaie;
     private int delaiPaie;
     private Set<Ligne> lignes = new HashSet<Ligne>(0);
     private Set<Facture> factures = new HashSet<Facture>(0);

    public BonCommande() {
    }

	
    public BonCommande(int idCmd, Date dateCreaC, String observ, BigDecimal TTh, BigDecimal TRemise, BigDecimal TTva, BigDecimal ttc, BigDecimal timbre, BigDecimal netPayer, String modePaie, int delaiPaie) {
        this.idCmd = idCmd;
        this.dateCreaC = dateCreaC;
        this.observ = observ;
        this.TTh = TTh;
        this.TRemise = TRemise;
        this.TTva = TTva;
        this.ttc = ttc;
        this.timbre = timbre;
        this.netPayer = netPayer;
        this.modePaie = modePaie;
        this.delaiPaie = delaiPaie;
    }
    public BonCommande(int idCmd, Date dateCreaC, String observ, BigDecimal TTh, BigDecimal TRemise, BigDecimal TTva, BigDecimal ttc, BigDecimal timbre, BigDecimal netPayer, String modePaie, int delaiPaie, Set<Ligne> lignes, Set<Facture> factures) {
       this.idCmd = idCmd;
       this.dateCreaC = dateCreaC;
       this.observ = observ;
       this.TTh = TTh;
       this.TRemise = TRemise;
       this.TTva = TTva;
       this.ttc = ttc;
       this.timbre = timbre;
       this.netPayer = netPayer;
       this.modePaie = modePaie;
       this.delaiPaie = delaiPaie;
       this.lignes = lignes;
       this.factures = factures;
    }
   
     @Id 

    
    @Column(name="Id_cmd", unique=true, nullable=false)
    public int getIdCmd() {
        return this.idCmd;
    }
    
    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_crea_c", nullable=false, length=10)
    public Date getDateCreaC() {
        return this.dateCreaC;
    }
    
    public void setDateCreaC(Date dateCreaC) {
        this.dateCreaC = dateCreaC;
    }

    
    @Column(name="observ", nullable=false)
    public String getObserv() {
        return this.observ;
    }
    
    public void setObserv(String observ) {
        this.observ = observ;
    }

    
    @Column(name="T_TH", nullable=false, precision=8, scale=3)
    public BigDecimal getTTh() {
        return this.TTh;
    }
    
    public void setTTh(BigDecimal TTh) {
        this.TTh = TTh;
    }

    
    @Column(name="T_Remise", nullable=false, precision=8, scale=3)
    public BigDecimal getTRemise() {
        return this.TRemise;
    }
    
    public void setTRemise(BigDecimal TRemise) {
        this.TRemise = TRemise;
    }

    
    @Column(name="T_TVA", nullable=false, precision=8, scale=3)
    public BigDecimal getTTva() {
        return this.TTva;
    }
    
    public void setTTva(BigDecimal TTva) {
        this.TTva = TTva;
    }

    
    @Column(name="TTC", nullable=false, precision=8, scale=3)
    public BigDecimal getTtc() {
        return this.ttc;
    }
    
    public void setTtc(BigDecimal ttc) {
        this.ttc = ttc;
    }

    
    @Column(name="Timbre", nullable=false, precision=8, scale=3)
    public BigDecimal getTimbre() {
        return this.timbre;
    }
    
    public void setTimbre(BigDecimal timbre) {
        this.timbre = timbre;
    }

    
    @Column(name="net_payer", nullable=false, precision=8, scale=3)
    public BigDecimal getNetPayer() {
        return this.netPayer;
    }
    
    public void setNetPayer(BigDecimal netPayer) {
        this.netPayer = netPayer;
    }

    
    @Column(name="mode_paie", nullable=false, length=30)
    public String getModePaie() {
        return this.modePaie;
    }
    
    public void setModePaie(String modePaie) {
        this.modePaie = modePaie;
    }

    
    @Column(name="delai_paie", nullable=false)
    public int getDelaiPaie() {
        return this.delaiPaie;
    }
    
    public void setDelaiPaie(int delaiPaie) {
        this.delaiPaie = delaiPaie;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bonCommande")
    public Set<Ligne> getLignes() {
        return this.lignes;
    }
    
    public void setLignes(Set<Ligne> lignes) {
        this.lignes = lignes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bonCommande")
    public Set<Facture> getFactures() {
        return this.factures;
    }
    
    public void setFactures(Set<Facture> factures) {
        this.factures = factures;
    }




}


