package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_personnage database table.
 * 
 */
@Entity
@Table(name="t_personnage")
@NamedQuery(name="Personnage.findAll", query="SELECT p FROM Personnage p")
public class Personnage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_PERSONNAGE_ID_GENERATOR", sequenceName="T_PERSONNAGE_C_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_PERSONNAGE_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_current_pm")
	private Integer currentPm;

	@Column(name="c_current_pv")
	private Integer currentPv;

	@Column(name="c_description")
	private String description;

	@Column(name="c_discriminator")
	private String discriminator;

	@Column(name="c_mouvement")
	private Integer mouvement;

	@Column(name="c_nom")
	private String nom;

	@Column(name="c_points_attribut")
	private Integer pointsAttribut;

	@Column(name="c_points_hero")
	private Integer pointsHero;

	@Column(name="c_points_maitre")
	private Integer pointsMaitre;

	@Column(name="c_points_talents")
	private Integer pointsTalents;

	@Column(name="c_prenom")
	private String prenom;

	//bi-directional many-to-one association to Avoir
	@OneToMany(mappedBy="TPersonnage")
	private List<Avoir> TAvoirs;

	//bi-directional many-to-one association to Beneficier
	@OneToMany(mappedBy="TPersonnage")
	private List<Beneficier> TBeneficiers;

	//bi-directional many-to-one association to CapableDe
	@OneToMany(mappedBy="TPersonnage")
	private List<CapableDe> TCapableDes;

	//bi-directional many-to-one association to Classer
	@OneToMany(mappedBy="TPersonnage")
	private List<Classer> TClassers;

	//bi-directional many-to-one association to Connaitre
	@OneToMany(mappedBy="TPersonnage")
	private List<Connaitre> TConnaitres;

	//bi-directional many-to-one association to Contracter
	@OneToMany(mappedBy="TPersonnage1")
	private List<Contracter> TContracters1;

	//bi-directional many-to-one association to Contracter
	@OneToMany(mappedBy="TPersonnage2")
	private List<Contracter> TContracters2;

	//bi-directional many-to-one association to Equiper
	@OneToMany(mappedBy="TPersonnage")
	private List<Equiper> TEquipers;

	//bi-directional many-to-one association to EtreDe
	@OneToMany(mappedBy="TPersonnage")
	private List<EtreDe> TEtreDes;

	//bi-directional many-to-many association to Personnage
	@ManyToMany
	@JoinTable(
		name="t_faire_equipe"
		, joinColumns={
			@JoinColumn(name="c_personnage2")
			}
		, inverseJoinColumns={
			@JoinColumn(name="c_personnage1")
			}
		)
	private List<Personnage> TPersonnages1;

	//bi-directional many-to-many association to Personnage
	@ManyToMany(mappedBy="TPersonnages1")
	private List<Personnage> TPersonnages2;

	//bi-directional many-to-one association to Invoquer
	@OneToMany(mappedBy="TPersonnage1")
	private List<Invoquer> TInvoquers1;

	//bi-directional many-to-one association to Invoquer
	@OneToMany(mappedBy="TPersonnage2")
	private List<Invoquer> TInvoquers2;

	//bi-directional many-to-one association to Posseder
	@OneToMany(mappedBy="TPersonnage")
	private List<Posseder> TPosseders;

	//bi-directional many-to-one association to Resister
	@OneToMany(mappedBy="TPersonnage")
	private List<Resister> TResisters;

	//bi-directional many-to-one association to Subir
	@OneToMany(mappedBy="TPersonnage")
	private List<Subir> TSubirs;

	public Personnage() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCurrentPm() {
		return this.currentPm;
	}

	public void setCurrentPm(Integer currentPm) {
		this.currentPm = currentPm;
	}

	public Integer getCurrentPv() {
		return this.currentPv;
	}

	public void setCurrentPv(Integer currentPv) {
		this.currentPv = currentPv;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Integer getMouvement() {
		return this.mouvement;
	}

	public void setMouvement(Integer mouvement) {
		this.mouvement = mouvement;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPointsAttribut() {
		return this.pointsAttribut;
	}

	public void setPointsAttribut(Integer pointsAttribut) {
		this.pointsAttribut = pointsAttribut;
	}

	public Integer getPointsHero() {
		return this.pointsHero;
	}

	public void setPointsHero(Integer pointsHero) {
		this.pointsHero = pointsHero;
	}

	public Integer getPointsMaitre() {
		return this.pointsMaitre;
	}

	public void setPointsMaitre(Integer pointsMaitre) {
		this.pointsMaitre = pointsMaitre;
	}

	public Integer getPointsTalents() {
		return this.pointsTalents;
	}

	public void setPointsTalents(Integer pointsTalents) {
		this.pointsTalents = pointsTalents;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Avoir> getTAvoirs() {
		return this.TAvoirs;
	}

	public void setTAvoirs(List<Avoir> TAvoirs) {
		this.TAvoirs = TAvoirs;
	}

	public Avoir addTAvoir(Avoir TAvoir) {
		getTAvoirs().add(TAvoir);
		TAvoir.setTPersonnage(this);

		return TAvoir;
	}

	public Avoir removeTAvoir(Avoir TAvoir) {
		getTAvoirs().remove(TAvoir);
		TAvoir.setTPersonnage(null);

		return TAvoir;
	}

	public List<Beneficier> getTBeneficiers() {
		return this.TBeneficiers;
	}

	public void setTBeneficiers(List<Beneficier> TBeneficiers) {
		this.TBeneficiers = TBeneficiers;
	}

	public Beneficier addTBeneficier(Beneficier TBeneficier) {
		getTBeneficiers().add(TBeneficier);
		TBeneficier.setTPersonnage(this);

		return TBeneficier;
	}

	public Beneficier removeTBeneficier(Beneficier TBeneficier) {
		getTBeneficiers().remove(TBeneficier);
		TBeneficier.setTPersonnage(null);

		return TBeneficier;
	}

	public List<CapableDe> getTCapableDes() {
		return this.TCapableDes;
	}

	public void setTCapableDes(List<CapableDe> TCapableDes) {
		this.TCapableDes = TCapableDes;
	}

	public CapableDe addTCapableDe(CapableDe TCapableDe) {
		getTCapableDes().add(TCapableDe);
		TCapableDe.setTPersonnage(this);

		return TCapableDe;
	}

	public CapableDe removeTCapableDe(CapableDe TCapableDe) {
		getTCapableDes().remove(TCapableDe);
		TCapableDe.setTPersonnage(null);

		return TCapableDe;
	}

	public List<Classer> getTClassers() {
		return this.TClassers;
	}

	public void setTClassers(List<Classer> TClassers) {
		this.TClassers = TClassers;
	}

	public Classer addTClasser(Classer TClasser) {
		getTClassers().add(TClasser);
		TClasser.setTPersonnage(this);

		return TClasser;
	}

	public Classer removeTClasser(Classer TClasser) {
		getTClassers().remove(TClasser);
		TClasser.setTPersonnage(null);

		return TClasser;
	}

	public List<Connaitre> getTConnaitres() {
		return this.TConnaitres;
	}

	public void setTConnaitres(List<Connaitre> TConnaitres) {
		this.TConnaitres = TConnaitres;
	}

	public Connaitre addTConnaitre(Connaitre TConnaitre) {
		getTConnaitres().add(TConnaitre);
		TConnaitre.setTPersonnage(this);

		return TConnaitre;
	}

	public Connaitre removeTConnaitre(Connaitre TConnaitre) {
		getTConnaitres().remove(TConnaitre);
		TConnaitre.setTPersonnage(null);

		return TConnaitre;
	}

	public List<Contracter> getTContracters1() {
		return this.TContracters1;
	}

	public void setTContracters1(List<Contracter> TContracters1) {
		this.TContracters1 = TContracters1;
	}

	public Contracter addTContracters1(Contracter TContracters1) {
		getTContracters1().add(TContracters1);
		TContracters1.setTPersonnage1(this);

		return TContracters1;
	}

	public Contracter removeTContracters1(Contracter TContracters1) {
		getTContracters1().remove(TContracters1);
		TContracters1.setTPersonnage1(null);

		return TContracters1;
	}

	public List<Contracter> getTContracters2() {
		return this.TContracters2;
	}

	public void setTContracters2(List<Contracter> TContracters2) {
		this.TContracters2 = TContracters2;
	}

	public Contracter addTContracters2(Contracter TContracters2) {
		getTContracters2().add(TContracters2);
		TContracters2.setTPersonnage2(this);

		return TContracters2;
	}

	public Contracter removeTContracters2(Contracter TContracters2) {
		getTContracters2().remove(TContracters2);
		TContracters2.setTPersonnage2(null);

		return TContracters2;
	}

	public List<Equiper> getTEquipers() {
		return this.TEquipers;
	}

	public void setTEquipers(List<Equiper> TEquipers) {
		this.TEquipers = TEquipers;
	}

	public Equiper addTEquiper(Equiper TEquiper) {
		getTEquipers().add(TEquiper);
		TEquiper.setTPersonnage(this);

		return TEquiper;
	}

	public Equiper removeTEquiper(Equiper TEquiper) {
		getTEquipers().remove(TEquiper);
		TEquiper.setTPersonnage(null);

		return TEquiper;
	}

	public List<EtreDe> getTEtreDes() {
		return this.TEtreDes;
	}

	public void setTEtreDes(List<EtreDe> TEtreDes) {
		this.TEtreDes = TEtreDes;
	}

	public EtreDe addTEtreDe(EtreDe TEtreDe) {
		getTEtreDes().add(TEtreDe);
		TEtreDe.setTPersonnage(this);

		return TEtreDe;
	}

	public EtreDe removeTEtreDe(EtreDe TEtreDe) {
		getTEtreDes().remove(TEtreDe);
		TEtreDe.setTPersonnage(null);

		return TEtreDe;
	}

	public List<Personnage> getTPersonnages1() {
		return this.TPersonnages1;
	}

	public void setTPersonnages1(List<Personnage> TPersonnages1) {
		this.TPersonnages1 = TPersonnages1;
	}

	public List<Personnage> getTPersonnages2() {
		return this.TPersonnages2;
	}

	public void setTPersonnages2(List<Personnage> TPersonnages2) {
		this.TPersonnages2 = TPersonnages2;
	}

	public List<Invoquer> getTInvoquers1() {
		return this.TInvoquers1;
	}

	public void setTInvoquers1(List<Invoquer> TInvoquers1) {
		this.TInvoquers1 = TInvoquers1;
	}

	public Invoquer addTInvoquers1(Invoquer TInvoquers1) {
		getTInvoquers1().add(TInvoquers1);
		TInvoquers1.setTPersonnage1(this);

		return TInvoquers1;
	}

	public Invoquer removeTInvoquers1(Invoquer TInvoquers1) {
		getTInvoquers1().remove(TInvoquers1);
		TInvoquers1.setTPersonnage1(null);

		return TInvoquers1;
	}

	public List<Invoquer> getTInvoquers2() {
		return this.TInvoquers2;
	}

	public void setTInvoquers2(List<Invoquer> TInvoquers2) {
		this.TInvoquers2 = TInvoquers2;
	}

	public Invoquer addTInvoquers2(Invoquer TInvoquers2) {
		getTInvoquers2().add(TInvoquers2);
		TInvoquers2.setTPersonnage2(this);

		return TInvoquers2;
	}

	public Invoquer removeTInvoquers2(Invoquer TInvoquers2) {
		getTInvoquers2().remove(TInvoquers2);
		TInvoquers2.setTPersonnage2(null);

		return TInvoquers2;
	}

	public List<Posseder> getTPosseders() {
		return this.TPosseders;
	}

	public void setTPosseders(List<Posseder> TPosseders) {
		this.TPosseders = TPosseders;
	}

	public Posseder addTPosseder(Posseder TPosseder) {
		getTPosseders().add(TPosseder);
		TPosseder.setTPersonnage(this);

		return TPosseder;
	}

	public Posseder removeTPosseder(Posseder TPosseder) {
		getTPosseders().remove(TPosseder);
		TPosseder.setTPersonnage(null);

		return TPosseder;
	}

	public List<Resister> getTResisters() {
		return this.TResisters;
	}

	public void setTResisters(List<Resister> TResisters) {
		this.TResisters = TResisters;
	}

	public Resister addTResister(Resister TResister) {
		getTResisters().add(TResister);
		TResister.setTPersonnage(this);

		return TResister;
	}

	public Resister removeTResister(Resister TResister) {
		getTResisters().remove(TResister);
		TResister.setTPersonnage(null);

		return TResister;
	}

	public List<Subir> getTSubirs() {
		return this.TSubirs;
	}

	public void setTSubirs(List<Subir> TSubirs) {
		this.TSubirs = TSubirs;
	}

	public Subir addTSubir(Subir TSubir) {
		getTSubirs().add(TSubir);
		TSubir.setTPersonnage(this);

		return TSubir;
	}

	public Subir removeTSubir(Subir TSubir) {
		getTSubirs().remove(TSubir);
		TSubir.setTPersonnage(null);

		return TSubir;
	}

}