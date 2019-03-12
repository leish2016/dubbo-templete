package com.tfb.model.api;


import com.tfb.model.entity.Userinfo;

import java.util.List;

/**
 * @author leish
 * @create 2019-03-12
 **/
public interface UserService {

    Userinfo addUser(Userinfo userinfo);

    List<Userinfo> getAll();
}
