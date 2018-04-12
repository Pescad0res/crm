/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.PersonnelDAO;
import com.crm1.dao.PersonnelDAOImpl;
import com.crm1.entity.Personnel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="rhBean")
@RequestScoped
public class RhBean {
    
    PersonnelDAO daoper = new PersonnelDAOImpl();
    
Personnel per = new Personnel();

    public Personnel getPer() {
        return per;
    }

    public void setPer(Personnel per) {
        this.per = per;
    }

public String rechercher(Integer code)
    {
        per = daoper.findByidPers(code);
        return ("rh.xhtml");
    }
    
    public void supprimer (Integer code)
    { 
        daoper.delete(code);   
    }
    
    public List <Personnel> lister(){
        return daoper.findAll();
    }
    
    
     public void ajouter(){
        daoper.add(per);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }

    public String modif()
{
    
    daoper.edit(per);
    return ("RHpersonnelAll.xhtml"); 
}
}
