/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.BonCommande;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface BonCommandeDAO {
        public void add(BonCommande cmd);
    public BonCommande edit(BonCommande cmd);
    public BonCommande delete(Integer idCmd);
    public List<BonCommande> findAll();
    public BonCommande findByidCmd(Integer idCmd);
    
}
