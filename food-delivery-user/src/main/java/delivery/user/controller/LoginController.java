package delivery.user.controller;

import delivery.user.service.LoginDo;
import delivery.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liyikun on 2017/7/4.
 */
@Controller
@ResponseBody()
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public LoginResponse login(@RequestParam String phoneNumber,
                               @RequestParam String password) {
        LoginDo loginDo = this.loginService.login(phoneNumber, password);
        return new DefaultConversionService().convert(loginDo, LoginResponse.class);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String mock(@RequestParam String phoneNumber,
                       @RequestParam String password) {
        return "success";
    }
}
