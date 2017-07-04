package delivery.user.converter;

import delivery.user.controller.LoginResponse;
import delivery.user.service.LoginDo;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by liyikun on 2017/7/4.
 */
public class LoginDoToLoginReponse implements Converter<LoginDo, LoginResponse> {

    @Override
    public LoginResponse convert(LoginDo loginDo) {
        LoginResponse loginReponse = new LoginResponse();
        switch (loginDo.getState()) {
            case SUCCESS:
                loginReponse.setSuccess(true);
                loginReponse.setUserId(loginDo.getUserDo().getId());
                break;
            case FAILED_PASSWORD_WRONG:
                loginReponse.setSuccess(false);
                loginReponse.setErrorMessage("Maybe you were putting your password in wrong?");
                break;
            case FAILED_ACCOUNT_NOT_EXIST:
                loginReponse.setSuccess(false);
                loginReponse.setErrorMessage("We cannot find an account with that phone number");
                break;
        }
        return loginReponse;
    }
}
