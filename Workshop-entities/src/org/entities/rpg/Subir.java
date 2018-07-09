package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_subir database table.
 * 
 */
@Entity
@Table(name="t_subir")
@NamedQuery(name="Subir.findAll", query="SELECT s FROM Subir s")
public class Subir implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SubirPK id;

	@Column(name="c_duree_restante")
	private Integer dureeRestante;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	//bi-directional many-to-one association to Statut
	@ManyToOne
	@JoinColumn(name="c_statut", insertable=false, updatable=false)
	private Statut TStatut;

	public Subir() {
	}

	public SubirPK getId() {
		return this.id;
	}

	public void setId(SubirPK id) {
		this.id = id;
	}

	public Integer getDureeRestante() {
		return this.dureeRestante;
	}

	public void setDureeRestante(Integer dureeRestante) {
		this.dureeRestante = dureeRestante;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

	public Statut getTStatut() {
		return this.TStatut;
	}

	public void setTStatut(Statut TStatut) {
		this.TStatut = TStatut;
	}

}