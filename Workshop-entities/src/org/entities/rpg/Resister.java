package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_resister database table.
 * 
 */
@Entity
@Table(name="t_resister")
@NamedQuery(name="Resister.findAll", query="SELECT r FROM Resister r")
public class Resister implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ResisterPK id;

	@Column(name="c_base")
	private Integer base;

	@Column(name="c_bonus")
	private Integer bonus;

	@Column(name="c_total")
	private Integer total;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	//bi-directional many-to-one association to Resistance
	@ManyToOne
	@JoinColumn(name="c_resistance", insertable=false, updatable=false)
	private Resistance TResistance;

	public Resister() {
	}

	public ResisterPK getId() {
		return this.id;
	}

	public void setId(ResisterPK id) {
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

	public Resistance getTResistance() {
		return this.TResistance;
	}

	public void setTResistance(Resistance TResistance) {
		this.TResistance = TResistance;
	}

}