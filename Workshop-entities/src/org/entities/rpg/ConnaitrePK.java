package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_connaitre database table.
 * 
 */
@Embeddable
public class ConnaitrePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_aptitude", insertable=false, updatable=false)
	private Long cAptitude;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public ConnaitrePK() {
	}
	public Long getCAptitude() {
		return this.cAptitude;
	}
	public void setCAptitude(Long cAptitude) {
		this.cAptitude = cAptitude;
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
		if (!(other instanceof ConnaitrePK)) {
			return false;
		}
		ConnaitrePK castOther = (ConnaitrePK)other;
		return 
			this.cAptitude.equals(castOther.cAptitude)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cAptitude.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}