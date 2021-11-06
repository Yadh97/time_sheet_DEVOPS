package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	EmployeRepository EmployeRepository;
	
	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);	

	@Override
	public List<Employe> retrieveAllEmploye() {
		List<Employe> Employes = null; 
		try {
	
			l.info("In method retrieveEmployes : ");
			Employes = (List<Employe>) EmployeRepository.findAll();  
			l.debug("connexion a la base ok : ");
			for (Employe Employe : Employes) {
				l.debug(" Employe :" +  Employe.getPrenom());
			} 
               l.info("out of method retrieveAllEmployes with success");
		    }
		catch (Exception e) {
               l.error("Out of method retrieveAllEmployes with Errors :" + e); 
		}

		return Employes;
	}

	@Override
	public Employe addEmploye(Employe e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmploye(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateEmploye(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User retrieveEmploye(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
