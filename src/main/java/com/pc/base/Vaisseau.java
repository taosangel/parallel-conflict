package com.pc.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pc.base.constante.TypeVaisseau;

@Entity
public class Vaisseau {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nom;
	
	private TypeVaisseau typeVaisseau;
	
	private int slotDisponible;
	
	private int renommee;
	
	private int modificateurAttaque;

	private int modificateurAgilite;
	
	private int modificateurCoque;
	
	private int modificateurBouclier;
	
	private int valeurTotal;

}
