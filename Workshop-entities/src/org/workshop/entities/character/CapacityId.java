package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CapacityId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2229525512109448196L;

	private Long charId;
	
	private Long capacityTypeId;

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
	 * @return the capacityTypeId
	 */
	public Long getCapacityTypeId() {
		return capacityTypeId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacityTypeId == null) ? 0 : capacityTypeId.hashCode());
		result = prime * result + ((charId == null) ? 0 : charId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapacityId other = (CapacityId) obj;
		if (capacityTypeId == null) {
			if (other.capacityTypeId != null)
				return false;
		} else if (!capacityTypeId.equals(other.capacityTypeId))
			return false;
		if (charId == null) {
			if (other.charId != null)
				return false;
		} else if (!charId.equals(other.charId))
			return false;
		return true;
	}

	/**
	 * @param capacityTypeId the capacityTypeId to set
	 */
	public void setCapacityTypeId(Long capacityTypeId) {
		this.capacityTypeId = capacityTypeId;
	}
	
}
