package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Affectation.class)
public abstract class Affectation_ {

	public static volatile SetAttribute<Affectation, Affectation> affectationsForIntervLog;
	public static volatile SingularAttribute<Affectation, Integer> idRec;
	public static volatile SingularAttribute<Affectation, Produit> produit;
	public static volatile SingularAttribute<Affectation, Date> dateDebut;
	public static volatile SetAttribute<Affectation, Affectation> affectationsForRespTech;
	public static volatile SingularAttribute<Affectation, Personnel> personnel;
	public static volatile SingularAttribute<Affectation, String> dexExpert;
	public static volatile SingularAttribute<Affectation, Date> dateFin;
	public static volatile SingularAttribute<Affectation, Reclamation> reclamation;
	public static volatile SingularAttribute<Affectation, Affectation> affectationByIntervLog;
	public static volatile SingularAttribute<Affectation, Affectation> affectationByRespTech;

}

