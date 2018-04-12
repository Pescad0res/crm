/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ProduitDAO;
import com.crm1.dao.ProduitDAOImpl;
import com.crm1.entity.Produit;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="proBean")
@RequestScoped
public class ProduitBean {
  
    ProduitDAO dao = new ProduitDAOImpl();
    Produit pro = new Produit();

    public Produit getPro() {
        return pro;
    }

    public void setPro(Produit pro) {
        this.pro = pro;
    }
    
     public List <Produit> lister(){
        return dao.findAll();
    }
     

}
