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
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE 
 */
public class TestClient {
    static Session ses = HibernateUtil.getSession();
    public static void main(String[] args) {
        
       //ses.createQuery("SELECT matFisc from Client matFisc").list();   
       //TEST pull
       //chaima
       
       ClientDAO dao =new ClientDAOImpl();
       
       Client c = new Client ();
       c.setNomCli("Clientv2");
       c.setMatFisc("m004578");
       c.setLoginCli("logv2");
       c.setPwdCli("pwd2v");
       c.setNomCli("newv2");
       c.setNomRep("namev2");
       c.setPrenomRep("prenv2");
       
       dao.add(c);
       
       System.out.println("test add Client Done !! .... ");
       ses.close();
       System.out.println("Session killed !! .... ");
    }
 }
