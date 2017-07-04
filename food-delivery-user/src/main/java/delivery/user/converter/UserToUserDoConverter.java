package delivery.user.converter;

import delivery.user.domain.User;
import delivery.user.service.UserDo;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;

/**
 * Created by liyikun on 2017/7/3.
 */
public class UserToUserDoConverter implements Converter<User, UserDo> {

    @Override
    public UserDo convert(User user) {
        UserDo userDo = new UserDo(user.getId());
        userDo.setUserName(user.getUserName());
        userDo.setPhoneNumber(user.getPhoneNumber());
        userDo.setPassword(user.getPassword());
        userDo.setAddresses(Arrays.asList(user.getAddresses().split(";")));
        return userDo;
    }
}
