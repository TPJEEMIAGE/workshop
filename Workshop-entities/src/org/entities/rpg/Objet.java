package org.entities.rpg;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_objet database table.
 * 
 */
@Entity
@Table(name="t_objet")
@NamedQuery(name="Objet.findAll", query="SELECT o FROM Objet o")
public class Objet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_OBJET_ID_GENERATOR", sequenceName="T_OBJET_C_ID_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_OBJET_ID_GENERATOR")
	@Column(name="c_id")
	private Long id;

	@Column(name="c_can_attack")
	private Boolean canAttack;

	@Column(name="c_description")
	private String description;

	@Column(name="c_difficulty")
	private Integer difficulty;

	@Column(name="c_discriminator")
	private String discriminator;

	@Column(name="c_formula")
	private String formula;

	@Column(name="c_label")
	private String label;

	@Column(name="c_nb_util_max")
	private Integer nbUtilMax;

	@Column(name="c_price")
	private Integer price;

	@Column(name="c_rarete")
	private String rarete;

	@Column(name="c_type")
	private String type;

	

	//bi-directional many-to-one association to ListeEmplacement
	@ManyToOne
	@JoinColumn(name="c_liste_emplacement")
	private ListeEmplacement TListeEmplacement;

	

	public Objet() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCanAttack() {
		return this.canAttack;
	}

	public void setCanAttack(Boolean canAttack) {
		this.canAttack = canAttack;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getNbUtilMax() {
		return this.nbUtilMax;
	}

	public void setNbUtilMax(Integer nbUtilMax) {
		this.nbUtilMax = nbUtilMax;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getRarete() {
		return this.rarete;
	}

	public void setRarete(String rarete) {
		this.rarete = rarete;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

		

	public ListeEmplacement getTListeEmplacement() {
		return this.TListeEmplacement;
	}

	public void setTListeEmplacement(ListeEmplacement TListeEmplacement) {
		this.TListeEmplacement = TListeEmplacement;
	}

		

}