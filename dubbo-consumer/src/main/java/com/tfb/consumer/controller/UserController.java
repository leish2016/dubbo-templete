package com.tfb.consumer.controller;


import com.tfb.api.User;
import com.tfb.api.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(description = "用户操作服务")
public class UserController {

    @Reference(check = false)
    UserService userService;

    @PostMapping("/user")
    @ApiOperation("添加用户")
    public User addUserInfo(User user){
        return userService.addUser(user);
    }


    @GetMapping("/user")
    @ApiOperation("查询所有用户")
    public List<User> findAllUserInfo() {
        return userService.getAll();
    }
}
