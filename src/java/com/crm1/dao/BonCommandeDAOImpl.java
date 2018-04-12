/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.BonCommande;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class BonCommandeDAOImpl implements BonCommandeDAO{

     Session ses = HibernateUtil.getSession();
    @Override
    public void add(BonCommande cmd) {
        ses.beginTransaction();
        ses.save(cmd);
        ses.getTransaction().commit();
        
        
         
    }

    @Override
    public BonCommande edit(BonCommande cmd) {
        ses.beginTransaction();
        BonCommande commande = (BonCommande) ses.merge(cmd);
        ses.getTransaction().commit();
        
        return commande;
    }

    @Override
    public BonCommande delete(Integer idCmd) {
        ses.beginTransaction();
        BonCommande commande = findByidCmd(idCmd);
        ses.delete(commande);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<BonCommande> findAll() {
        return ses.createQuery("select obj from BonCommande obj").list();
    }

    @Override
    public BonCommande findByidCmd(Integer idCmd) {
        return (BonCommande) ses.get(BonCommande.class,idCmd);
    }
    
}
