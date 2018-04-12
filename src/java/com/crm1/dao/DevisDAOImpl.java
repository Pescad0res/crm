/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Devis;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class DevisDAOImpl implements DevisDAO{

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Devis dev) {
        ses.beginTransaction();
        ses.save(dev);
        ses.getTransaction().commit();
    }

    @Override
    public Devis edit(Devis dev) {
        ses.beginTransaction();
        Devis devi = (Devis) ses.merge(dev);
        ses.getTransaction().commit();
        
        return devi;
    }

    @Override
    public Devis delete(Integer idDevis) {
        ses.beginTransaction();
        Devis devi = findByidDevis(idDevis);
        ses.delete(devi);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<Devis> findAll() {
        return ses.createQuery("select obj from Devis obj").list();
    }

    @Override
    public Devis findByidDevis(Integer idDevis) {
        return (Devis) ses.get(Devis.class,idDevis);
    }
    
}
