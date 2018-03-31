/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Reclamation;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface ReclamationDAO {
    public void add(Reclamation r);
    public Reclamation edit(Reclamation r);
    public Reclamation delete(Integer idRec);
    public List<Reclamation> findAll();
    public Reclamation findByidRec(Integer idRec);
    
}
