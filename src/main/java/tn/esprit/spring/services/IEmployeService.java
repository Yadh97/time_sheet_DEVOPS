package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;

public interface IEmployeService {
	List<Employe> retrieveAllEmploye(); 
	Employe addEmploye(Employe e);
	void deleteEmploye(String id);
	User updateEmploye(User u);
	User retrieveEmploye(String id);

}
