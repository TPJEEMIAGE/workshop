package org.workshop.entities.character;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class JobId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6135897616169597659L;
	
	private Long jobTypeId;
	
	private Long characterId;
	
	public Long getJobTypeId() {
		return jobTypeId;
	}
	public void setJobTypeId(Long jobTypeId) {
		this.jobTypeId = jobTypeId;
	}
	public Long getCharacterId() {
		return characterId;
	}
	public void setCharacterId(Long characterId) {
		this.characterId = characterId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((characterId == null) ? 0 : characterId.hashCode());
		result = prime * result + ((jobTypeId == null) ? 0 : jobTypeId.hashCode());
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
		JobId other = (JobId) obj;
		if (characterId == null) {
			if (other.characterId != null)
				return false;
		} else if (!characterId.equals(other.characterId))
			return false;
		if (jobTypeId == null) {
			if (other.jobTypeId != null)
				return false;
		} else if (!jobTypeId.equals(other.jobTypeId))
			return false;
		return true;
	}

}
