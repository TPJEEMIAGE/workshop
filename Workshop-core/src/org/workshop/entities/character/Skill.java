package org.workshop.entities.character;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Skill {

	@EmbeddedId
	private SkillId id;
	
	private Integer basis;
	
	private Integer bonus;
	
	private Integer total;
	
	@ManyToOne
	@MapsId("skillTypeId")
	private SkillType skillType;
	
	/**
	 * @return the id
	 */
	public SkillId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(SkillId id) {
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

}
