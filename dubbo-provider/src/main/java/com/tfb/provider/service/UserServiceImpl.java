package com.tfb.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.tfb.model.api.UserService;
import com.tfb.model.entity.Userinfo;
import com.tfb.provider.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserinfoMapper userInfoMapper;

    @Override
    public Userinfo addUser(Userinfo userinfo) {
        userinfo.setCreateAt(new Date());
        userInfoMapper.insertSelective(userinfo);
        return userInfoMapper.selectOne(userinfo);
    }

    @Override
    public List<Userinfo> getAll(){
        return userInfoMapper.selectAll();
    }

    

}
