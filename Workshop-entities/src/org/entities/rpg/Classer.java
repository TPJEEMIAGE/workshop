package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_classer database table.
 * 
 */
@Entity
@Table(name="t_classer")
@NamedQuery(name="Classer.findAll", query="SELECT c FROM Classer c")
public class Classer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClasserPK id;

	@Column(name="c_niveau")
	private Integer niveau;

	//bi-directional many-to-one association to Job
	@ManyToOne
	@JoinColumn(name="c_job", insertable=false, updatable=false)
	private Job TJob;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	public Classer() {
	}

	public ClasserPK getId() {
		return this.id;
	}

	public void setId(ClasserPK id) {
		this.id = id;
	}

	public Integer getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public Job getTJob() {
		return this.TJob;
	}

	public void setTJob(Job TJob) {
		this.TJob = TJob;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

}