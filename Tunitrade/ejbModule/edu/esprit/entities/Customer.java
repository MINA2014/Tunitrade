package edu.esprit.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_costumer")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Customer extends User {

	/**
	 * @param args
	 */
	protected String Name;
	private List<Message> messages; 
	private Admin admin ;
	
	
	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@ManyToMany
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Customer() {
		super();
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}
