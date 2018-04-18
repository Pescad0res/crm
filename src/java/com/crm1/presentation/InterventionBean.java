/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.InterventionDAO;
import com.crm1.dao.InterventionDAOImpl;
import com.crm1.entity.PvIntervention;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="interBean")
@RequestScoped
public class InterventionBean {
    InterventionDAO dao = new InterventionDAOImpl();
    PvIntervention inter = new PvIntervention();

    public PvIntervention getInter() {
        return inter;
    }

    public void setInter(PvIntervention inter) {
        this.inter = inter;
    }
    
    public List <PvIntervention> lister(){
        return dao.findAll();
        //return dao.findwithcli();
         }
    
}
