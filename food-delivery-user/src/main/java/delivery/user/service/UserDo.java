package delivery.user.service;

import lombok.Data;

import java.util.List;

/**
 * Created by liyikun on 2017/7/3.
 */
@Data
public class UserDo {

    private Long id;

    private String userName;

    private String phoneNumber;

    private String password;

    private List<String> addresses;

    public UserDo(Long id) {
        this.id = id;
    }

}
