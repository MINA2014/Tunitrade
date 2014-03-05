package edu.esprit.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	private int id;
	private Customer sender;
	private Customer receiver;
	private Date date;
	private String body;
	private List <Customer> customers;
	
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

@ManyToMany(mappedBy="messages")
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Message() {

	}

	public Customer getSender() {
		return sender;
	}

	public void setSender(Customer sender) {
		this.sender = sender;
	}

	public Customer getReceiver() {
		return receiver;
	}

	public void setReceiver(Customer receiver) {
		this.receiver = receiver;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
