/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.entity.Produit;
import com.crm1.metier.ProduitServicesImpl;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean
@RequestScoped
@FacesConverter(forClass=Produit.class)
public class ProduitConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String codeString) {
    if (codeString == null && codeString.trim().length() > 0) {
        Integer code = Integer.valueOf(codeString);
        ProduitServicesImpl clientServicesImpl = new ProduitServicesImpl();
        return clientServicesImpl.searchForCode(code);
    }

return null;
}

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object produitObject) {
    if (produitObject == null) {
        return "";
    }

    if (produitObject instanceof Produit) {
        Produit produit = (Produit) produitObject;
        return produit.getIdP().toString();
        
        //return String.valueOf(((Client) clientObject).getIdCli());
    } else {
        throw new ConverterException(new FacesMessage(produitObject + " is not a valid Product"));
    }
    }
}
