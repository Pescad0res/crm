/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.FicheSuivi;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class FicheSuiviDAOImpl  implements FicheSuiviDAO{

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(FicheSuivi fich) {
        ses.beginTransaction();
        ses.save(fich);
        ses.getTransaction().commit();
    }

    @Override
    public FicheSuivi edit(FicheSuivi fich) {
        ses.beginTransaction();
        FicheSuivi fiche = (FicheSuivi) ses.merge(fich);
        ses.getTransaction().commit();
        
        return fiche;
    }

    @Override
    public FicheSuivi delete(Integer idFiche) {
        ses.beginTransaction();
        FicheSuivi fiche = findByidFiche(idFiche);
        ses.delete(fiche);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<FicheSuivi> findAll() {
        return ses.createQuery("select obj from FicheSuivi obj").list();
    }

    @Override
    public FicheSuivi findByidFiche(Integer idFiche) {
        return (FicheSuivi) ses.get(FicheSuivi.class,idFiche);
    }
    
}
