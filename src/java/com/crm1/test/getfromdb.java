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
        //c=dao.findByidCli(2);
        //System.out.println("tfathel :"+c.getLoginCli());
        
       List<Client> liste_client=dao.findAll();
        
        for (int i=0;i<liste_client.size();i++){
            c =(Client)liste_client.get(i);
            System.out.print("|"+c.getIdCli());
            System.out.print("|"+c.getMatFisc());
            System.out.print("|"+c.getNomRep());
            System.out.print("|"+c.getLoginCli());
            System.out.print("|"+c.getNomRep());
            System.out.print("|"+c.getPrenomRep()+"|");
            System.out.println(" ");
        }
        
        ses.close();
        fac.close();
    }
    
    
}
