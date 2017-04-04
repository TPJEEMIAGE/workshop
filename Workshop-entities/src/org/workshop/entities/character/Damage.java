package org.workshop.entities.character;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;

@Entity
@XmlRootElement
public class Damage {

	@Id
	@GeneratedValue
	private Long id;
	
	private String damageCalculation;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the damageCalculation
	 */
	public String getDamageCalculation() {
		return damageCalculation;
	}

	/**
	 * @param damageCalculation the damageCalculation to set
	 */
	public void setDamageCalculation(String damageCalculation) {
		this.damageCalculation = damageCalculation;
	}
	
	
}
