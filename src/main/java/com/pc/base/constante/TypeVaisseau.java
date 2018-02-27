package com.pc.base.constante;

import javax.persistence.Entity;

@Entity
public class TypeVaisseau {

	private String classe;
	
	private String sousClasse;

	private int attaque;
	
	private int agilite;
	
	private int coque;
	
	private int bouclier;
	
	private Action action;
	
	private Slot slot;
	
	private int renomee;
	
	private int prerequis;
	
	private int reparation;
	
	private int valeur;
	
}
