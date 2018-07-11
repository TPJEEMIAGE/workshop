package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_noeud database table.
 * 
 */
@Entity
@Table(name="t_noeud")
@NamedQuery(name="Noeud.findAll", query="SELECT n FROM Noeud n")
public class Noeud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_NOEUD_ID_GENERATOR", sequenceName="T_NOEUD_C_ID_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_NOEUD_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	//bi-directional many-to-one association to Capacite
	@OneToMany(mappedBy="TNoeud")
	private List<Capacite> TCapacites;

	//bi-directional many-to-one association to Job
	@OneToMany(mappedBy="TNoeud")
	private List<Job> TJobs;

	//bi-directional many-to-one association to Capacite
	@ManyToOne
	@JoinColumn(name="c_capacite")
	private Capacite TCapacite;

	//bi-directional many-to-one association to Job
	@ManyToOne
	@JoinColumn(name="c_job")
	private Job TJob;

	//bi-directional many-to-one association to Noeud
	@ManyToOne
	@JoinColumn(name="c_parent")
	private Noeud TNoeud;

	//bi-directional many-to-one association to Noeud
	@OneToMany(mappedBy="TNoeud")
	private List<Noeud> TNoeuds;

	public Noeud() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Capacite> getTCapacites() {
		return this.TCapacites;
	}

	public void setTCapacites(List<Capacite> TCapacites) {
		this.TCapacites = TCapacites;
	}

	public Capacite addTCapacite(Capacite TCapacite) {
		getTCapacites().add(TCapacite);
		TCapacite.setTNoeud(this);

		return TCapacite;
	}

	public Capacite removeTCapacite(Capacite TCapacite) {
		getTCapacites().remove(TCapacite);
		TCapacite.setTNoeud(null);

		return TCapacite;
	}

	public List<Job> getTJobs() {
		return this.TJobs;
	}

	public void setTJobs(List<Job> TJobs) {
		this.TJobs = TJobs;
	}

	public Job addTJob(Job TJob) {
		getTJobs().add(TJob);
		TJob.setTNoeud(this);

		return TJob;
	}

	public Job removeTJob(Job TJob) {
		getTJobs().remove(TJob);
		TJob.setTNoeud(null);

		return TJob;
	}

	public Capacite getTCapacite() {
		return this.TCapacite;
	}

	public void setTCapacite(Capacite TCapacite) {
		this.TCapacite = TCapacite;
	}

	public Job getTJob() {
		return this.TJob;
	}

	public void setTJob(Job TJob) {
		this.TJob = TJob;
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
		TNoeud.setTNoeud(this);

		return TNoeud;
	}

	public Noeud removeTNoeud(Noeud TNoeud) {
		getTNoeuds().remove(TNoeud);
		TNoeud.setTNoeud(null);

		return TNoeud;
	}

}