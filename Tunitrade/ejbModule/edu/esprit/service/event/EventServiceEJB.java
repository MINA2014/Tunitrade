package edu.esprit.service.event;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.entities.Event;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
@LocalBean
public class EventServiceEJB implements EventServiceEJBRemote {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "tunitrade")
	private EntityManager em;

	public EventServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Event event) {
		em.persist(event);

	}

	@Override
	public void update(Event event) {
		em.merge(event);

	}

	@Override
	public Event findBY(int id) {

		return em.find(Event.class, id);
	}

	@Override
	public List<Event> findall() {

		return em.createQuery("select e from Event e", Event.class)
				.getResultList();
	}

	@Override
	public void delete(Event event) {
		em.remove(em.merge(event));

	}

}