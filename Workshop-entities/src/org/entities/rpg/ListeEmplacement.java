package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_liste_emplacement database table.
 * 
 */
@Entity
@Table(name="t_liste_emplacement")
@NamedQuery(name="ListeEmplacement.findAll", query="SELECT l FROM ListeEmplacement l")
public class ListeEmplacement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_LISTE_EMPLACEMENT_ID_GENERATOR", sequenceName="T_LISTE_EMPLACEMENT_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_LISTE_EMPLACEMENT_ID_GENERATOR")
	@Column(name="c_id")
	private String id;

	//bi-directional many-to-many association to Emplacement
	@ManyToMany
	@JoinTable(
		name="t_comprend"
		, joinColumns={
			@JoinColumn(name="c_liste_emplacement")
			}
		, inverseJoinColumns={
			@JoinColumn(name="c_emplacement")
			}
		)
	private List<Emplacement> TEmplacements;

	//bi-directional many-to-one association to Equiper
	@OneToMany(mappedBy="TListeEmplacement")
	private List<Equiper> TEquipers;

	//bi-directional many-to-one association to Objet
	@OneToMany(mappedBy="TListeEmplacement")
	private List<Objet> TObjets;

	public ListeEmplacement() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Emplacement> getTEmplacements() {
		return this.TEmplacements;
	}

	public void setTEmplacements(List<Emplacement> TEmplacements) {
		this.TEmplacements = TEmplacements;
	}

	public List<Equiper> getTEquipers() {
		return this.TEquipers;
	}

	public void setTEquipers(List<Equiper> TEquipers) {
		this.TEquipers = TEquipers;
	}

	public Equiper addTEquiper(Equiper TEquiper) {
		getTEquipers().add(TEquiper);
		TEquiper.setTListeEmplacement(this);

		return TEquiper;
	}

	public Equiper removeTEquiper(Equiper TEquiper) {
		getTEquipers().remove(TEquiper);
		TEquiper.setTListeEmplacement(null);

		return TEquiper;
	}

	public List<Objet> getTObjets() {
		return this.TObjets;
	}

	public void setTObjets(List<Objet> TObjets) {
		this.TObjets = TObjets;
	}

	public Objet addTObjet(Objet TObjet) {
		getTObjets().add(TObjet);
		TObjet.setTListeEmplacement(this);

		return TObjet;
	}

	public Objet removeTObjet(Objet TObjet) {
		getTObjets().remove(TObjet);
		TObjet.setTListeEmplacement(null);

		return TObjet;
	}

}