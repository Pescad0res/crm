package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contrat.class)
public abstract class Contrat_ {

	public static volatile SingularAttribute<Contrat, ContratTechnique> contratTechnique;
	public static volatile SingularAttribute<Contrat, Date> dateSign;
	public static volatile SingularAttribute<Contrat, Date> dateEffet;
	public static volatile SingularAttribute<Contrat, Integer> nbInterPrev;
	public static volatile SetAttribute<Contrat, ContratLogiciel> contratLogiciels;
	public static volatile SingularAttribute<Contrat, Date> dateContrat;
	public static volatile SingularAttribute<Contrat, Integer> idC;
	public static volatile SingularAttribute<Contrat, Client> client;
	public static volatile SingularAttribute<Contrat, Integer> duree;
	public static volatile SingularAttribute<Contrat, Date> dateFin;
	public static volatile SingularAttribute<Contrat, String> idContrat;
	public static volatile SingularAttribute<Contrat, String> refManuelle;

}

