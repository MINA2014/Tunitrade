package edu.esprit.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Event {

	/**
	 * @param args
	 */

	
	private int id;
	private String name;
	private String description;
	private Date start_date;
	private Date finish_date;
	private CentralBank centralBank;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

@ManyToOne()
	public CentralBank getCentralBank() {
		return centralBank;
	}

	public void setCentralBank(CentralBank centralBank) {
		this.centralBank = centralBank;
	}

	public Event() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}

}
