/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Produit;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class ProduitDAOImpl implements ProduitDAO {

    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Produit p) {
        ses.beginTransaction();
        ses.save(p);
        ses.getTransaction().commit();
    }

    @Override
    public Produit edit(Produit p) {
        ses.beginTransaction();
        Produit pro = (Produit) ses.merge(p);
        ses.getTransaction().commit();
        
        return pro;
    }

    @Override
    public Produit delete(Integer idP) {
        ses.beginTransaction();
        Produit cli = findByidP(idP);
        ses.delete(cli);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return ses.createQuery("select obj from Produit obj").list();
    }

    @Override
    public Produit findByidP(Integer idP) {
        return (Produit) ses.get(Produit.class,idP);
    }

    @Override
    public Produit searchForCode(Integer code) {
        return (Produit) this.ses.get(Produit.class, code);
    }
    
}
