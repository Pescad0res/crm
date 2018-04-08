
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm1.presentation;

import com.crm1.dao.ClientDAO;
import com.crm1.dao.ClientDAOImpl;
import com.crm1.dao.ProduitDAO;
import com.crm1.dao.ProduitDAOImpl;
import com.crm1.dao.ReclamationDAO;
import com.crm1.dao.ReclamationDAOImpl;
import com.crm1.entity.Client;
import com.crm1.entity.Produit;
import com.crm1.entity.Reclamation;
import com.crm1.metier.ProduitServicesImpl;
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
@ManagedBean(name="recBean")
@RequestScoped
public class ReclamationBean {
    
    
    ReclamationDAO dao = new ReclamationDAOImpl();
    ClientDAO daoclient = new ClientDAOImpl();
    ProduitDAO daoprod = new ProduitDAOImpl();
    
    private Integer idclient1;
    private Integer idproduit;
    private String type;
     private String Situation;
     private String degreurgence;

    public String getDegreurgence() {
        return degreurgence;
    }

    public void setDegreurgence(String degreurgence) {
        this.degreurgence = degreurgence;
    }

    public String getSituation() {
        return Situation;
    }

    public void setSituation(String Situation) {
        this.Situation = Situation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
  
    Reclamation rec = new Reclamation();
    
  private List<SelectItem> clientSelect;
  private List<SelectItem> produitSelect;
  
  
    
private Client cli;
public ReclamationBean() {
    cli = new Client();
}

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }


    public Reclamation getRec() {
        return rec;
    }

    public void setRec(Reclamation rec) {
        this.rec = rec;
    }
    
        public Integer getIdclient1() {
        return idclient1;
    }

    public void setIdclient1(Integer idclient1) {
        this.idclient1 = idclient1;
    }

    public Integer getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Integer idproduit) {
        this.idproduit = idproduit;
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
            
            
                       public List<SelectItem> getProduitSelect() {
            if (produitSelect == null){
                
                produitSelect = new ArrayList<SelectItem>();
                
                ProduitServicesImpl produitServicesImpl = new ProduitServicesImpl();
                List<Produit> listproduits = produitServicesImpl.findAll();
                if(listproduits != null && !listproduits.isEmpty()){
                    SelectItem item;
                    for (Produit produitlist : listproduits) {
                        item = new SelectItem(produitlist.getIdP(), produitlist.getLibProd());
                        produitSelect.add(item);
                        
                    }
                    
                }
  
            }
        return produitSelect;
    }
            
            
            
            
            public void loadclient(Integer idclient1){
                 ClientDAO daoo = new ClientDAOImpl();
                 daoo.findByidCli(idclient1);   
                 
            }
            
            public void loadproduit(Integer idproduit){
                ProduitDAO da = new ProduitDAOImpl();
                da.findByidP(idproduit);
                
            }
            
            
    
public void getinfos(){
    //System.out.println("AAAAAAAAAAAAAAAAAA"+idclient1);
    loadclient(idclient1);
    loadproduit(idproduit);
    
}

            
            
            
    public List <Reclamation> lister(){
        return dao.findAll();
    }
    
    
    public void ajouter(){
        
//loadclient(idclient1);
rec.setClient(daoclient.findByidCli(idclient1));
rec.setProduit(daoprod.findByidP(idproduit));
rec.setTypeRec(type);
rec.setSituation(Situation);
rec.setDegUrgence(degreurgence);

        //rec.setClient(daoclient.findByidCli(2));
       //rec.setProduit(daoprod.findByidP(1));
        dao.add(rec);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ADDED !", ""));
        
    }

public String modif()
{
    rec.setClient(daoclient.findByidCli(idclient1));
    rec.setProduit(daoprod.findByidP(idproduit));
    dao.edit(rec);
    return ("ReclamationAll.xhtml"); 
}

  
    public String rechercher(Integer code)
    {
 
        
        rec = dao.findByidRec(code);
        return ("Reclamation.xhtml");
    }
    
    public void supprimer (Integer code)
    { 
        dao.delete(code);   
    }
    

    
}
