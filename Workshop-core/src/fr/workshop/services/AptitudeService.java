package fr.workshop.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.entities.rpg.Aptitude;
import org.entities.rpg.TypeAptitude;

@Stateless
public class AptitudeService {

	@PersistenceContext(unitName="Workshop-entities")
	private EntityManager em;
	
	public List<Aptitude> findAll(){
		List<Aptitude> aptitudes = new ArrayList<>();
		Query q = em.createNamedQuery("Aptitude.findAll");
		aptitudes = q.getResultList();
		return aptitudes;
	}
	
	public void saveAptitude(Aptitude apt){
		if(apt.getId() == null)
			em.persist(apt);
		else
			apt = em.merge(apt);
	}
	
	public void deleteAptitude(Aptitude apt){
		apt = em.merge(apt);
		em.remove(apt);
	}
	
	public List<TypeAptitude> getAptitudeTypes(){
		List<TypeAptitude> types = new ArrayList<>();
		Query q = em.createNamedQuery("TypeAptitude.findAll");
		types = q.getResultList();
		System.out.println(types);
		return types;
	}
	
}
