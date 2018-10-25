package net.logvv.minisdmfer.service.impl;

import net.logvv.minisdmfer.model.UserToken;
import net.logvv.minisdmfer.service.IUserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.logvv.minisdmf.service.IUniqueIDService;

/**
 * Author : logvvw
 * Created on 2018/10/17 0:15.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUniqueIDService uniqueIDService;

    @Override
    public UserToken generateToken() {

        UserToken token = new UserToken();
        token.setToken(uniqueIDService.generateUniqueId());

        DateTime dt = new DateTime();
        dt.plusMinutes(30);
        token.setExpireTime(dt.toDate());

        return token;
    }

}
