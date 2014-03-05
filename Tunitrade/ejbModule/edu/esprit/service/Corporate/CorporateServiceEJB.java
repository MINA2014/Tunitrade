package edu.esprit.service.Corporate;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.entities.Corporate;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
@LocalBean
public class CorporateServiceEJB implements CorporateServiceEJBRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "tunitrade")
	private EntityManager em;

	public CorporateServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Corporate Corporate) {
		em.persist(Corporate);

	}

	@Override
	public void update(Corporate Corporate) {
		em.merge(Corporate);

	}

	@Override
	public Corporate findBY(int id) {

		return em.find(Corporate.class, id);
	}

	@Override
	public List<Corporate> findall() {

		return em.createQuery("select u from Corporate u", Corporate.class)
				.getResultList();
	}

	@Override
	public void delete(Corporate corporate) {
		em.remove(em.merge(corporate));

	}

}