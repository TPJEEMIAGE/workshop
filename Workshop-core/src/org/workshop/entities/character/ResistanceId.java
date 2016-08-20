package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ResistanceId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9185122412022077664L;
	
	private Long resTypeId;
	
	private Long charId;

	public Long getResTypeId() {
		return resTypeId;
	}

	public void setResTypeId(Long resTypeId) {
		this.resTypeId = resTypeId;
	}

	public Long getCharId() {
		return charId;
	}

	public void setCharId(Long charId) {
		this.charId = charId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charId == null) ? 0 : charId.hashCode());
		result = prime * result + ((resTypeId == null) ? 0 : resTypeId.hashCode());
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
		ResistanceId other = (ResistanceId) obj;
		if (charId == null) {
			if (other.charId != null)
				return false;
		} else if (!charId.equals(other.charId))
			return false;
		if (resTypeId == null) {
			if (other.resTypeId != null)
				return false;
		} else if (!resTypeId.equals(other.resTypeId))
			return false;
		return true;
	}
	
	
}
