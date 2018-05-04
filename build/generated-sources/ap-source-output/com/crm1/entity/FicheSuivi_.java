package com.crm1.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FicheSuivi.class)
public abstract class FicheSuivi_ {

	public static volatile SingularAttribute<FicheSuivi, String> typeJour;
	public static volatile SingularAttribute<FicheSuivi, String> travaux;
	public static volatile SingularAttribute<FicheSuivi, PvIntervention> pvIntervention;
	public static volatile SingularAttribute<FicheSuivi, Date> dateInterv;
	public static volatile SingularAttribute<FicheSuivi, Integer> idFiche;
	public static volatile SingularAttribute<FicheSuivi, Date> heureDepart;
	public static volatile SingularAttribute<FicheSuivi, Date> heureArrivee;
	public static volatile SingularAttribute<FicheSuivi, String> periode;

}

