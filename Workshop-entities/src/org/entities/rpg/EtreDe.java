package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_etre_de database table.
 * 
 */
@Entity
@Table(name="t_etre_de")
@NamedQuery(name="EtreDe.findAll", query="SELECT e FROM EtreDe e")
public class EtreDe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EtreDePK id;

	@Column(name="c_primaire")
	private Boolean primaire;

	//bi-directional many-to-one association to TElement
	@ManyToOne
	@JoinColumn(name="c_element", insertable=false, updatable=false)
	private Element TElement;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public EtreDe() {
	}

	public EtreDePK getId() {
		return this.id;
	}

	public void setId(EtreDePK id) {
		this.id = id;
	}

	public Boolean getPrimaire() {
		return this.primaire;
	}

	public void setPrimaire(Boolean primaire) {
		this.primaire = primaire;
	}

	public Element getTElement() {
		return this.TElement;
	}

	public void setTElement(Element TElement) {
		this.TElement = TElement;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}