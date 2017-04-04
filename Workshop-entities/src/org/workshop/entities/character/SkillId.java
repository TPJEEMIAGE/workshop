package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SkillId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1951231851349213706L;
	
	private Long charId;
	private Long skillTypeId;
	/**
	 * @return the charId
	 */
	public Long getCharId() {
		return charId;
	}
	/**
	 * @param charId the charId to set
	 */
	public void setCharId(Long charId) {
		this.charId = charId;
	}
	/**
	 * @return the skillTypeId
	 */
	public Long getSkillTypeId() {
		return skillTypeId;
	}
	/**
	 * @param skillTypeId the skillTypeId to set
	 */
	public void setSkillTypeId(Long skillTypeId) {
		this.skillTypeId = skillTypeId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charId == null) ? 0 : charId.hashCode());
		result = prime * result + ((skillTypeId == null) ? 0 : skillTypeId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillId other = (SkillId) obj;
		if (charId == null) {
			if (other.charId != null)
				return false;
		} else if (!charId.equals(other.charId))
			return false;
		if (skillTypeId == null) {
			if (other.skillTypeId != null)
				return false;
		} else if (!skillTypeId.equals(other.skillTypeId))
			return false;
		return true;
	}
}
