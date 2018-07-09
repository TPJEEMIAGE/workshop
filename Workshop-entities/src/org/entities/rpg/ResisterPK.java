package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_resister database table.
 * 
 */
@Embeddable
public class ResisterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_resistance", insertable=false, updatable=false)
	private Long cResistance;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public ResisterPK() {
	}
	public Long getCResistance() {
		return this.cResistance;
	}
	public void setCResistance(Long cResistance) {
		this.cResistance = cResistance;
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
		if (!(other instanceof ResisterPK)) {
			return false;
		}
		ResisterPK castOther = (ResisterPK)other;
		return 
			this.cResistance.equals(castOther.cResistance)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cResistance.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}