package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_connaitre database table.
 * 
 */
@Entity
@Table(name="t_connaitre")
@NamedQuery(name="Connaitre.findAll", query="SELECT c FROM Connaitre c")
public class Connaitre implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConnaitrePK id;

	@Column(name="c_base")
	private Integer base;

	@Column(name="c_bonus")
	private Integer bonus;

	@Column(name="c_total")
	private Integer total;

	//bi-directional many-to-one association to Aptitude
	@ManyToOne
	@JoinColumn(name="c_aptitude", insertable=false, updatable=false)
	private Aptitude TAptitude;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public Connaitre() {
	}

	public ConnaitrePK getId() {
		return this.id;
	}

	public void setId(ConnaitrePK id) {
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

	public Aptitude getTAptitude() {
		return this.TAptitude;
	}

	public void setTAptitude(Aptitude TAptitude) {
		this.TAptitude = TAptitude;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}