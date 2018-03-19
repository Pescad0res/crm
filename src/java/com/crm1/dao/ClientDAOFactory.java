/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

/**
 *
 * @author REV DAMAGE
 */
public class ClientDAOFactory {
    public static ClientDAO getinstance(){
        return new ClientDAOImpl();
    }
    
}
