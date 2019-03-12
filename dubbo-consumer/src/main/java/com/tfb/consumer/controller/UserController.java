package com.tfb.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.tfb.model.api.UserService;
import com.tfb.model.entity.Userinfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    public Userinfo addUserInfo(Userinfo userinfo){
        return userService.addUser(userinfo);
    }


    @GetMapping("/user")
    @ApiOperation("查询所有用户")
    public List<Userinfo> findAllUserInfo() {
        return userService.getAll();
    }
}
