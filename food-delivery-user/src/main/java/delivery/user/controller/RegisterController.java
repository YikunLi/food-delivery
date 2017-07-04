package delivery.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liyikun on 2017/7/4.
 */
@Controller
@ResponseBody
public class RegisterController {

    /**
     * This method is used for check phone number exist
     *
     * @return
     */
    public boolean checkPhoneNumberExist() {
        return false;
    }

    /**
     * Register with main info
     *
     * @param phoneNumber
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public RegisterResponse register(String phoneNumber, String userName, String password) {

        return null;
    }

}
