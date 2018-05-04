/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.InterventionDAO;
import com.crm1.dao.InterventionDAOImpl;
import com.crm1.dao.ReclamationDAO;
import com.crm1.dao.ReclamationDAOImpl;
import com.crm1.entity.PvIntervention;
import com.crm1.entity.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="interlogBean")
@RequestScoped
public class IntervenantLogicielBean {
     InterventionDAO dao = new InterventionDAOImpl();
    PvIntervention inter = new PvIntervention();
    Reclamation rec = new Reclamation();
    ReclamationDAO daorec = new ReclamationDAOImpl();
    
    private Integer idreclamation;

    public Integer getIdreclamation() {
        return idreclamation;
    }

    public void setIdreclamation(Integer idreclamation) {
        this.idreclamation = idreclamation;
    }
    
    
    private List<SelectItem> reclamationSelect;

    public PvIntervention getInter() {
        return inter;
    }

    public void setInter(PvIntervention inter) {
        this.inter = inter;
    }
    
    public List <PvIntervention> lister(){
        return dao.findAll();
         }
    
    
    
                public List<SelectItem> getReclamationSelect() {
            if (reclamationSelect == null){
                
                reclamationSelect = new ArrayList<SelectItem>();
                
                ReclamationDAO recDAO = new ReclamationDAOImpl();
                List<Reclamation> listReclamations = recDAO.findAll();
                if(listReclamations != null && !listReclamations.isEmpty()){
                    SelectItem item;
                    for (Reclamation reclist : listReclamations) {
                        item = new SelectItem(reclist.getIdRec() , reclist.getNomRec() );
                  
                        reclamationSelect.add(item);
                        
                    }
                    
                }
  
            }
        return reclamationSelect;
    }
    
                public void loadReclamation(Integer idreclamation){
                 ReclamationDAO daoo = new ReclamationDAOImpl();
                 daoo.findByidRec(idreclamation);   
                 
            }
    
    
    
    
         public void ajouter(){
        inter.setReclamation(daorec.findByidRec(idreclamation));
        dao.add(inter);
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }
    public void supprimer (Integer code)
    { 
        dao.delete(code);   
    }
         public String rechercher(Integer code)
    {
        inter = dao.findByidCli(code);
        return ("IntervLogmodif.xhtml");
    }
    
             public String modif()
{
    if(inter.getIdPv() != null)
    {
        inter.setReclamation(daorec.findByidRec(idreclamation));
    dao.edit(inter);
    }
    return null;//("IntervLogAll.xhtml"); 
}       
}
