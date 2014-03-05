package edu.esprit.service.Bank;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.entities.Bank;

@Local
public interface BankServiceEJBLocal {
	public void add(Bank bank);

	public void update(Bank bank);

	public Bank findBY(int id);

	public List<Bank> findall();

	public void delete(Bank bank);

}
