package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_subir database table.
 * 
 */
@Embeddable
public class SubirPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	@Column(name="c_statut", insertable=false, updatable=false)
	private Long cStatut;

	public SubirPK() {
	}
	public Long getCPersonnage() {
		return this.cPersonnage;
	}
	public void setCPersonnage(Long cPersonnage) {
		this.cPersonnage = cPersonnage;
	}
	public Long getCStatut() {
		return this.cStatut;
	}
	public void setCStatut(Long cStatut) {
		this.cStatut = cStatut;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SubirPK)) {
			return false;
		}
		SubirPK castOther = (SubirPK)other;
		return 
			this.cPersonnage.equals(castOther.cPersonnage)
			&& this.cStatut.equals(castOther.cStatut);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cPersonnage.hashCode();
		hash = hash * prime + this.cStatut.hashCode();
		
		return hash;
	}
}