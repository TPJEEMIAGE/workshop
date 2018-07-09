package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_capable_de database table.
 * 
 */
@Embeddable
public class CapableDePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_capacite", insertable=false, updatable=false)
	private Long cCapacite;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public CapableDePK() {
	}
	public Long getCCapacite() {
		return this.cCapacite;
	}
	public void setCCapacite(Long cCapacite) {
		this.cCapacite = cCapacite;
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
		if (!(other instanceof CapableDePK)) {
			return false;
		}
		CapableDePK castOther = (CapableDePK)other;
		return 
			this.cCapacite.equals(castOther.cCapacite)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cCapacite.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}