package com.example.mytest.service.impl;

import com.example.mytest.mapper.UserMapper;
import com.example.mytest.pojo.UserPojo;
import com.example.mytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 韩秋林
 * @create 2022-06-05-10:44
 * @describe
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserPojo> findAll() {
        return userMapper.getUser();
    }

    @Override
    public UserPojo getUserById(Long id) {

        return userMapper.getUserById(id);
    }

    @Override
    public Boolean insertUser(UserPojo userPojo) {
        return userMapper.insertUser(userPojo) >0 ? true : false;
    }

    @Override
    public void updateUser(UserPojo userPojo) {
        userMapper.updateUser(userPojo);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }

}
