/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.dao.PersonnelDAO;
import com.crm1.dao.PersonnelDAOImpl;
import com.crm1.entity.Personnel;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public class PersonnelServicesImpl implements PersonnelServices{
    PersonnelDAO dao = new PersonnelDAOImpl();

    @Override
    public void add(Personnel p) {
     dao.add(p);    
    }

    @Override
    public Personnel edit(Personnel p) {
     return dao.edit(p);    
    }

    @Override
    public Personnel delete(Integer idPers) {
     dao.delete(idPers); 
       return null;    
    }

    @Override
    public List<Personnel> findAll() {
     return dao.findAll();     
    }

    @Override
    public Personnel findByidCli(Integer idPers) {
     return dao.findByidPers(idPers);    
    }
    
}
