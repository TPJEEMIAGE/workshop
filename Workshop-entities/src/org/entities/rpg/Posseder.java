package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_posseder database table.
 * 
 */
@Entity
@Table(name="t_posseder")
@NamedQuery(name="Posseder.findAll", query="SELECT p FROM Posseder p")
public class Posseder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PossederPK id;

	@Column(name="c_counter")
	private Integer counter;

	@Column(name="c_nb_util")
	private Integer nbUtil;

	@Column(name="c_quantite")
	private Integer quantite;

	//bi-directional many-to-one association to Objet
	@ManyToOne
	@JoinColumn(name="c_objet", insertable=false, updatable=false)
	private Objet TObjet;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public Posseder() {
	}

	public PossederPK getId() {
		return this.id;
	}

	public void setId(PossederPK id) {
		this.id = id;
	}

	public Integer getCounter() {
		return this.counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Integer getNbUtil() {
		return this.nbUtil;
	}

	public void setNbUtil(Integer nbUtil) {
		this.nbUtil = nbUtil;
	}

	public Integer getQuantite() {
		return this.quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
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