package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_beneficier database table.
 * 
 */
@Entity
@Table(name="t_beneficier")
@NamedQuery(name="Beneficier.findAll", query="SELECT b FROM Beneficier b")
@Access(AccessType.FIELD)
public class Beneficier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BeneficierPK id;

	@Column(name="c_points_restants")
	private Integer pointsRestants;

	//bi-directional many-to-one association to Personnage
	@ManyToOne
	@JoinColumn(name="c_personnage", insertable=false, updatable=false)
	private Personnage TPersonnage;

	//bi-directional many-to-one association to TypeAptitude
	@ManyToOne
	@JoinColumn(name="c_type_aptitude", insertable=false, updatable=false)
	private TypeAptitude TTypeAptitude;

	public Beneficier() {
	}

	public BeneficierPK getId() {
		return this.id;
	}

	public void setId(BeneficierPK id) {
		this.id = id;
	}

	public Integer getPointsRestants() {
		return this.pointsRestants;
	}

	public void setPointsRestants(Integer pointsRestants) {
		this.pointsRestants = pointsRestants;
	}

	public Personnage getTPersonnage() {
		return this.TPersonnage;
	}

	public void setTPersonnage(Personnage TPersonnage) {
		this.TPersonnage = TPersonnage;
	}

	public TypeAptitude getTTypeAptitude() {
		return this.TTypeAptitude;
	}

	public void setTTypeAptitude(TypeAptitude TTypeAptitude) {
		this.TTypeAptitude = TTypeAptitude;
	}

}