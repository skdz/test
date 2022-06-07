package com.example.mytest.pojo;

import lombok.Data;

/**
 * @author 韩秋林
 * @create 2022-06-05-10:43
 * @describe
 */
@Data
public class UserPojo {
    public Long id;
    public String name;
    public int age;
    public String sex;
    public String address;
    public String phone;
    public String create_time;
}
