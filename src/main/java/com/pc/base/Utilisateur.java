package com.pc.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String mail;
	
	private String login;
	
	private String password;
		
}
