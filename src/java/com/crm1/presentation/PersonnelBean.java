/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.PersonnelDAO;
import com.crm1.dao.PersonnelDAOImpl;
import com.crm1.entity.Personnel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="PerBean")
@SessionScoped
public class PersonnelBean {
    PersonnelDAO dao = new PersonnelDAOImpl();
    Personnel per = new Personnel();

    
    public Personnel getPer() {
        return per;
    }

    public void setPer(Personnel per) {
        this.per = per;
    }
    
    
       
}
