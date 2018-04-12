/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Facture;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class FactureDAOimpl implements FactureDAO{

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Facture fac) {
        ses.beginTransaction();
        ses.save(fac);
        ses.getTransaction().commit();
    }

    @Override
    public Facture edit(Facture fac) {
        ses.beginTransaction();
        Facture fact = (Facture) ses.merge(fac);
        ses.getTransaction().commit();
        
        return fact;
    }

    @Override
    public Facture delete(Integer idFacture) {
        ses.beginTransaction();
        Facture fact = findByidFacture(idFacture);
        ses.delete(fact);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<Facture> findAll() {
        return ses.createQuery("select obj from Facture obj").list();
    }

    @Override
    public Facture findByidFacture(Integer idFacture) {
        return (Facture) ses.get(Facture.class,idFacture);
    }
    
}
