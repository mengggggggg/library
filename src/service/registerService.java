package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.registerRepository;
import model.User;

@Service
public class registerService {

    @Autowired
    private registerRepository registerRepository;

    // 在这里实现注册相关的业务逻辑方法，例如验证用户信息、新增用户等

}
