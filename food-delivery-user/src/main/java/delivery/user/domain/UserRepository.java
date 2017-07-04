package delivery.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liyikun on 2017/7/3.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByPhoneNumber(String phoneNumber);
}
