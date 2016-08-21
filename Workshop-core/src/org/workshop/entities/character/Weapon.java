package org.workshop.entities.character;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Weapon extends Objet{

	private String level;
	
	@OneToOne
	private Damage damage;
	
	
}
