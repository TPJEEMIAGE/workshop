package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Attribute {

	@EmbeddedId
	private AttributeId id;
	
	private Integer basis;
	
	private Integer bonus;
	
	private Integer total;
	
	private Integer modifier;
	
	@ManyToOne
	@MapsId("AttrId")
	private AttributeType attType;
	
	
	/**
	 * @return the id
	 */
	public AttributeId getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(AttributeId id) {
		this.id = id;
	}


	/**
	 * @return the basis
	 */
	public Integer getBasis() {
		return basis;
	}


	/**
	 * @param basis the basis to set
	 */
	public void setBasis(Integer basis) {
		this.basis = basis;
	}


	/**
	 * @return the bonus
	 */
	public Integer getBonus() {
		return bonus;
	}


	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}


	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}


	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}


	/**
	 * @return the modifier
	 */
	public Integer getModifier() {
		return modifier;
	}


	/**
	 * @param modifier the modifier to set
	 */
	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
}
