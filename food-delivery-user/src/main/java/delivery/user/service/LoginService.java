package delivery.user.service;

import org.springframework.stereotype.Service;

/**
 * Created by liyikun on 2017/7/3.
 */
public interface LoginService {

    LoginDo login(String phoneNumber, String password);
}
