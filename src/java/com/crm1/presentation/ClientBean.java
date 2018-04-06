/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ClientDAO;
import com.crm1.dao.ClientDAOImpl;
import com.crm1.dao.HibernateUtil;
import com.crm1.entity.Client;
import com.crm1.metier.ClientServicesImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="CliBean")
@RequestScoped
public class ClientBean {
    
 
    
   ClientDAO dao = new ClientDAOImpl();
   public Client cli = new Client();

   
  
    public String logcli;
    
    

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    


    
    
    
    /*public List<Client> lister(){
        return dao.findAll();
    }*/
    
    
    public String LoginCheck(){
     
     Session ses = HibernateUtil.getSession();
     SessionFactory fac = HibernateUtil.getSessionFactory();
     ses.getTransaction();
     
     
             List<Client> list = ses.createSQLQuery("select * from client where login_cli='" + cli.getLoginCli() + "' and pwd_cli='" + cli.getPwdCli() + "'").list();
             if (list.size() > 0) {
                 //servlet session part
                 
                 logcli = cli.getLoginCli();
                
                 
                 HttpSession hs = sessionUtil.getSession();
                 hs.setAttribute("logcli",logcli);
                 //servlet session part
                 //BootFaces
                 FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                 FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
                 //BootFaces
                 
            return "/ReclamationAll.xhtml?faces-redirect=true";
        } else {
                //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "client not found", ""));
                
                //BootFaces
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "client not found !");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
                //BootFaces
                
               }
        try {
            ses.getTransaction().commit();
        } catch (Exception e) {
        }
        ses.close();
        return null;
        }
       
    public String doLogout(){
        HttpSession hs = sessionUtil.getSession();
        hs.invalidate();
        return "/index.xhtml";
         }
        
                        }