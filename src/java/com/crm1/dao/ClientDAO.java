/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.dao;

import com.crm1.beans.Client;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public interface ClientDAO {
    public void add(Client c);
    public Client edit(Client c);
    public Client delete(Integer idCli);
    public List<Client> findAll();
    public Client findByidCli(Integer idCli);
    
}
