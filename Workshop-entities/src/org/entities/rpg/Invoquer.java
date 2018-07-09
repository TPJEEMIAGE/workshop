package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_invoquer database table.
 * 
 */
@Entity
@Table(name="t_invoquer")
@NamedQuery(name="Invoquer.findAll", query="SELECT i FROM Invoquer i")
public class Invoquer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvoquerPK id;

	@Column(name="c_duree_inv")
	private Integer dureeInv;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_minion", insertable=false, updatable=false)
	private Personnage TPersonnage1;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage2;

	public Invoquer() {
	}

	public InvoquerPK getId() {
		return this.id;
	}

	public void setId(InvoquerPK id) {
		this.id = id;
	}

	public Integer getDureeInv() {
		return this.dureeInv;
	}

	public void setDureeInv(Integer dureeInv) {
		this.dureeInv = dureeInv;
	}

	public Personnage getTPersonnage1() {
		return this.TPersonnage1;
	}

	public void setTPersonnage1(Personnage TPersonnage1) {
		this.TPersonnage1 = TPersonnage1;
	}

	public Personnage getTPersonnage2() {
		return this.TPersonnage2;
	}

	public void setTPersonnage2(Personnage TPersonnage2) {
		this.TPersonnage2 = TPersonnage2;
	}

}