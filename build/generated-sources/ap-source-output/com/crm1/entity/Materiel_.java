package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Materiel.class)
public abstract class Materiel_ {

	public static volatile SingularAttribute<Materiel, ContratTechnique> contratTechnique;
	public static volatile SingularAttribute<Materiel, String> typeMat;
	public static volatile SingularAttribute<Materiel, String> versionMat;
	public static volatile SingularAttribute<Materiel, Date> dateInst;
	public static volatile SingularAttribute<Materiel, Integer> idM;
	public static volatile SingularAttribute<Materiel, String> numSerie;
	public static volatile SingularAttribute<Materiel, String> marque;

}

