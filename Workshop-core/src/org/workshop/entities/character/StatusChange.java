package org.workshop.entities.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StatusChange {

	@Id
	@GeneratedValue
	private Long id;
	
}
