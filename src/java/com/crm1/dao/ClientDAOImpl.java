/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.entity.Client;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author REV DAMAGE
 */
public class ClientDAOImpl implements ClientDAO {

    
    Session ses = HibernateUtil.getSession();
    @Override
    public void add(Client c) {
        ses.beginTransaction();
        ses.save(c);
        ses.getTransaction().commit();
        
        
         
    }

    @Override
    public Client edit(Client c) {
        ses.beginTransaction();
        Client cli = (Client) ses.merge(c);
        ses.getTransaction().commit();
        
        return cli;
    }

    @Override
    public Client delete(Integer idCli) {
        ses.beginTransaction();
        Client cli = findByidCli(idCli);
        ses.delete(cli);
        ses.getTransaction().commit();
        return null;
    }

    @Override
    public  List<Client> findAll() {
        return ses.createQuery("select obj from Client obj").list();
    }

    @Override
    public Client findByidCli(Integer idCli) {
        return (Client) ses.get(Client.class,idCli);
    }

    @Override
    public Client searchForCode(Integer code) {
        return (Client) this.ses.get(Client.class, code);
    }
    
    
}//class
