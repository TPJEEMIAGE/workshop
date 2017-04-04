package org.workshop.entities.character;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.workshop.entities.Element;

@Entity
@XmlRootElement
public class Character {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private String lastName;
	
	private Element primaryElement;
	
	private Element secondaryElement;
	
	@OneToMany
	@JoinColumn(name="charId")
	private List<Attribute> attributes;
	
	private Integer attributePointsRemaining;
	
	@OneToMany
	private List<WeaponSkill> weaponSkills;
	
	private Integer weaponSkillsPointRemaining;
	
	@OneToMany
	private List<KnowledgeSkill> knowledgeSkills;
	
	private Integer knowledgeSkillsPointRemaining;
	
	@OneToMany
	private List<CompetencySkill> competencySkills;
	
	private Integer competencySkillsPointRemaining;
	
	@OneToMany
	private List<HabilitySkill> habilitySkills;
	
	private Integer habilitySkillsPointRemaining;
	
	@OneToMany
	private List<Job> jobs;
	
	private Integer currentHp;
	
	private Integer currentMp;
	
	private Integer currentMv;
	
	@OneToMany
	private List<Buff> buffs;
	
	@OneToMany
	private List<Debuff> debuffs;
	
	@OneToMany
	private List<Resistance> resistances;
	
	@OneToMany
	private List<Objet> inventory;
	
	@OneToMany
	private List<ActiveCapacity> actives;
	
	@OneToMany
	private List<PassiveCapacity> passives;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the primaryElement
	 */
	public Element getPrimaryElement() {
		return primaryElement;
	}

	/**
	 * @param primaryElement the primaryElement to set
	 */
	public void setPrimaryElement(Element primaryElement) {
		this.primaryElement = primaryElement;
	}

	/**
	 * @return the secondaryElement
	 */
	public Element getSecondaryElement() {
		return secondaryElement;
	}

	/**
	 * @param secondaryElement the secondaryElement to set
	 */
	public void setSecondaryElement(Element secondaryElement) {
		this.secondaryElement = secondaryElement;
	}

	/**
	 * @return the attributes
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the attributePointsRemaining
	 */
	public Integer getAttributePointsRemaining() {
		return attributePointsRemaining;
	}

	/**
	 * @param attributePointsRemaining the attributePointsRemaining to set
	 */
	public void setAttributePointsRemaining(Integer attributePointsRemaining) {
		this.attributePointsRemaining = attributePointsRemaining;
	}

	/**
	 * @return the weaponSkills
	 */
	public List<WeaponSkill> getWeaponSkills() {
		return weaponSkills;
	}

	/**
	 * @param weaponSkills the weaponSkills to set
	 */
	public void setWeaponSkills(List<WeaponSkill> weaponSkills) {
		this.weaponSkills = weaponSkills;
	}

	/**
	 * @return the weaponSkillsPointRemaining
	 */
	public Integer getWeaponSkillsPointRemaining() {
		return weaponSkillsPointRemaining;
	}

	/**
	 * @param weaponSkillsPointRemaining the weaponSkillsPointRemaining to set
	 */
	public void setWeaponSkillsPointRemaining(Integer weaponSkillsPointRemaining) {
		this.weaponSkillsPointRemaining = weaponSkillsPointRemaining;
	}

	/**
	 * @return the knowledgeSkills
	 */
	public List<KnowledgeSkill> getKnowledgeSkills() {
		return knowledgeSkills;
	}

	/**
	 * @param knowledgeSkills the knowledgeSkills to set
	 */
	public void setKnowledgeSkills(List<KnowledgeSkill> knowledgeSkills) {
		this.knowledgeSkills = knowledgeSkills;
	}

	/**
	 * @return the knowledgeSkillsPointRemaining
	 */
	public Integer getKnowledgeSkillsPointRemaining() {
		return knowledgeSkillsPointRemaining;
	}

	/**
	 * @param knowledgeSkillsPointRemaining the knowledgeSkillsPointRemaining to set
	 */
	public void setKnowledgeSkillsPointRemaining(Integer knowledgeSkillsPointRemaining) {
		this.knowledgeSkillsPointRemaining = knowledgeSkillsPointRemaining;
	}

