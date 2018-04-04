/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ProduitDAO;
import com.crm1.dao.ProduitDAOImpl;
import com.crm1.entity.Produit;
import com.crm1.metier.ProduitServicesImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="proBean")
@RequestScoped
public class ProduitBean {
    private List<SelectItem> clientSelect;
    ProduitDAO dao = new ProduitDAOImpl();
    Produit pro = new Produit();

    public Produit getPro() {
        return pro;
    }

    public void setPro(Produit pro) {
        this.pro = pro;
    }
    
            public List<SelectItem> getProduitSelect() {
            if (clientSelect == null){
                
                clientSelect = new ArrayList<SelectItem>();
                
                ProduitServicesImpl clientServicesImpl = new ProduitServicesImpl();
                List<Produit> listClients = clientServicesImpl.findAll();
                if(listClients != null && !listClients.isEmpty()){
                    SelectItem item;
                    for (Produit clientlist : listClients) {
                        item = new SelectItem(clientlist , clientlist.getLibProd());
                        clientSelect.add(item);
                        
                    }
                    
                }
  
            }
        return clientSelect;
    }

}
