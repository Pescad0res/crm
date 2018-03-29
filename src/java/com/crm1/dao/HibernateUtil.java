/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;


import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author REV DAMAGE
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new Configuration().configure("/com/crm1/config/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
     public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getSession(){
        return sessionFactory.openSession();
    
    }
    public static Session GetCurrentSession(){
        return sessionFactory.getCurrentSession();
    
    }
    
    public static void close(){
        if (sessionFactory != null){
            sessionFactory.close();
        }
        sessionFactory = null;
    }
}