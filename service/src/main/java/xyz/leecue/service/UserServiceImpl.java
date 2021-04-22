package xyz.leecue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.leecue.dao.UserMapper;
import xyz.leecue.model.User;


@Service
public class UserServiceImpl extends UserService {
    @Autowired
    private UserMapper userMapper;
}
