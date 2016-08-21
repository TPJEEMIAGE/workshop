package org.workshop.entities.character;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Objet {
	
	@EmbeddedId
	private ObjetId id;
	
	private Integer quantity;

	/**
	 * @return the id
	 */
	public ObjetId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjetId id) {
		this.id = id;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
