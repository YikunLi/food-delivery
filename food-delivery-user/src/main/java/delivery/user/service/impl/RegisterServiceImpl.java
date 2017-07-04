package delivery.user.service.impl;

import delivery.user.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * Created by liyikun on 2017/7/4.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    
    @Override
    public boolean checkPhoneNumberExist(String phoneNumber) {
        return false;
    }
}
