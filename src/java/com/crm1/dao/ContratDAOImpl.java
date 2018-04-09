/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Contrat;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class ContratDAOImpl implements ContratDAO {

     Session ses = HibernateUtil.getSession();
    @Override
    public void add(Contrat con) {
        ses.beginTransaction();
        ses.save(con);
        ses.getTransaction().commit();
        
    }

    @Override
    public Contrat edit(Contrat con) {
        ses.beginTransaction();
        Contrat cont = (Contrat) ses.merge(con);
        ses.getTransaction().commit();
        
        return cont;
    }

    @Override
    public Contrat delete(Integer idC) {
        ses.beginTransaction();
        Contrat cont = findByidCli(idC);
        ses.delete(cont);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<Contrat> findAll() {
        return ses.createQuery("select obj from Contrat obj").list();
    }

    @Override
    public Contrat findByidCli(Integer idC) {
        return (Contrat) ses.get(Contrat.class,idC);
    }
    
}
