/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.ContratTechnique;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class ContratTechniqueDAOImpl implements ContratTechniqueDAO{

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(ContratTechnique ct) {
        ses.beginTransaction();
        ses.save(ct);
        ses.getTransaction().commit();  
    }

    @Override
    public ContratTechnique edit(ContratTechnique ct) {
ses.beginTransaction();
        ContratTechnique conttech = (ContratTechnique) ses.merge(ct);
        ses.getTransaction().commit();
        return conttech;  
    }

    @Override
    public ContratTechnique delete(Integer idC) {
         ses.beginTransaction();
        ContratTechnique conttech = findByidtech(idC);
        ses.delete(conttech);
        ses.getTransaction().commit();
        return null;  
    }

    @Override
    public List<ContratTechnique> findAll() {
        return ses.createQuery("select obj from ContratTechnique obj").list();  
    }

    @Override
    public ContratTechnique findByidtech(Integer idC) {
        return (ContratTechnique) ses.get(ContratTechnique.class,idC); 
    }
    
}
