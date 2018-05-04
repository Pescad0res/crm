package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produit.class)
public abstract class Produit_ {

	public static volatile SetAttribute<Produit, Affectation> affectations;
	public static volatile SingularAttribute<Produit, Integer> idP;
	public static volatile SingularAttribute<Produit, String> libProd;
	public static volatile SingularAttribute<Produit, String> chefProd;
	public static volatile SingularAttribute<Produit, String> typeDuProduit;
	public static volatile SingularAttribute<Produit, String> idProd;
	public static volatile SetAttribute<Produit, ContratLogiciel> contratLogiciels;
	public static volatile SingularAttribute<Produit, String> descProd;
	public static volatile SetAttribute<Produit, Reclamation> reclamations;
	public static volatile SingularAttribute<Produit, String> versionProd;
	public static volatile SingularAttribute<Produit, Date> dateCreaProd;

}

