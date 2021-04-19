package xyz.leecue.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.leecue.dao.UserMapper;
import xyz.leecue.model.User;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfoByUsername(String username) {
        return null;
    }
}
