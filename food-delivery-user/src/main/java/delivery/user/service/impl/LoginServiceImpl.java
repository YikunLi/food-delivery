package delivery.user.service.impl;

import delivery.user.domain.User;
import delivery.user.domain.UserRepository;
import delivery.user.service.LoginDo;
import delivery.user.service.LoginService;
import delivery.user.service.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by liyikun on 2017/7/3.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginDo login(String phoneNumber, String password) {
        User user = this.userRepository.findUserByPhoneNumber(phoneNumber);
        LoginDo loginDo;
        if (user == null) {
            loginDo = new LoginDo(LoginDo.State.FAILED_ACCOUNT_NOT_EXIST);
        } else if (!user.getPassword().equals(password)) {
            loginDo = new LoginDo(LoginDo.State.FAILED_PASSWORD_WRONG);
        } else {
            UserDo userDo = new DefaultConversionService().convert(user, UserDo.class);
            loginDo = new LoginDo(LoginDo.State.SUCCESS, userDo);
        }
        return loginDo;
    }


}