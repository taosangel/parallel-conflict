package com.pc.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pc.base.constante.Manoeuvre;
import com.pc.base.constante.Pouvoir;
import com.pc.base.constante.Talent;
import com.pc.base.constante.TypeVaisseau;
@Entity
public class Pilote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nom;
	
	private String race;
	
	private Manoeuvre manoeuvre;
	
	private int agiliteMax;
	
	private int renomee;
	
	private int expDisponible;
	
	private Talent talent;
	
	private TypeVaisseau vaisseau;
	
	private Pouvoir pouvoir;

}
