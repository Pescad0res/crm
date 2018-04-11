/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.HibernateUtil;
import com.crm1.dao.PersonnelDAO;
import com.crm1.dao.PersonnelDAOImpl;
import com.crm1.entity.Personnel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author REV DAMAGE
 */

@ManagedBean(name="PerBean")
@RequestScoped
public class PersonnelBean {
    PersonnelDAO dao = new PersonnelDAOImpl();
    Personnel per = new Personnel();
    
    public String logper;
     
    public Personnel getPer() {
        return per;
    }

    public void setPer(Personnel per) {
        this.per = per;
    }
    
    public String LoginCheck(){
     
     Session ses = HibernateUtil.getSession();
     SessionFactory fac = HibernateUtil.getSessionFactory();
     ses.getTransaction();
     
     
             List<Personnel> list = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "ddp" + "'").list();
             List<Personnel> list1 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "cdp" + "'").list();
             List<Personnel> list2 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "il" + "'").list();
             List<Personnel> list3 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "rt" + "'").list();
             List<Personnel> list4 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "rh" + "'").list();
             List<Personnel> list5 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "tech" + "'").list();
             List<Personnel> list6 = ses.createSQLQuery("select * from personnel where  Login_pers='" + per.getLoginPers() + "' and Pwd_pers='" + per.getPwdPers() + "' and grade='" + "rf" + "'").list();
             
             if (list.size() > 0) {
                logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/directeur.xhtml?faces-redirect=true";
        }else if (list1.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/chef.xhtml?faces-redirect=true";
            
        }
        else if (list2.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/intervenant_logiciel.xhtml?faces-redirect=true";
            
        }
        else if (list3.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/responsable_technique.xhtml?faces-redirect=true";
            
        }
        else if (list4.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/rh.xhtml?faces-redirect=true";
            
        }
        else if (list5.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/technicien.xhtml?faces-redirect=true";
            
        }
        else if (list6.size() > 0) {
            logper = per.getLoginPers();
                HttpSession hs = sessionUtil.getSession();
                hs.setAttribute("logper",logper);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
                FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
             
            return "/responsble_financier.xhtml?faces-redirect=true";
            
        }
             else {
          
                //BootFaces
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Personel n'existe pas !");
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
    
    
    
    

    
    
    
    public void ajouter(){
        
        dao.add(per);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }
       
}
