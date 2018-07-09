package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_equiper database table.
 * 
 */
@Embeddable
public class EquiperPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_equipement", insertable=false, updatable=false)
	private Long cEquipement;

	@Column(name="c_emplacement", insertable=false, updatable=false)
	private String cEmplacement;

	@Column(name="c_personnage", insertable=false, updatable=false)
	private Long cPersonnage;

	public EquiperPK() {
	}
	public Long getCEquipement() {
		return this.cEquipement;
	}
	public void setCEquipement(Long cEquipement) {
		this.cEquipement = cEquipement;
	}
	public String getCEmplacement() {
		return this.cEmplacement;
	}
	public void setCEmplacement(String cEmplacement) {
		this.cEmplacement = cEmplacement;
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
		if (!(other instanceof EquiperPK)) {
			return false;
		}
		EquiperPK castOther = (EquiperPK)other;
		return 
			this.cEquipement.equals(castOther.cEquipement)
			&& this.cEmplacement.equals(castOther.cEmplacement)
			&& this.cPersonnage.equals(castOther.cPersonnage);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cEquipement.hashCode();
		hash = hash * prime + this.cEmplacement.hashCode();
		hash = hash * prime + this.cPersonnage.hashCode();
		
		return hash;
	}
}