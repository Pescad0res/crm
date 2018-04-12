/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Facture;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface FactureDAO {
    public void add(Facture fac);
    public Facture edit(Facture fac);
    public Facture delete(Integer idFacture);
    public List<Facture> findAll();
    public Facture findByidFacture(Integer idFacture);
    
}
