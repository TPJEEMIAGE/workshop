package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_attribut database table.
 * 
 */
@Entity
@Table(name="t_attribut")
@NamedQuery(name="Attribut.findAll", query="SELECT a FROM Attribut a")
public class Attribut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_ATTRIBUT_ID_GENERATOR", sequenceName="T_ATTRIBUT_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ATTRIBUT_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to Avoir
	@OneToMany(mappedBy="TAttribut")
	private List<Avoir> TAvoirs;

	public Attribut() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Avoir> getTAvoirs() {
		return this.TAvoirs;
	}

	public void setTAvoirs(List<Avoir> TAvoirs) {
		this.TAvoirs = TAvoirs;
	}

	public Avoir addTAvoir(Avoir TAvoir) {
		getTAvoirs().add(TAvoir);
		TAvoir.setTAttribut(this);

		return TAvoir;
	}

	public Avoir removeTAvoir(Avoir TAvoir) {
		getTAvoirs().remove(TAvoir);
		TAvoir.setTAttribut(null);

		return TAvoir;
	}

}