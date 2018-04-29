/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Materiel;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class MaterielDAOImpl implements MaterielDAO{

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Materiel m) {
        ses.beginTransaction();
        ses.save(m);
        ses.getTransaction().commit();    
    }

    @Override
    public Materiel edit(Materiel m) {
        ses.beginTransaction();
        Materiel mat = (Materiel) ses.merge(m);
        ses.getTransaction().commit();
        
        return mat;    
    }

    @Override
    public Materiel delete(Integer idM) {
        ses.beginTransaction();
        Materiel mat = findByidPers(idM);
        ses.delete(mat);
        ses.getTransaction().commit();
        return null;   
    }

    @Override
    public List<Materiel> findAll() {
       return ses.createQuery("select obj from Materiel obj").list();    
    }

    @Override
    public Materiel findByidPers(Integer idM) {
        return (Materiel) ses.get(Materiel.class,idM); 
    }
    
}
