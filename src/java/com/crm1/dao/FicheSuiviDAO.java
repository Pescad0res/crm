/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.FicheSuivi;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface FicheSuiviDAO {
    public void add(FicheSuivi fich);
    public FicheSuivi edit(FicheSuivi fich);
    public FicheSuivi delete(Integer idFiche);
    public List<FicheSuivi> findAll();
    public FicheSuivi findByidFiche(Integer idFiche);
    
}
