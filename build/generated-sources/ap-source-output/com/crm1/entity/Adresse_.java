package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adresse.class)
public abstract class Adresse_ {

	public static volatile SingularAttribute<Adresse, Integer> idAdr;
	public static volatile SingularAttribute<Adresse, Integer> ville;
	public static volatile SingularAttribute<Adresse, String> rue;
	public static volatile SingularAttribute<Adresse, Client> client;
	public static volatile SingularAttribute<Adresse, String> etatAdr;
	public static volatile SingularAttribute<Adresse, Integer> codePost;

}

