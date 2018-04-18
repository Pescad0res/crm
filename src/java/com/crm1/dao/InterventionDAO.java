/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.PvIntervention;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface InterventionDAO {
    public void add(PvIntervention inter);
    public PvIntervention edit(PvIntervention inter);
    public PvIntervention delete(Integer idPv);
    public List<PvIntervention> findAll();
    public PvIntervention findByidCli(Integer idPv);
        
}
