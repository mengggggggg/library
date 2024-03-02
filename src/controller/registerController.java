package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registerController {

    @Autowired
    private userService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) {
        try {
            userService.registerUser(userDTO);
            return new ResponseEntity<>("User registered successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
       
    }
    public String register(@RequestParam String phoneNumber, @RequestParam String password, Model model) {
        
        if (!isValidPhoneNumber(phoneNumber)) {
            model.addAttribute("error", "Invalid phone number. Please enter a valid 10-digit number.");
            return "register"; // 返回注册页面，并在页面上显示错误信息
        }        
        if (!isValidPassword(password)) {
            model.addAttribute("error", "Invalid password. Please enter a password containing both letters and digits.");
            return "register"; 
        }        
        boolean registrationSuccess = userService.registerUser(phoneNumber, password);
        if (registrationSuccess) {   
            return "redirect:/login";
        } else {
            
            model.addAttribute("error", "Registration failed. Please try again later.");
            return "register"; 
        }
    }
    
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}"); 
    }
    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d).{8,}$"); 
    }
}
