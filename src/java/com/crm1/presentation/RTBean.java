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
    Reclamation rec = new Reclamation();
    
         public List <Reclamation> listerrec(){
        return daorec.findAlltech();
    }
       public List <PvIntervention> listerint(){
        return daoint.findAll();
    }
       public void estime (Integer code)
    { 
       
        //edittable = true;
        rec = daorec.findByidRec(code);
        
       	int estimation2int =Integer.valueOf(rec.getEstimation());
        rec.setEstimation(estimation2int);
        rec.setRecEstim(true);
        daorec.edit(rec);
       
    }
               public void archive(Integer code)
    { 
 
        rec = daorec.findByidRec(code);
        rec.setSituation("archivée");
        daorec.edit(rec);
    }
                     public void affecter (Integer code)
    { 
       
        //edittable = true;
        rec = daorec.findByidRec(code);

        rec.setPersEstim(rec.getPersEstim());
        rec.setSituation("affectée");
        daorec.edit(rec);
       
    }
         public void supprimerrec (Integer code)
    { 
        daorec.delete(code);
        
    }
}
