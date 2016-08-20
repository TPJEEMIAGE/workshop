package org.workshop.entities.character;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Job {
	
	@EmbeddedId
	private JobId id;

}
