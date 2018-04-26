/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ClientDAO;
import com.crm1.dao.ClientDAOImpl;
import com.crm1.dao.ContratDAO;
import com.crm1.dao.ContratDAOImpl;
import com.crm1.entity.Client;
import com.crm1.entity.Contrat;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author REV DAMAGE
 */
@ManagedBean(name="rfBean")
@RequestScoped
public class ResponsableFinancierBean {
    ClientDAO daocli =  new  ClientDAOImpl();
    ContratDAO daocont = new ContratDAOImpl();
    
    Client cli = new Client();
    Contrat cont= new Contrat();
    
    private Integer idclient;
    private Integer idcontrat;
    
    private List<SelectItem> clientSelect;
    private List<SelectItem> contactSelect;

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(Integer idcontrat) {
        this.idcontrat = idcontrat;
    }
    
    

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    public Contrat getCont() {
        return cont;
    }

    public void setCont(Contrat cont) {
        this.cont = cont;
    }
    
            public List<SelectItem> getClientSelect() {
            if (clientSelect == null){
                
                clientSelect = new ArrayList<SelectItem>();
                
                ClientDAO clientDAO = new ClientDAOImpl();
                List<Client> listClients = clientDAO.findAll();
                if(listClients != null && !listClients.isEmpty()){
                    SelectItem item;
                    for (Client clientlist : listClients) {
                        item = new SelectItem(clientlist.getIdCli() , clientlist.getNomCli());
                  
                        clientSelect.add(item);
                        
                    }
                    
                }
  
            }
        return clientSelect;
    }
               public void loadclient(Integer idclient){
                 ClientDAO daoo = new ClientDAOImpl();
                 daoo.findByidCli(idclient);   
                 
            }
    
          public List <Client> listercli(){
        return daocli.findAll();
    }
       public List <Contrat> listercont(){
        return daocont.findAll();
    }
    
         public String recherchercli(Integer code)
    {
        cli = daocli.findByidCli(code);
        return ("rfclimodif.xhtml");
    }
               public String recherchercont(Integer code)
    {
        cont = daocont.findByidC(code);
        return ("rfcont.xhtml");
    }
    
    public void supprimercli (Integer code)
    { 
        daocli.delete(code);   
    }
    public void supprimercont (Integer code)
    { 
        daocont.delete(code);   
    }
    
    
    
     public void ajoutercli(){
         
       daocli.add(cli);
       //cont.setClient(daocli.findByidCli(idclient));
     
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }
     public void ajoutercont(){
        daocont.add(cont);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }

    public String modifcli()
{
    cli.setIdCli(null);
    daocli.edit(cli);
    return ("rfcliAll.xhtml"); 
}
        public String modifcont()
{
    
    daocont.edit(cont);
    return ("rfcontAll.xhtml"); 
}
    
}
