package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the t_type_aptitude database table.
 * 
 */
@Entity
@Table(name="t_type_aptitude")
@NamedQuery(name="TypeAptitude.findAll", query="SELECT t FROM TypeAptitude t")
@XmlRootElement
public class TypeAptitude implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_TYPE_APTITUDE_ID_GENERATOR", sequenceName="T_TYPE_APTITUDE_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_TYPE_APTITUDE_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_label")
	private String label;

	public TypeAptitude() {
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

}