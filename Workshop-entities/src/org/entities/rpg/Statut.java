package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_statut database table.
 * 
 */
@Entity
@Table(name="t_statut")
@NamedQuery(name="Statut.findAll", query="SELECT s FROM Statut s")
public class Statut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_STATUT_ID_GENERATOR", sequenceName="T_STATUT_C_ID_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_STATUT_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_duree_initiale")
	private Integer dureeInitiale;

	@Column(name="c_formula")
	private String formula;

	@Column(name="c_hidden")
	private Boolean hidden;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to Subir
	@OneToMany(mappedBy="TStatut")
	private List<Subir> TSubirs;

	public Statut() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDureeInitiale() {
		return this.dureeInitiale;
	}

	public void setDureeInitiale(Integer dureeInitiale) {
		this.dureeInitiale = dureeInitiale;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Boolean getHidden() {
		return this.hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Subir> getTSubirs() {
		return this.TSubirs;
	}

	public void setTSubirs(List<Subir> TSubirs) {
		this.TSubirs = TSubirs;
	}

	public Subir addTSubir(Subir TSubir) {
		getTSubirs().add(TSubir);
		TSubir.setTStatut(this);

		return TSubir;
	}

	public Subir removeTSubir(Subir TSubir) {
		getTSubirs().remove(TSubir);
		TSubir.setTStatut(null);

		return TSubir;
	}

}