package com.crm1.entity;
// Generated May 16, 2018 11:55:53 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContratLogicielId generated by hbm2java
 */
@Embeddable
public class ContratLogicielId  implements java.io.Serializable {


     private int idP;
     private int idC;

    public ContratLogicielId() {
    }

    public ContratLogicielId(int idP, int idC) {
       this.idP = idP;
       this.idC = idC;
    }
   


    @Column(name="Id_p", nullable=false)
    public int getIdP() {
        return this.idP;
    }
    
    public void setIdP(int idP) {
        this.idP = idP;
    }


    @Column(name="Id_c", nullable=false)
    public int getIdC() {
        return this.idC;
    }
    
    public void setIdC(int idC) {
        this.idC = idC;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContratLogicielId) ) return false;
		 ContratLogicielId castOther = ( ContratLogicielId ) other; 
         
		 return (this.getIdP()==castOther.getIdP())
 && (this.getIdC()==castOther.getIdC());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdP();
         result = 37 * result + this.getIdC();
         return result;
   }   


}


