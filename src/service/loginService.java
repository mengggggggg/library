package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.loginRepository;
import model.userModel;

@Service
public class loginService {

    @Autowired
    private loginRepository loginRepository;

    // 在这里实现登录相关的业务逻辑方法，例如验证用户登录、生成令牌等

}
