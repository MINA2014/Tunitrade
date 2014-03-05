package edu.esprit.service.Corporate;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.entities.Corporate;

@Local
public interface CorporateServiceEJBLocal {
	public void add(Corporate corporate);

	public void update(Corporate corporate);

	public Corporate findBY(int id);

	public List<Corporate> findall();

	public void delete(Corporate corporate);

}
