/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ReclamationDAO;
import com.crm1.dao.ReclamationDAOImpl;
import com.crm1.entity.Reclamation;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="recBean")
@SessionScoped
public class ReclamationBean {
    ReclamationDAO dao = new ReclamationDAOImpl();
    Reclamation rec = new Reclamation();

    public Reclamation getRec() {
        return rec;
    }

    public void setRec(Reclamation rec) {
        this.rec = rec;
    }
    
    public void ajouter(){
        
        dao.add(rec);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }
}
