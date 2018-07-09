package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_etre_de database table.
 * 
 */
@Embeddable
public class EtreDePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_element", insertable=false, updatable=false)
	private Long cElement;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public EtreDePK() {
	}
	public Long getCElement() {
		return this.cElement;
	}
	public void setCElement(Long cElement) {
		this.cElement = cElement;
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
		if (!(other instanceof EtreDePK)) {
			return false;
		}
		EtreDePK castOther = (EtreDePK)other;
		return 
			this.cElement.equals(castOther.cElement)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cElement.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}