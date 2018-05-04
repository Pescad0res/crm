package com.crm1.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PvIntervention.class)
public abstract class PvIntervention_ {

	public static volatile SingularAttribute<PvIntervention, Integer> idPv;
	public static volatile SingularAttribute<PvIntervention, String> observGen;
	public static volatile SetAttribute<PvIntervention, Controle> controles;
	public static volatile SingularAttribute<PvIntervention, Reclamation> reclamation;
	public static volatile SetAttribute<PvIntervention, SelectService> selectServices;
	public static volatile SetAttribute<PvIntervention, FicheSuivi> ficheSuivis;

}

