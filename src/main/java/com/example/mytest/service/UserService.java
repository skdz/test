package com.example.mytest.service;

import com.example.mytest.pojo.UserPojo;
import java.util.List;

/**
 * @author 韩秋林
 * @create 2022-06-05-10:42
 * @describe
 */
public interface UserService {

    public List<UserPojo> findAll();

    public UserPojo getUserById(Long id);

    public Boolean insertUser(UserPojo userPojo);

    public void updateUser(UserPojo userPojo);

    public void deleteUserById(Long id);
}
