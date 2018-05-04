package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Service.class)
public abstract class Service_ {

	public static volatile SingularAttribute<Service, Integer> idServ;
	public static volatile SingularAttribute<Service, String> designServ;
	public static volatile SetAttribute<Service, SelectService> selectServices;

}

