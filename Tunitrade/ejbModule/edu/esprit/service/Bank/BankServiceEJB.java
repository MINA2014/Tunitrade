package edu.esprit.service.Bank;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.entities.Bank;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
@LocalBean
public class BankServiceEJB implements BankServiceEJBRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "tunitrade")
	private EntityManager em;

	public BankServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Bank bank) {
		em.persist(bank);

	}

	@Override
	public void update(Bank bank) {
		em.merge(bank);

	}

	@Override
	public Bank findBY(int id) {

		return em.find(Bank.class, id);
	}

	@Override
	public List<Bank> findall() {

		return em.createQuery("select u from Bank u", Bank.class)
				.getResultList();
	}

	@Override
	public void delete(Bank bank) {
		em.remove(em.merge(bank));

	}

}