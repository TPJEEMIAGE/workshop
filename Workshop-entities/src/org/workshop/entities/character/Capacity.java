package org.workshop.entities.character;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Capacity {
	
	@EmbeddedId
	private CapacityId id;
	
	private String description;
	
	private Damage damage;

	/**
	 * @return the id
	 */
	public CapacityId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(CapacityId id) {
		this.id = id;
	}

}
