package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BorrowRepository;
import model.BorrowModel;

@Service
public class borrowService {

    @Autowired
    private borrowRepository borrowRepository;

    // 在这里实现借阅相关的业务逻辑方法，例如借阅书籍、归还书籍等

}
