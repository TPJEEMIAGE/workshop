package org.workshop.entities.character;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Job {
	
	@EmbeddedId
	private JobId id;
	
	@ManyToOne
	@MapsId("jobTypeId")
	private JobType jobType;
	
	private Integer level;

	/**
	 * @return the id
	 */
	public JobId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(JobId id) {
		this.id = id;
	}

	/**
	 * @return the jobType
	 */
	public JobType getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

}
