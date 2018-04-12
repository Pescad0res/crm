/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Devis;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface DevisDAO {
    public void add(Devis dev);
    public Devis edit(Devis dev);
    public Devis delete(Integer idDevis);
    public List<Devis> findAll();
    public Devis findByidDevis(Integer idDevis);
    
}
