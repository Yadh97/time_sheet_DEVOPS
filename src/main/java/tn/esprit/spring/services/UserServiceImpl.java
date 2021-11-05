package tn.esprit.spring.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);	
	
	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			l.info("In method retrieveAllUsers : ");
			users = (List<User>) userRepository.findAll();  
			l.debug("connexion a la base ok : ");
			for (User user : users) {
				l.debug(" user :" +  user.getLastName());
			} 
               l.info("out of method retrieveAllUsers with success");
		}catch (Exception e) {
               l.error("Out of method retrieveAllUsers with Errors :" + e); 
		}

		return users;
	}


	@Override
	public User addUser(User u) {
		l.info("In method addUser : ");
		User u_saved = userRepository.save(u); 
        l.info("out of method addUser with success");
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		l.info("In method updateUser : ");
		User u_saved = userRepository.save(u); 
        l.info("out of method updateUser with success");
		return u_saved; 
	}

	@Override
	public void deleteUser(String id) {
		l.info("In method deleteUser : ");
		userRepository.deleteById(Long.parseLong(id)); 
        l.info("out of method deleteUser with success");
	}

	@Override
	public User retrieveUser(String id) {
		l.info("In method retrieveUser : ");
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		User u =  userRepository.findById(Long.parseLong(id)).get(); 
        l.info("out of method retrieveUser with success");
		return u; 
	}

}