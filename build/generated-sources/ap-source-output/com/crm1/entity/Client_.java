package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Client.class)
public abstract class Client_ {

	public static volatile SingularAttribute<Client, String> matFisc;
	public static volatile SingularAttribute<Client, Integer> idCli;
	public static volatile SingularAttribute<Client, String> nomRep;
	public static volatile SetAttribute<Client, Contrat> contrats;
	public static volatile SingularAttribute<Client, String> nomCli;
	public static volatile SingularAttribute<Client, String> loginCli;
	public static volatile SetAttribute<Client, SelectActivite> selectActivites;
	public static volatile SingularAttribute<Client, String> pwdCli;
	public static volatile SetAttribute<Client, Reclamation> reclamations;
	public static volatile SetAttribute<Client, Adresse> adresses;
	public static volatile SingularAttribute<Client, String> prenomRep;
	public static volatile SetAttribute<Client, Contact> contacts;

}

