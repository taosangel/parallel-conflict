
package com.pc.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * An item in an order
 */
@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nom;
	
	private Utilisateur utilisateur;
	
	private Hangar hangar;
	
	private Pilote pilote;
	
	@ManyToOne
	private Vaisseau vaisseau;
	
	private long argentTotal;
	
	private long argentDisponible;
}