	/**
	 * @return the competencySkills
	 */
	public List<CompetencySkill> getCompetencySkills() {
		return competencySkills;
	}

	/**
	 * @param competencySkills the competencySkills to set
	 */
	public void setCompetencySkills(List<CompetencySkill> competencySkills) {
		this.competencySkills = competencySkills;
	}

	/**
	 * @return the competencySkillsPointRemaining
	 */
	public Integer getCompetencySkillsPointRemaining() {
		return competencySkillsPointRemaining;
	}

	/**
	 * @param competencySkillsPointRemaining the competencySkillsPointRemaining to set
	 */
	public void setCompetencySkillsPointRemaining(Integer competencySkillsPointRemaining) {
		this.competencySkillsPointRemaining = competencySkillsPointRemaining;
	}

	/**
	 * @return the habilitySkills
	 */
	public List<HabilitySkill> getHabilitySkills() {
		return habilitySkills;
	}

	/**
	 * @param habilitySkills the habilitySkills to set
	 */
	public void setHabilitySkills(List<HabilitySkill> habilitySkills) {
		this.habilitySkills = habilitySkills;
	}

	/**
	 * @return the habilitySkillsPointRemaining
	 */
	public Integer getHabilitySkillsPointRemaining() {
		return habilitySkillsPointRemaining;
	}

	/**
	 * @param habilitySkillsPointRemaining the habilitySkillsPointRemaining to set
	 */
	public void setHabilitySkillsPointRemaining(Integer habilitySkillsPointRemaining) {
		this.habilitySkillsPointRemaining = habilitySkillsPointRemaining;
	}

	/**
	 * @return the jobs
	 */
	public List<Job> getJobs() {
		return jobs;
	}

	/**
	 * @param jobs the jobs to set
	 */
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	/**
	 * @return the currentHp
	 */
	public Integer getCurrentHp() {
		return currentHp;
	}

	/**
	 * @param currentHp the currentHp to set
	 */
	public void setCurrentHp(Integer currentHp) {
		this.currentHp = currentHp;
	}

	/**
	 * @return the currentMp
	 */
	public Integer getCurrentMp() {
		return currentMp;
	}

	/**
	 * @param currentMp the currentMp to set
	 */
	public void setCurrentMp(Integer currentMp) {
		this.currentMp = currentMp;
	}

	/**
	 * @return the currentMv
	 */
	public Integer getCurrentMv() {
		return currentMv;
	}

	/**
	 * @param currentMv the currentMv to set
	 */
	public void setCurrentMv(Integer currentMv) {
		this.currentMv = currentMv;
	}

	/**
	 * @return the buffs
	 */
	public List<Buff> getBuffs() {
		return buffs;
	}

	/**
	 * @param buffs the buffs to set
	 */
	public void setBuffs(List<Buff> buffs) {
		this.buffs = buffs;
	}

	/**
	 * @return the debuffs
	 */
	public List<Debuff> getDebuffs() {
		return debuffs;
	}

	/**
	 * @param debuffs the debuffs to set
	 */
	public void setDebuffs(List<Debuff> debuffs) {
		this.debuffs = debuffs;
	}

	/**
	 * @return the resistances
	 */
	public List<Resistance> getResistances() {
		return resistances;
	}

	/**
	 * @param resistances the resistances to set
	 */
	public void setResistances(List<Resistance> resistances) {
		this.resistances = resistances;
	}

	public List<Objet> getInventory() {
		return inventory;
	}

	public void setInventory(List<Objet> inventory) {
		this.inventory = inventory;
	}

	public List<ActiveCapacity> getActives() {
		return actives;
	}

	public void setActives(List<ActiveCapacity> actives) {
		this.actives = actives;
	}

	public List<PassiveCapacity> getPassives() {
		return passives;
	}

	public void setPassives(List<PassiveCapacity> passives) {
		this.passives = passives;
	}
	
	
	
}
