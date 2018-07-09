package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_element database table.
 * 
 */
@Entity
@Table(name="t_element")
@NamedQuery(name="TElement.findAll", query="SELECT t FROM Element t")
public class Element implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_ELEMENT_ID_GENERATOR", sequenceName="T_ELEMENT_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ELEMENT_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to EtreDe
	@OneToMany(mappedBy="TElement")
	private List<EtreDe> TEtreDes;

	public Element() {
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

	public List<EtreDe> getTEtreDes() {
		return this.TEtreDes;
	}

	public void setTEtreDes(List<EtreDe> TEtreDes) {
		this.TEtreDes = TEtreDes;
	}

	public EtreDe addTEtreDe(EtreDe TEtreDe) {
		getTEtreDes().add(TEtreDe);
		TEtreDe.setTElement(this);

		return TEtreDe;
	}

	public EtreDe removeTEtreDe(EtreDe TEtreDe) {
		getTEtreDes().remove(TEtreDe);
		TEtreDe.setTElement(null);

		return TEtreDe;
	}

}