package repository;

import model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public class registerRepository {

	 userModel findByPhoneNumber(String phoneNumber);

	    

	    
	    userModel save(User user);

}