package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_capable_de database table.
 * 
 */
@Entity
@Table(name="t_capable_de")
@NamedQuery(name="CapableDe.findAll", query="SELECT c FROM CapableDe c")
public class CapableDe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CapableDePK id;

	@Column(name="c_cooldown_actuel")
	private Integer cooldownActuel;

	//bi-directional many-to-one association to Capacite
	@ManyToOne
	@JoinColumn(name="c_capacite", insertable=false, updatable=false)
	private Capacite TCapacite;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public CapableDe() {
	}

	public CapableDePK getId() {
		return this.id;
	}

	public void setId(CapableDePK id) {
		this.id = id;
	}

	public Integer getCooldownActuel() {
		return this.cooldownActuel;
	}

	public void setCooldownActuel(Integer cooldownActuel) {
		this.cooldownActuel = cooldownActuel;
	}

	public Capacite getTCapacite() {
		return this.TCapacite;
	}

	public void setTCapacite(Capacite TCapacite) {
		this.TCapacite = TCapacite;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}