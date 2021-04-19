package xyz.leecue.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xyz.leecue.model.RespBean;
import xyz.leecue.model.ResponseCode;
import xyz.leecue.model.User;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@RestController
@RequestMapping("/web")
@Api(tags = "登录管理")
public class LoginController {

    @ApiOperation(value = "未登录时接口", notes = "用户在未登录状态下，会自动跳转至该接口")
    @GetMapping("/login")
    public RespBean doLogin() {
        return new RespBean(ResponseCode.NOT_LOGIN);
    }

    @PostMapping("/doLogin")
    public Object login(String username, String password) {
        //TODO 根据 username 查询数据库，获取一个user信息，如果user不存在，直接返回用户名或密码错误
        // 如果查找user信息成功，那么比较登录时 的 username 和 password 与 实际的user信息是否相等，如果相等返回user信息（不用携带密码）
        User user = new User();
        user.setName("213");
        return JSON.toJSON(user);
    }

}
