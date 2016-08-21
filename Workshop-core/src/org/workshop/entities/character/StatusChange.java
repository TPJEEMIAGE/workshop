package org.workshop.entities.character;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class StatusChange {

	@EmbeddedId
	private StatusChangeId id;
	
	@ManyToOne
	@MapsId("statusTypeId")
	private StatusChangeType type;

	/**
	 * @return the id
	 */
	public StatusChangeId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(StatusChangeId id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public StatusChangeType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(StatusChangeType type) {
		this.type = type;
	}
	
}
