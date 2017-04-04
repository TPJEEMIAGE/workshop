package org.workshop.entities.character;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class WeaponSkill extends Skill {

	@OneToMany
	private List<Capacity> weaponCapacities;
	
}
