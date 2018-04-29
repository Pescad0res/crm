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
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="CliBean")

@SessionScoped
public class ClientBean {
    
 
    
   ClientDAO dao = new ClientDAOImpl();
   public Client cli = new Client();

   
  
    public String logcli;
    public int idcli;
    public String nomcli;

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }
    
    
    

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    public String getLogcli() {
        return logcli;
    }

    public void setLogcli(String logcli) {
        this.logcli = logcli;
    }


    
    /*public List<Client> lister(){
        return dao.findAll();
    }*/
    
    
    public String LoginCheck(){
     
     Session ses = HibernateUtil.getSession();
     SessionFactory fac = HibernateUtil.getSessionFactory();
     ses.getTransaction();
     
     /*cli=dao.checkLogin(cli.getLoginCli(), cli.getPwdCli());
     if(cli!=null){
         System.out.println("Id_Client: "+cli.getIdCli());
     }
     else{
         System.out.println("login or Pwd !!!!");
     }*/
     
             List<Client> list = ses.createSQLQuery("select * from client where login_cli='" + cli.getLoginCli() + "' and pwd_cli='" + cli.getPwdCli() + "'").list();
             if (list.size() > 0) {
             cli=dao.checkLogin(cli.getLoginCli(), cli.getPwdCli());
             
            
             //if(cli!=null){
         System.out.println("Id_Client: "+cli.getIdCli());
     
                 //servlet session part
                 //cli=list.get(0);
                 logcli = cli.getLoginCli();
                 
                 //System.out.println(cli.getIdCli());
                 idcli = cli.getIdCli();
                 Integer aux = idcli;
                 cli.setIdCli(aux);
                 nomcli = cli.getNomCli();
                
                 
                 HttpSession hs = sessionUtil.getSession();
                 hs.setAttribute("logcli",logcli);
                 hs.setAttribute("idcli", idcli);
                 hs.setAttribute("nomcli", nomcli);
                 
                 //servlet session part
                 //BootFaces
                 FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                 FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
                 //BootFaces
                 System.out.println("LOG"+logcli);
            return "/ReclamationAll.xhtml?faces-redirect=true";
        } else  {
                //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "client not found", ""));
                 System.out.println("oups");
                //BootFaces
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Client n'existe pas !");
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