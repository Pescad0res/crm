/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.entity.Personnel;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface PersonnelServices {
    public void add(Personnel p);
    public Personnel edit(Personnel p);
    public Personnel delete(Integer idPers);
    public List<Personnel> findAll();
    public Personnel findByidCli(Integer idPers);
    
    
}
