package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserDTO userDTO) {
        try {
            String token = userService.loginUser(userDTO);
            return new ResponseEntity<>(token, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
        }
    }
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String phoneNumber, @RequestParam String password, Model model) {
        boolean loginSuccess = userService.loginUser(phoneNumber, password);
        if (loginSuccess) {
            // 登录成功，重定向到首页或其他页面
            return "redirect:/home";
        } else {
            // 登录失败，返回登录页面，并在页面显示错误信息
            model.addAttribute("error", "Invalid credentials. Please try again.");
            return "login"; // 返回登录页面
        }
    }
}
