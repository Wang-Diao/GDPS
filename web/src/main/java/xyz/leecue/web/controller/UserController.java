package xyz.leecue.web.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.leecue.model.User;
import xyz.leecue.service.UserService;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@RestController
@RequestMapping("/web")
@Api(tags = "用户管理")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUserInfo(@RequestParam("username") String username) {
        User user = userService.getUserInfoByUsername(username);
        user.setPassword(null);
        return user;
    }
}
