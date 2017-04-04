package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StatusChangeId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4709387783624299987L;

	private Long statusTypeId;
	
	private Long charID;

	/**
	 * @return the statusTypeId
	 */
	public Long getStatusTypeId() {
		return statusTypeId;
	}

	/**
	 * @param statusTypeId the statusTypeId to set
	 */
	public void setStatusTypeId(Long statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	/**
	 * @return the charID
	 */
	public Long getCharID() {
		return charID;
	}

	/**
	 * @param charID the charID to set
	 */
	public void setCharID(Long charID) {
		this.charID = charID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charID == null) ? 0 : charID.hashCode());
		result = prime * result + ((statusTypeId == null) ? 0 : statusTypeId.hashCode());
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
		StatusChangeId other = (StatusChangeId) obj;
		if (charID == null) {
			if (other.charID != null)
				return false;
		} else if (!charID.equals(other.charID))
			return false;
		if (statusTypeId == null) {
			if (other.statusTypeId != null)
				return false;
		} else if (!statusTypeId.equals(other.statusTypeId))
			return false;
		return true;
	}
	
	
	
}
