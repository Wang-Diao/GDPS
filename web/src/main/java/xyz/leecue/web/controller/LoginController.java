package xyz.leecue.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.leecue.model.RespBean;
import xyz.leecue.model.ResponseCode;
import xyz.leecue.model.User;
import xyz.leecue.service.UserService;


@RestController
@RequestMapping("/web")
@Api(tags = "登录管理")
@Slf4j
public class LoginController {
    @Autowired
    private UserService userService;
    //登录
    @PostMapping("/login")
    public RespBean login(@RequestBody User user) {
       log.warn("接收到的数据为：{}", user);
       return new RespBean(ResponseCode.SUCCESS, userService.checkUsernameAndPassword(user));

    }
    //注册
    @PostMapping("/register")
    public RespBean register(@RequestBody User user) {
        log.warn("接收到的数据为：{}", user);
        return new RespBean(ResponseCode.SUCCESS, userService.putUsernameAndPassword(user));
    }
}
