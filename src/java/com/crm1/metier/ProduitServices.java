/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.entity.Produit;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface ProduitServices {
      public void add(Produit p);
    public Produit edit(Produit p);
    public Produit delete(Integer idP);
    public List<Produit> findAll();
    public Produit findByidP(Integer idP);
    
}
