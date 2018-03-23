/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="CliBean")
@RequestScoped
public class ClientBean {
    private Integer idCli;
     private String matFisc;
     private String nomCli;
     private String loginCli;
     private String pwdCli;
     
     public void saveData(ActionEvent e){
         System.out.println("Client login :"+loginCli);
     }

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getMatFisc() {
        return matFisc;
    }

    public void setMatFisc(String matFisc) {
        this.matFisc = matFisc;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getLoginCli() {
        return loginCli;
    }

    public void setLoginCli(String loginCli) {
        this.loginCli = loginCli;
    }

    public String getPwdCli() {
        return pwdCli;
    }

    public void setPwdCli(String pwdCli) {
        this.pwdCli = pwdCli;
    }

    public String getNomRep() {
        return nomRep;
    }

    public void setNomRep(String nomRep) {
        this.nomRep = nomRep;
    }

    public String getPrenomRep() {
        return prenomRep;
    }

    public void setPrenomRep(String prenomRep) {
        this.prenomRep = prenomRep;
    }
     private String nomRep;
     private String prenomRep;
    
}
