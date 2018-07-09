package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_classer database table.
 * 
 */
@Embeddable
public class ClasserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_job", insertable=false, updatable=false)
	private Long cJob;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public ClasserPK() {
	}
	public Long getCJob() {
		return this.cJob;
	}
	public void setCJob(Long cJob) {
		this.cJob = cJob;
	}
	public Long getCPersonnage() {
		return this.cPersonnage;
	}
	public void setCPersonnage(Long cPersonnage) {
		this.cPersonnage = cPersonnage;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClasserPK)) {
			return false;
		}
		ClasserPK castOther = (ClasserPK)other;
		return 
			this.cJob.equals(castOther.cJob)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cJob.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}