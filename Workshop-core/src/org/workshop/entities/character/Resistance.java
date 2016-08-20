package org.workshop.entities.character;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Resistance {
	
	@EmbeddedId
	private ResistanceId id;

	/**
	 * @return the id
	 */
	public ResistanceId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ResistanceId id) {
		this.id = id;
	}

}
