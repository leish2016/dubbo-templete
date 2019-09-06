package com.tfb.provider.service;


import com.tfb.api.User;
import com.tfb.api.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;


@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {


    @Override
    public User addUser(User user) {
       return super.save(user);
    }

    @Override
    public List<User> getAll(){
        return super.findAll();
    }

    

}
