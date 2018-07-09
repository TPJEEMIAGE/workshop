package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_invoquer database table.
 * 
 */
@Embeddable
public class InvoquerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	@Column(name="c_minion", insertable=false, updatable=false)
	private Long cMinion;

	public InvoquerPK() {
	}
	public Long getCPersonnage() {
		return this.cPersonnage;
	}
	public void setCPersonnage(Long cPersonnage) {
		this.cPersonnage = cPersonnage;
	}
	public Long getCMinion() {
		return this.cMinion;
	}
	public void setCMinion(Long cMinion) {
		this.cMinion = cMinion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvoquerPK)) {
			return false;
		}
		InvoquerPK castOther = (InvoquerPK)other;
		return 
			this.cPersonnage.equals(castOther.cPersonnage)
			&& this.cMinion.equals(castOther.cMinion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cPersonnage.hashCode();
		hash = hash * prime + this.cMinion.hashCode();
		
		return hash;
	}
}