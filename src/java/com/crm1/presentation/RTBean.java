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
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="rtBean")
@RequestScoped
public class RTBean {
       ReclamationDAO daorec =  new ReclamationDAOImpl();
    InterventionDAO daoint = new InterventionDAOImpl();
    
         public List <Reclamation> listerrec(){
        return daorec.findAll();
    }
       public List <PvIntervention> listerint(){
        return daoint.findAll();
    }
    
}
