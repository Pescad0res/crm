package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static volatile SingularAttribute<Contact, Integer> idContact;
	public static volatile SingularAttribute<Contact, Client> client;
	public static volatile SingularAttribute<Contact, String> tel;
	public static volatile SingularAttribute<Contact, String> fax;
	public static volatile SingularAttribute<Contact, String> email;

}

