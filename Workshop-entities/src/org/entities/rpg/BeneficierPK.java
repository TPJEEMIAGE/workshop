package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_beneficier database table.
 * 
 */
@Embeddable
public class BeneficierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	@Column(name="c_type_aptitude", insertable=false, updatable=false)
	private Long cTypeAptitude;

	public BeneficierPK() {
	}
	public Long getCPersonnage() {
		return this.cPersonnage;
	}
	public void setCPersonnage(Long cPersonnage) {
		this.cPersonnage = cPersonnage;
	}
	public Long getCTypeAptitude() {
		return this.cTypeAptitude;
	}
	public void setCTypeAptitude(Long cTypeAptitude) {
		this.cTypeAptitude = cTypeAptitude;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BeneficierPK)) {
			return false;
		}
		BeneficierPK castOther = (BeneficierPK)other;
		return 
			this.cPersonnage.equals(castOther.cPersonnage)
			&& this.cTypeAptitude.equals(castOther.cTypeAptitude);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cPersonnage.hashCode();
		hash = hash * prime + this.cTypeAptitude.hashCode();
		
		return hash;
	}
}