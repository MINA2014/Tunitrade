package edu.esprit.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity

public class CentralBank extends User {

	/**
	 * @param args
	 */
	private String name;
	private float interestRate;
	
	private List<Event> events; 
	

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
@OneToMany(mappedBy="centralBank")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public CentralBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
