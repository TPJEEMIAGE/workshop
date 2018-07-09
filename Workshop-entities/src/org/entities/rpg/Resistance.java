package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_resistance database table.
 * 
 */
@Entity
@Table(name="t_resistance")
@NamedQuery(name="Resistance.findAll", query="SELECT r FROM Resistance r")
public class Resistance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_RESISTANCE_ID_GENERATOR", sequenceName="T_RESISTANCE_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_RESISTANCE_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to Resister
	@OneToMany(mappedBy="TResistance")
	private List<Resister> TResisters;

	public Resistance() {
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

	public List<Resister> getTResisters() {
		return this.TResisters;
	}

	public void setTResisters(List<Resister> TResisters) {
		this.TResisters = TResisters;
	}

	public Resister addTResister(Resister TResister) {
		getTResisters().add(TResister);
		TResister.setTResistance(this);

		return TResister;
	}

	public Resister removeTResister(Resister TResister) {
		getTResisters().remove(TResister);
		TResister.setTResistance(null);

		return TResister;
	}

}