package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_emplacement database table.
 * 
 */
@Entity
@Table(name="t_emplacement")
@NamedQuery(name="Emplacement.findAll", query="SELECT e FROM Emplacement e")
public class Emplacement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_EMPLACEMENT_ID_GENERATOR", sequenceName="T_EMPLACEMENT_C_ID_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_EMPLACEMENT_ID_GENERATOR")
	@Column(name="c_id")
	private String id;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-many association to ListeEmplacement
	@ManyToMany(mappedBy="TEmplacements")
	private List<ListeEmplacement> TListeEmplacements;

	public Emplacement() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<ListeEmplacement> getTListeEmplacements() {
		return this.TListeEmplacements;
	}

	public void setTListeEmplacements(List<ListeEmplacement> TListeEmplacements) {
		this.TListeEmplacements = TListeEmplacements;
	}

}