package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import model.User;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;

    public void registerUser(User user) {
        // 在这里实现用户注册的业务逻辑
        // 例如，检查手机号是否已被注册
        // 将用户信息保存到数据库中
        userRepository.save(user);
    }

    public boolean loginUser(String phoneNumber, String password) {
        // 在这里实现用户登录的业务逻辑
        // 例如，根据手机号和密码查询用户信息
        // 如果用户存在且密码匹配，返回true；否则返回false
        User user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public User getUserByPhoneNumber(String phoneNumber) {
        // 在这里实现根据手机号查询用户信息的业务逻辑
        return userRepository.findByPhoneNumber(phoneNumber);
    }

    // 可以根据需要添加其他业务方法
}
