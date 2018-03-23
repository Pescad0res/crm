/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.test;


import com.crm1.entity.Client;
import com.crm1.dao.ClientDAO;
//import com.crm1.dao.ClientDAOFactory;
import com.crm1.dao.ClientDAOImpl;
import com.crm1.dao.HibernateUtil;
import static com.crm1.dao.HibernateUtil.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author REV DAMAGE 
 */
public class TestClient {
    static Session ses = HibernateUtil.getSession();
    static SessionFactory fac = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {
        
       //ses.createQuery("SELECT matFisc from Client matFisc").list();   
       //TEST pull
       //chaima
       
       ClientDAO dao =new ClientDAOImpl();
       
       Client c = new Client ();
       c.setNomCli("Clientv4");
       c.setMatFisc("m004580");
       c.setLoginCli("logv4");
       c.setPwdCli("pwd4v");
       c.setNomCli("newv4");
       c.setNomRep("namev4");
       c.setPrenomRep("prenv4");
       
       dao.add(c);
       
       System.out.println("test add Client Done !! .... ");
       ses.close();
       fac.close();
       System.out.println("Session & Factory KILL3D !! .... ");
       
    }
 }
