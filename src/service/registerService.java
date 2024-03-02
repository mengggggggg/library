package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.registerRepository;
import model.userModel;

@Service
public class registerService {

    @Autowired
    private registerRepository registerRepository;

    private userRepository userRepository;

    public boolean registerUser(userModel user) {
       
        userModel existingUser = userRepository.findByPhoneNumber(user.getPhoneNumber());
        if (existingUser != null) {
            
            return false;
        } else {
           
            userRepository.save(user);
            return true;
        }
    }

}
