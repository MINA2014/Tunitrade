package edu.esprit.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class Admin extends User {

	/**
	 * @param args
	 */
	private List<Customer> customers;
@OneToMany(mappedBy="admin")
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	

	
	
	



}
