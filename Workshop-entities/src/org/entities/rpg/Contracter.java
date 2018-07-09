package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_contracter database table.
 * 
 */
@Entity
@Table(name="t_contracter")
@NamedQuery(name="Contracter.findAll", query="SELECT c FROM Contracter c")
public class Contracter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContracterPK id;

	@Column(name="c_active")
	private Boolean active;

	@Column(name="c_nv_lien")
	private Integer nvLien;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_invocation", insertable=false, updatable=false)
	private Personnage TPersonnage1;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage2;

	public Contracter() {
	}

	public ContracterPK getId() {
		return this.id;
	}

	public void setId(ContracterPK id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getNvLien() {
		return this.nvLien;
	}

	public void setNvLien(Integer nvLien) {
		this.nvLien = nvLien;
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