package edu.esprit.entities;

import javax.persistence.Entity;

@Entity
public class Corporate extends Customer {

	/**
	 * @param args
	 */
	private float capital;
	

	public Corporate() {
	
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}
	

	}

