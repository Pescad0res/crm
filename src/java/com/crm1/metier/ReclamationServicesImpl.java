/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.dao.ReclamationDAO;
import com.crm1.dao.ReclamationDAOImpl;
import com.crm1.entity.Reclamation;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public class ReclamationServicesImpl implements ReclamationServices {
    
    ReclamationDAO dao = new ReclamationDAOImpl();

    @Override
    public void add(Reclamation r) {
        dao.add(r);
    }

    @Override
    public Reclamation edit(Reclamation r) {
        return dao.edit(r);
    }

    @Override
    public Reclamation delete(Integer idRec) {
        dao.delete(idRec); 
        return null;
    }

    @Override
    public List<Reclamation> findAll() {
        return dao.findAll(); 
    }

    @Override
    public Reclamation findByidRec(Integer idRec) {
        return dao.findByidRec(idRec);
    }
    
}
