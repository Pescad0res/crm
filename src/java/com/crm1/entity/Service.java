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
 * Service generated by hbm2java
 */
@Entity
@Table(name="service"
    ,catalog="crm"
)
public class Service  implements java.io.Serializable {


     private Integer idServ;
     private String designServ;
     private Set<SelectService> selectServices = new HashSet<SelectService>(0);

    public Service() {
    }

	
    public Service(String designServ) {
        this.designServ = designServ;
    }
    public Service(String designServ, Set<SelectService> selectServices) {
       this.designServ = designServ;
       this.selectServices = selectServices;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id_serv", unique=true, nullable=false)
    public Integer getIdServ() {
        return this.idServ;
    }
    
    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
    }

    
    @Column(name="design_serv", nullable=false, length=30)
    public String getDesignServ() {
        return this.designServ;
    }
    
    public void setDesignServ(String designServ) {
        this.designServ = designServ;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="service")
    public Set<SelectService> getSelectServices() {
        return this.selectServices;
    }
    
    public void setSelectServices(Set<SelectService> selectServices) {
        this.selectServices = selectServices;
    }




}


