package com.pc.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pc.base.constante.Equipage;
import com.pc.base.constante.Munition;

@Entity
public class Hangar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Vaisseau vaisseau;
	
	private Pilote pilote;
	
	private Equipage equipage;
	
	private Munition munition;
	
	private int reserveBouclier;
	
}
