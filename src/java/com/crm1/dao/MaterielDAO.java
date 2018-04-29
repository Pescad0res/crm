/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Materiel;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface MaterielDAO {
    public void add(Materiel m);
    public Materiel edit(Materiel m);
    public Materiel delete(Integer idM);
    public List<Materiel> findAll();
    public Materiel findByidPers(Integer idM);
    
}
