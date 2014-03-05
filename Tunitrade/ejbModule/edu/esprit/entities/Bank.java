package edu.esprit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Bank extends Customer {

	/**
	 * @param args
	 */
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private float capital;
	private float sell_price;
	private float purchase_price;
	private float solvency_ratio;
	private int nb_transaction;

	public Bank() {

	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public float getSell_price() {
		return sell_price;
	}

	public void setSell_price(float sell_price) {
		this.sell_price = sell_price;
	}

	public float getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(float purchase_price) {
		this.purchase_price = purchase_price;
	}

	public float getSolvency_ratio() {
		return solvency_ratio;
	}

	public void setSolvency_ratio(float solvency_ratio) {
		this.solvency_ratio = solvency_ratio;
	}

	public int getNb_transaction() {
		return nb_transaction;
	}

	public void setNb_transaction(int nb_transaction) {
		this.nb_transaction = nb_transaction;
	}

}
