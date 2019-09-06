package com.tfb.api;


import java.util.List;

/**
 * @author leish
 * @create 2019-03-12
 **/
public interface UserService {

    User addUser(User userinfo);

    List<User> getAll();
}
