package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_avoir database table.
 * 
 */
@Embeddable
public class AvoirPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_attribut", insertable=false, updatable=false)
	private Long cAttribut;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public AvoirPK() {
	}
	public Long getCAttribut() {
		return this.cAttribut;
	}
	public void setCAttribut(Long cAttribut) {
		this.cAttribut = cAttribut;
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
		if (!(other instanceof AvoirPK)) {
			return false;
		}
		AvoirPK castOther = (AvoirPK)other;
		return 
			this.cAttribut.equals(castOther.cAttribut)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cAttribut.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}