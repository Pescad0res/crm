/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.FicheSuiviDAO;
import com.crm1.dao.FicheSuiviDAOImpl;
import com.crm1.dao.InterventionDAO;
import com.crm1.dao.InterventionDAOImpl;
import com.crm1.dao.ProduitDAO;
import com.crm1.dao.ProduitDAOImpl;
import com.crm1.dao.ReclamationDAO;
import com.crm1.dao.ReclamationDAOImpl;
import com.crm1.entity.FicheSuivi;
import com.crm1.entity.Produit;
import com.crm1.entity.PvIntervention;
import com.crm1.entity.Reclamation;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="dirBean")
@RequestScoped
public class DirecteurBean {
    

    ProduitDAO daopro = new ProduitDAOImpl();
    ReclamationDAO daorec =  new ReclamationDAOImpl();
    InterventionDAO daoint = new InterventionDAOImpl();
    FicheSuiviDAO   daofich = new FicheSuiviDAOImpl();
    
    Produit pro = new Produit();
    FicheSuivi fich= new FicheSuivi();
    Reclamation rec = new Reclamation();

    public FicheSuivi getFich() {
        return fich;
    }

    public void setFich(FicheSuivi fich) {
        this.fich = fich;
    }
    

    public Produit getPro() {
        return pro;
    }

    public void setPro(Produit pro) {
        this.pro = pro;
    }
    
     public List <Produit> lister(){
        return daopro.findAll();
    }
      public List <Reclamation> listerrec(){
        return daorec.findAll();
    }
       public List <PvIntervention> listerint(){
        return daoint.findAll();
    }
     
      public List <FicheSuivi> listerfich(){
        return daofich.findAll();
    }
        public void archive(Integer code)
    { 
 
        rec = daorec.findByidRec(code);
        rec.setSituation("archivée");
        daorec.edit(rec);
    }
     
     public String rechercher(Integer code)
    {
        pro = daopro.findByidP(code);
        return ("directeur.xhtml");
    }
    
     public void supprimerrec (Integer code)
    { 
        daorec.delete(code);
        
    }
    public void supprimer (Integer code)
    { 
        daopro.delete(code);
        
    }
    
    
    
     public void ajouter(){
        daopro.add(pro);
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }

    public String modif()
 {
    if (pro.getIdP() != null)
    {
    daopro.edit(pro);
    }
    return null;//("directeurProduitAll.xhtml"); 
}
    
}
