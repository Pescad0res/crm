/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.test;

import com.crm1.dao.ClientDAO;
import com.crm1.dao.ClientDAOImpl;
import com.crm1.dao.HibernateUtil;
import com.crm1.entity.Client;
import static com.crm1.test.TestClient.fac;
import static com.crm1.test.TestClient.ses;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




/**
 *
 * @author REV DAMAGE
 */
public class getfromdb {
    static Session ses = HibernateUtil.getSession();
    static SessionFactory fac = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {
        Client c = new Client ();
        
       ClientDAO dao =new ClientDAOImpl();
        c=dao.findByidCli(2);
        //c=dao.findAll();
        System.out.println("tfathel :"+c.getLoginCli());
       //List<Client> liste_client=dao.findAll();
        //System.out.println(liste_client);
        
        ses.close();
        fac.close();
    }
    
    
}
