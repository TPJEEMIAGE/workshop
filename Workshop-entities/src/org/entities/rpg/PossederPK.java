package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_posseder database table.
 * 
 */
@Embeddable
public class PossederPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_objet", insertable=false, updatable=false)
	private Long cObjet;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public PossederPK() {
	}
	public Long getCObjet() {
		return this.cObjet;
	}
	public void setCObjet(Long cObjet) {
		this.cObjet = cObjet;
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
		if (!(other instanceof PossederPK)) {
			return false;
		}
		PossederPK castOther = (PossederPK)other;
		return 
			this.cObjet.equals(castOther.cObjet)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cObjet.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}