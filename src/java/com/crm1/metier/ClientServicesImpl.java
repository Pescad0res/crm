/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.metier;

import com.crm1.entity.Client;
import com.crm1.dao.ClientDAO;
import com.crm1.dao.ClientDAOImpl;
import java.util.List;

/**
 *
 * @author REV DAMAGE
 */
public class ClientServicesImpl implements ClientServices {
    
    ClientDAO dao = new ClientDAOImpl();

    @Override
    public void add(Client c) {
        dao.add(c); 
    }

    @Override
    public Client edit(Client c) {
        return dao.edit(c); 
    }

    @Override
    public Client delete(Integer idCli) {
        dao.delete(idCli); 
        return null;
    }

    @Override
    public List<Client> findAll() {
        return dao.findAll(); 
    }

    @Override
    public Client findByidCli(Integer idCli) {
        return dao.findByidCli(idCli); 
    }

    public Client searchForCode(Integer codeString) {
        return this.dao.searchForCode(codeString);
    }
    
}
