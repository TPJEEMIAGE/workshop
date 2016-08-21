package org.workshop.entities.character;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class ActiveCapacity extends Capacity{
	
	private Integer cooldown;
	
	private Integer currentCooldown;

	/**
	 * @return the cooldown
	 */
	public Integer getCooldown() {
		return cooldown;
	}

	/**
	 * @param cooldown the cooldown to set
	 */
	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}

	/**
	 * @return the currentCooldown
	 */
	public Integer getCurrentCooldown() {
		return currentCooldown;
	}

	/**
	 * @param currentCooldown the currentCooldown to set
	 */
	public void setCurrentCooldown(Integer currentCooldown) {
		this.currentCooldown = currentCooldown;
	}

}
