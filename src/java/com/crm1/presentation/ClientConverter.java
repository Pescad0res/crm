/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ClientDAO;
import com.crm1.entity.Client;
import com.crm1.metier.ClientServices;
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
@FacesConverter(value ="ClientConverter")
public class ClientConverter implements Converter{
    
    private ClientDAO clientDAO;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
    if (submittedValue == null || submittedValue.isEmpty()) {
        return null;
    }

    try {
        return clientDAO.findByidCli(Integer.valueOf(submittedValue));
    } catch (NumberFormatException e) {
        throw new ConverterException(new FacesMessage(submittedValue + " is not a valid Client ID"), e);
    }
}

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
    if (modelValue == null) {
        return "";
    }

    if (modelValue instanceof ClientBean) {
        return String.valueOf(((ClientBean) modelValue).cli.getIdCli());
    } else {
        throw new ConverterException(new FacesMessage(modelValue + " is not a valid Client"));
    }
    }
    
}
