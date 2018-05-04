package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personnel.class)
public abstract class Personnel_ {

	public static volatile SingularAttribute<Personnel, String> nat;
	public static volatile SetAttribute<Personnel, Affectation> affectations;
	public static volatile SingularAttribute<Personnel, Integer> idPers;
	public static volatile SingularAttribute<Personnel, String> pwdPers;
	public static volatile SingularAttribute<Personnel, String> superieur;
	public static volatile SingularAttribute<Personnel, String> cin;
	public static volatile SingularAttribute<Personnel, String> etatCivil;
	public static volatile SingularAttribute<Personnel, String> sexe;
	public static volatile SingularAttribute<Personnel, String> cnrps;
	public static volatile SingularAttribute<Personnel, String> prenomPers;
	public static volatile SingularAttribute<Personnel, Date> dateNais;
	public static volatile SingularAttribute<Personnel, Date> dateEmbauche;
	public static volatile SingularAttribute<Personnel, String> grade;
	public static volatile SingularAttribute<Personnel, String> tel;
	public static volatile SingularAttribute<Personnel, String> loginPers;
	public static volatile SingularAttribute<Personnel, String> email;
	public static volatile SingularAttribute<Personnel, String> nomPers;

}

