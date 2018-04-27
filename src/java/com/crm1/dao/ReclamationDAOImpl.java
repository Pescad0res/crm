/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Reclamation;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class ReclamationDAOImpl implements ReclamationDAO {

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Reclamation r) {
        ses.beginTransaction();
        ses.save(r);
        ses.getTransaction().commit();
    }

    @Override
    public Reclamation edit(Reclamation r) {
        ses.beginTransaction();
        Reclamation rec = (Reclamation) ses.merge(r);
        ses.getTransaction().commit();
        
        return rec;
    }

    @Override
    public Reclamation delete(Integer idRec) {
        ses.beginTransaction();
        Reclamation rec = findByidRec(idRec);
        ses.delete(rec);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<Reclamation> find() {
return ses.createQuery("select obj from Reclamation obj").list();    
    }
    
    @Override
    public List<Reclamation> findAll() {
        String hql = "FROM Reclamation F WHERE F.typeRec = :rec";
       Query query = ses.createQuery(hql);
     query.setParameter("rec","réclamation logiciel");
     List results = query.list();
     return results;
        
        //return ses.createQuery("select obj from Reclamation obj WHERE Typerec = `réclamation logiciel`").list();
        
    }
    @Override
    public List<Reclamation> findAlltech() {
        String hql = "FROM Reclamation F WHERE F.typeRec = :rec";
       Query query = ses.createQuery(hql);
     query.setParameter("rec","réclamation technique");
     List results = query.list();
     return results;
        
        //return ses.createQuery("select obj from Reclamation obj WHERE Typerec = `réclamation logiciel`").list();
        
    }

    @Override
    public Reclamation findByidRec(Integer idRec) {
        return (Reclamation) ses.get(Reclamation.class,idRec);
    }

    
    
    
}
