package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_capacite database table.
 * 
 */
@Entity
@Table(name="t_capacite")
@NamedQuery(name="Capacite.findAll", query="SELECT c FROM Capacite c")
public class Capacite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_CAPACITE_ID_GENERATOR", sequenceName="T_CAPACITE_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_CAPACITE_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;
	
	@Column(name="c_nom")
	private String nom;

	@Column(name="c_active")
	private Boolean active;

	@Column(name="c_category")
	private String category;

	@Column(name="c_cooldown")
	private Integer cooldown;

	@Column(name="c_cout")
	private String cout;

	@Column(name="c_description")
	private String description;

	@Column(name="c_fast_capacity")
	private Boolean fastCapacity;

	@Column(name="c_formula")
	private String formula;
	
	@Column(name="c_special")
	private String special;

	@Column(name="c_hidden")
	private Boolean hidden;

	@Column(name="c_reaction")
	private Boolean reaction;

	//bi-directional many-to-one association to CapableDe
	@OneToMany(mappedBy="TCapacite")
	private List<CapableDe> TCapableDes;

	//bi-directional many-to-one association to Aptitude
	@ManyToOne
	@JoinColumn(name="c_aptitude")
	private Aptitude TAptitude;

	//bi-directional many-to-one association to Noeud
	@ManyToOne
	@JoinColumn(name="c_noeud")
	private Noeud TNoeud;

	//bi-directional many-to-one association to Noeud
	@OneToMany(mappedBy="TCapacite")
	private List<Noeud> TNoeuds;

	public Capacite() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActive() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}

	/**
	 * @return the special
	 */
	public String getSpecial() {
		return special;
	}

	/**
	 * @param special the special to set
	 */
	public void setSpecial(String special) {
		this.special = special;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}

	public String getCout() {
		return this.cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFastCapacity() {
		return this.fastCapacity;
	}

	public void setFastCapacity(Boolean fastCapacity) {
		this.fastCapacity = fastCapacity;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Boolean getHidden() {
		return this.hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Boolean getReaction() {
		return this.reaction;
	}

	public void setReaction(Boolean reaction) {
		this.reaction = reaction;
	}

	public List<CapableDe> getTCapableDes() {
		return this.TCapableDes;
	}

	public void setTCapableDes(List<CapableDe> TCapableDes) {
		this.TCapableDes = TCapableDes;
	}

	public CapableDe addTCapableDe(CapableDe TCapableDe) {
		getTCapableDes().add(TCapableDe);
		TCapableDe.setTCapacite(this);

		return TCapableDe;
	}

	public CapableDe removeTCapableDe(CapableDe TCapableDe) {
		getTCapableDes().remove(TCapableDe);
		TCapableDe.setTCapacite(null);

		return TCapableDe;
	}

	public Aptitude getTAptitude() {
		return this.TAptitude;
	}

	public void setTAptitude(Aptitude TAptitude) {
		this.TAptitude = TAptitude;
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
		TNoeud.setTCapacite(this);

		return TNoeud;
	}

	public Noeud removeTNoeud(Noeud TNoeud) {
		getTNoeuds().remove(TNoeud);
		TNoeud.setTCapacite(null);

		return TNoeud;
	}

}