package delivery.user.controller;

import lombok.Data;

/**
 * Created by liyikun on 2017/7/3.
 */
@Data
public class LoginResponse {

    private boolean isSuccess;

    private String errorMessage;

    private Long userId;

}
