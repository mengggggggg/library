package repository;

import model.userModel;

public interface loginRepository {

	userModel findByPhoneNumber(String phoneNumber);

    
    userModel findByPhoneNumberAndPassword(String phoneNumber, String password);

}
