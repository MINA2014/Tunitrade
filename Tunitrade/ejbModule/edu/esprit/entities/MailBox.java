package edu.esprit.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MailBox {

	/**
	 * @param args
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private List<Message> list_message;
	

	public MailBox() {
		
	}

	public List<Message> getList_message() {
		return list_message;
	}

	public void setList_message(List<Message> list_message) {
		this.list_message = list_message;
	}
	

}
