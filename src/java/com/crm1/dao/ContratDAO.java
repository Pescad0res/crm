/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Contrat;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface ContratDAO {
    
    public void add(Contrat con);
    public Contrat edit(Contrat con);
    public Contrat delete(Integer idC);
    public List<Contrat> findAll();
    public Contrat findByidCli(Integer idC);
    
}
