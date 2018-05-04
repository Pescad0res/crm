package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reclamation.class)
public abstract class Reclamation_ {

	public static volatile SingularAttribute<Reclamation, String> nomRec;
	public static volatile SingularAttribute<Reclamation, Integer> idRec;
	public static volatile SingularAttribute<Reclamation, Produit> produit;
	public static volatile SingularAttribute<Reclamation, String> descCli;
	public static volatile SingularAttribute<Reclamation, Date> dateCreRec;
	public static volatile SingularAttribute<Reclamation, Boolean> preventive;
	public static volatile SingularAttribute<Reclamation, Affectation> affectation;
	public static volatile SingularAttribute<Reclamation, String> typeRec;
	public static volatile SingularAttribute<Reclamation, Integer> estimation;
	public static volatile SingularAttribute<Reclamation, String> degUrgence;
	public static volatile SingularAttribute<Reclamation, Date> dateDebut;
	public static volatile SingularAttribute<Reclamation, String> descExpert;
	public static volatile SingularAttribute<Reclamation, Boolean> recEstim;
	public static volatile SingularAttribute<Reclamation, Client> client;
	public static volatile SingularAttribute<Reclamation, String> persEstim;
	public static volatile SingularAttribute<Reclamation, Date> dateFin;
	public static volatile SetAttribute<Reclamation, ListeMatriel> listeMatriels;
	public static volatile SingularAttribute<Reclamation, String> situation;
	public static volatile SetAttribute<Reclamation, PvIntervention> pvInterventions;

}

