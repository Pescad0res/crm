/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Personnel;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class PersonnelDAOImpl  implements PersonnelDAO{
    

Session ses = HibernateUtil.getSession();
    @Override
    public void add(Personnel p) {
        ses.beginTransaction();
        ses.save(p);
        ses.getTransaction().commit();    
    }

    @Override
    public Personnel edit(Personnel p) {
        ses.beginTransaction();
        Personnel per = (Personnel) ses.merge(p);
        ses.getTransaction().commit();
        
        return per;    
    }

    @Override
    public Personnel delete(Integer idPers) {
ses.beginTransaction();
        Personnel per = findByidPers(idPers);
        ses.delete(per);
        ses.getTransaction().commit();
        return null;    
    }

    @Override
    public List<Personnel> findAll() {
return ses.createQuery("select obj from Personnel obj").list();    
    }

    @Override
    public Personnel findByidPers(Integer idPers) {
return (Personnel) ses.get(Personnel.class,idPers);    
    }
    
    
}
