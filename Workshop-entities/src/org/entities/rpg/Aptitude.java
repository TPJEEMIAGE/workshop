package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the t_aptitude database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="t_aptitude")
@NamedQueries({
	@NamedQuery(name="Aptitude.findAll", query="SELECT a FROM Aptitude a"),
	@NamedQuery(name="Aptitude.findFromType", query="SELECT a FROM Aptitude a WHERE a.TTypeAptitude = ?1")
})

public class Aptitude implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_APTITUDE_ID_GENERATOR", sequenceName="T_APTITUDE_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_APTITUDE_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_hidden")
	private Boolean hidden;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to TypeAptitude
	@ManyToOne
	@JoinColumn(name="c_type_aptitude")
	private TypeAptitude TTypeAptitude;

	public Aptitude() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TypeAptitude getTTypeAptitude() {
		return this.TTypeAptitude;
	}

	public void setTTypeAptitude(TypeAptitude TTypeAptitude) {
		this.TTypeAptitude = TTypeAptitude;
	}

	

}