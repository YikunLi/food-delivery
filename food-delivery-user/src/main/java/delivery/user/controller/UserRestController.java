package delivery.user.controller;

import delivery.user.service.LoginDo;
import delivery.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyikun on 2017/7/3.
 */
@RestController
@CrossOrigin
public class UserRestController {

    @Autowired
    private UserService userService;


}
