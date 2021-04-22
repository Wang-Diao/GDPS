package xyz.leecue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.leecue.dao.UserMapper;
import xyz.leecue.model.User;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    //登录
    public boolean checkUsernameAndPassword(User user) {
        User existUser = userMapper.getUserByUsername(user);
        if (existUser == null) {
            return false;
        }
        if (existUser.getUsername().equals(user.getUsername())
          && existUser.getPassword().equals(user.getPassword())) {
            return true;
        }
        return false;
    }

    //注册
    public boolean putUsernameAndPassword(User user){
        User existUser = userMapper.getUserByUsername(user);

        if(existUser!=null){
            return false;
        }

        int res = userMapper.putUserByUsername(user);
        System.out.println(res);
        System.out.println(user);
        return true;
    }
}