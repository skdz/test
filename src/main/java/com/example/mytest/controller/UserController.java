package com.example.mytest.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mytest.common.Result;
import com.example.mytest.pojo.UserPojo;
import com.example.mytest.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


/**
 * @author 韩秋林
 * @create 2022-06-05-10:42
 * @describe
 */
@CrossOrigin(origins = {"*" , "null"})
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //查询所有的用户
    @RequestMapping("/all_user")
    public PageInfo<UserPojo> pageHelperTest(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        //调用方法进行分页查询
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(userService.findAll());
    }
    //精准查询
    @RequestMapping("precise_select")
    public Result getUserById(@RequestParam("id") Integer id){
        Result result = new Result();
        return Result.success(userService.getUserById(id.longValue()));
    }
    //插入
    @PostMapping("/insert_user")
    public Result postUser(@RequestBody JSONObject js_data){
        UserPojo user = new UserPojo();
        user.setName(js_data.getString("name"));
        user.setAge(js_data.getInteger("age"));
        user.setSex(js_data.getString("sex"));
        user.setAddress(js_data.getString("address"));
        user.setPhone(js_data.getString("phone"));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String create_time = format.format(new Date(System.currentTimeMillis()));
        user.setCreate_time(create_time);
        if(userService.insertUser(user)){
            return Result.success();
        }
        return Result.error("500","增加失败");
    }
    //修改
    @PostMapping("/update_user")
    public Result update(@RequestBody JSONObject js_data){
        UserPojo user = new UserPojo();
        user.setId(js_data.getLong("id"));
        user.setName(js_data.getString("name"));
        user.setAge(js_data.getInteger("age"));
        user.setSex(js_data.getString("sex"));
        user.setAddress(js_data.getString("address"));
        user.setPhone(js_data.getString("phone"));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String create_time = format.format(new Date(System.currentTimeMillis()));
        user.setCreate_time(create_time);
        userService.updateUser(user);
        return Result.success();
    }
    //删除
    @RequestMapping("/delete")
    public Result deleteUserById(@RequestParam Integer id){
        userService.deleteUserById(id.longValue());
        return Result.success();
    }
}
