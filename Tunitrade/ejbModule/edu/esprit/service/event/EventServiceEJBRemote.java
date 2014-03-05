package edu.esprit.service.event;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.entities.Event;

@Remote
public interface EventServiceEJBRemote {
	public void add(Event event);

	public void update(Event event);

	public Event findBY(int id);

	public List<Event> findall();

	public void delete(Event event);

}
