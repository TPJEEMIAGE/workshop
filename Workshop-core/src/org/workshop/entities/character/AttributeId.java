package org.workshop.entities.character;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AttributeId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5469032948030355325L;
	
	private Long charId;
	private Long AttrId;
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
	 * @return the attrId
	 */
	public Long getAttrId() {
		return AttrId;
	}
	/**
	 * @param attrId the attrId to set
	 */
	public void setAttrId(Long attrId) {
		AttrId = attrId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AttrId == null) ? 0 : AttrId.hashCode());
		result = prime * result + ((charId == null) ? 0 : charId.hashCode());
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
		AttributeId other = (AttributeId) obj;
		if (AttrId == null) {
			if (other.AttrId != null)
				return false;
		} else if (!AttrId.equals(other.AttrId))
			return false;
		if (charId == null) {
			if (other.charId != null)
				return false;
		} else if (!charId.equals(other.charId))
			return false;
		return true;
	}
}