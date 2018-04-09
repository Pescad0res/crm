/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.PvIntervention;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class InterventionDAOImpl implements InterventionDAO {

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(PvIntervention inter) {
        ses.beginTransaction();
        ses.save(inter);
        ses.getTransaction().commit();
        
    }

    @Override
    public PvIntervention edit(PvIntervention inter) {
        ses.beginTransaction();
        PvIntervention interv = (PvIntervention) ses.merge(inter);
        ses.getTransaction().commit();
        
        return interv;
    }

    @Override
    public PvIntervention delete(Integer idPv) {
        ses.beginTransaction();
        PvIntervention interv = findByidCli(idPv);
        ses.delete(interv);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<PvIntervention> findAll() {
        return ses.createQuery("select obj from PvIntervention obj").list();
    }

    @Override
    public PvIntervention findByidCli(Integer idPv) {
        return (PvIntervention) ses.get(PvIntervention.class,idPv);
    }
    
}
