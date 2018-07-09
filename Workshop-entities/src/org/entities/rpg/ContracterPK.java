package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_contracter database table.
 * 
 */
@Embeddable
public class ContracterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	@Column(name="c_invocation", insertable=false, updatable=false)
	private Long cInvocation;

	public ContracterPK() {
	}
	public Long getCPersonnage() {
		return this.cPersonnage;
	}
	public void setCPersonnage(Long cPersonnage) {
		this.cPersonnage = cPersonnage;
	}
	public Long getCInvocation() {
		return this.cInvocation;
	}
	public void setCInvocation(Long cInvocation) {
		this.cInvocation = cInvocation;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContracterPK)) {
			return false;
		}
		ContracterPK castOther = (ContracterPK)other;
		return 
			this.cPersonnage.equals(castOther.cPersonnage)
			&& this.cInvocation.equals(castOther.cInvocation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cPersonnage.hashCode();
		hash = hash * prime + this.cInvocation.hashCode();
		
		return hash;
	}
}