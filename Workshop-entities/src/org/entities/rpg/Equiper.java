package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_equiper database table.
 * 
 */
@Entity
@Table(name="t_equiper")
@NamedQuery(name="Equiper.findAll", query="SELECT e FROM Equiper e")
public class Equiper implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EquiperPK id;

	//bi-directional many-to-one association to ListeEmplacement
	@ManyToOne
	@JoinColumn(name="c_emplacement", insertable=false, updatable=false)
	private ListeEmplacement TListeEmplacement;

	//bi-directional many-to-one association to Objet
	@ManyToOne
	@JoinColumn(name="c_equipement", insertable=false, updatable=false)
	private Objet TObjet;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public Equiper() {
	}

	public EquiperPK getId() {
		return this.id;
	}

	public void setId(EquiperPK id) {
		this.id = id;
	}

	public ListeEmplacement getTListeEmplacement() {
		return this.TListeEmplacement;
	}

	public void setTListeEmplacement(ListeEmplacement TListeEmplacement) {
		this.TListeEmplacement = TListeEmplacement;
	}

	public Objet getTObjet() {
		return this.TObjet;
	}

	public void setTObjet(Objet TObjet) {
		this.TObjet = TObjet;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}