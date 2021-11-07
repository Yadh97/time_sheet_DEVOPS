package tn.esprit.spring.services;
import java.text.ParseException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;




@SpringBootTest
public class EmployeServiceImplTest {
	@Autowired
	IEmployeService es;
	
	
	
	
	//@Test
	//public void testRetrieveAllEmploye() {
		//List<Employe> listEmployes = es.retrieveAllEmploye();
		//Assertions.assertEquals(0,listEmployes.size());

     //}
	
	
	
	//@Test
	//public void testAddEmploye() throws ParseException {
		
		//Employe e = new Employe("Mohamed Iyadh","alaoui","alouiyadh@gmail.com","123456",Role.Etudiant);
		//Employe addedEmploye = es.addEmploye(e);
		//Assertions.assertEquals(e.getEmail(),addedEmploye.getEmail());
		
		
		
		
	//}
}
