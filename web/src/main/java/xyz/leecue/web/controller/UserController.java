package xyz.leecue.web.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.leecue.model.User;
import xyz.leecue.service.UserService;

@RestController
@RequestMapping("/web")
public class UserController {
    @Autowired
    private UserService userService;

}