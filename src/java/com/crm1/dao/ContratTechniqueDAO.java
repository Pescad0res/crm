/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.ContratTechnique;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface ContratTechniqueDAO {
    public void add(ContratTechnique ct);
    public ContratTechnique edit(ContratTechnique ct);
    public ContratTechnique delete(Integer idC);
    public List<ContratTechnique> findAll();
    public ContratTechnique findByidtech(Integer idC);
    
}
