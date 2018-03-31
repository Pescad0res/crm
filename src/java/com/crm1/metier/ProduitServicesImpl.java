/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.dao.ProduitDAO;
import com.crm1.dao.ProduitDAOImpl;
import com.crm1.entity.Produit;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public class ProduitServicesImpl implements ProduitServices{

    ProduitDAO dao = new ProduitDAOImpl();
    @Override
    public void add(Produit p) {
        dao.add(p); 
    }

    @Override
    public Produit edit(Produit p) {
        return dao.edit(p);
    }

    @Override
    public Produit delete(Integer idP) {
        dao.delete(idP); 
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return dao.findAll();
    }

    @Override
    public Produit findByidP(Integer idP) {
        return dao.findByidP(idP);
    }
    
}
