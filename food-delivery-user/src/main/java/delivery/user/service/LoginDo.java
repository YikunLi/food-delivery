package delivery.user.service;

import lombok.Data;
import lombok.Getter;

/**
 * Created by liyikun on 2017/7/4.
 */
@Getter
public class LoginDo {

    private State state;

    private UserDo userDo;

    public enum State {

        SUCCESS,

        FAILED_PASSWORD_WRONG,

        FAILED_ACCOUNT_NOT_EXIST

    }

    public LoginDo(State state) {
        this.state = state;
    }

    public LoginDo(State state, UserDo userDo) {
        this.state = state;
        this.userDo = userDo;
    }

}
