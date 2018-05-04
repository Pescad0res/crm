package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Activite.class)
public abstract class Activite_ {

	public static volatile SingularAttribute<Activite, Integer> idAct;
	public static volatile SingularAttribute<Activite, String> domaineAct;
	public static volatile SetAttribute<Activite, SelectActivite> selectActivites;
	public static volatile SingularAttribute<Activite, String> descAct;
	public static volatile SingularAttribute<Activite, String> typeAct;

}

