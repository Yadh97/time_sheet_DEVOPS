package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;

@SpringBootTest

class UserServiceImplTest {
          
	@Autowired
	IUserService us;
	@Test
	public void testRetrieveAllUsers() {
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertEquals(3,listUsers.size());
		
	}
	
	@Test
	public void testAddUser() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date d = dateFormat.parse("1997-04-26");
		User u = new User("Mohamed Iyadh","alaoui",d,Role.Etudiant);
		User addedUser = us.addUser(u);
		Assertions.assertEquals(u.getLastName(),addedUser.getLastName());
		
		
		
	}
}
