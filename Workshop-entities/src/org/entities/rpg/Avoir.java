package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_avoir database table.
 * 
 */
@Entity
@Table(name="t_avoir")
@NamedQuery(name="Avoir.findAll", query="SELECT a FROM Avoir a")
public class Avoir implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvoirPK id;

	@Column(name="c_base")
	private Integer base;

	@Column(name="c_bonus")
	private Integer bonus;

	@Column(name="c_modificateur")
	private Integer modificateur;

	@Column(name="c_total")
	private Integer total;

	//bi-directional many-to-one association to Attribut
	@ManyToOne
	@JoinColumn(name="c_attribut", insertable=false, updatable=false)
	private Attribut TAttribut;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public Avoir() {
	}

	public AvoirPK getId() {
		return this.id;
	}

	public void setId(AvoirPK id) {
		this.id = id;
	}

	public Integer getBase() {
		return this.base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getBonus() {
		return this.bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	public Integer getModificateur() {
		return this.modificateur;
	}

	public void setModificateur(Integer modificateur) {
		this.modificateur = modificateur;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Attribut getTAttribut() {
		return this.TAttribut;
	}

	public void setTAttribut(Attribut TAttribut) {
		this.TAttribut = TAttribut;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}