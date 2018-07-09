package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_job database table.
 * 
 */
@Entity
@Table(name="t_job")
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_JOB_ID_GENERATOR", sequenceName="T_JOB_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_JOB_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_description")
	private String description;

	@Column(name="c_label")
	private String label;

	//bi-directional many-to-one association to Classer
	@OneToMany(mappedBy="TJob")
	private List<Classer> TClassers;

	//bi-directional many-to-one association to Noeud
	@ManyToOne
	@JoinColumn(name="c_noeud")
	private Noeud TNoeud;

	//bi-directional many-to-one association to Noeud
	@OneToMany(mappedBy="TJob")
	private List<Noeud> TNoeuds;

	public Job() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Classer> getTClassers() {
		return this.TClassers;
	}

	public void setTClassers(List<Classer> TClassers) {
		this.TClassers = TClassers;
	}

	public Classer addTClasser(Classer TClasser) {
		getTClassers().add(TClasser);
		TClasser.setTJob(this);

		return TClasser;
	}

	public Classer removeTClasser(Classer TClasser) {
		getTClassers().remove(TClasser);
		TClasser.setTJob(null);

		return TClasser;
	}

	public Noeud getTNoeud() {
		return this.TNoeud;
	}

	public void setTNoeud(Noeud TNoeud) {
		this.TNoeud = TNoeud;
	}

	public List<Noeud> getTNoeuds() {
		return this.TNoeuds;
	}

	public void setTNoeuds(List<Noeud> TNoeuds) {
		this.TNoeuds = TNoeuds;
	}

	public Noeud addTNoeud(Noeud TNoeud) {
		getTNoeuds().add(TNoeud);
		TNoeud.setTJob(this);

		return TNoeud;
	}

	public Noeud removeTNoeud(Noeud TNoeud) {
		getTNoeuds().remove(TNoeud);
		TNoeud.setTJob(null);

		return TNoeud;
	}

}