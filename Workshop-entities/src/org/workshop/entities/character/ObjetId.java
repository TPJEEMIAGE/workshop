package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ObjetId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8779621997101788325L;
	
	private Long charId;
	
	private Long objetTypeId;

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
	 * @return the objetTypeId
	 */
	public Long getObjetTypeId() {
		return objetTypeId;
	}

	/**
	 * @param objetTypeId the objetTypeId to set
	 */
	public void setObjetTypeId(Long objetTypeId) {
		this.objetTypeId = objetTypeId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charId == null) ? 0 : charId.hashCode());
		result = prime * result + ((objetTypeId == null) ? 0 : objetTypeId.hashCode());
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
		ObjetId other = (ObjetId) obj;
		if (charId == null) {
			if (other.charId != null)
				return false;
		} else if (!charId.equals(other.charId))
			return false;
		if (objetTypeId == null) {
			if (other.objetTypeId != null)
				return false;
		} else if (!objetTypeId.equals(other.objetTypeId))
			return false;
		return true;
	}
	
	
}
