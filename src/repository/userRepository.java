package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.userModel;

@Repository
public interface userRepository extends JpaRepository<userModel, Long> {

    userModel findByPhoneNumber(String phoneNumber);

    // 可以根据需要添加其他查询方法
}
