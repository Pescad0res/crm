/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ContratDAO;
import com.crm1.dao.ContratDAOImpl;
import com.crm1.entity.Contrat;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="conBean")
@RequestScoped
public class ContratBean {
    ContratDAO dao = new ContratDAOImpl();
    Contrat con = new Contrat();

    public Contrat getCon() {
        return con;
    }

    public void setCon(Contrat con) {
        this.con = con;
    }
    
         public List <Contrat> lister(){
        return dao.findAll();
         }
}
