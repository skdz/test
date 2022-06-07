package com.example.mytest.mapper;

import com.example.mytest.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 韩秋林
 * @create 2022-06-05-10:54
 * @describe
 */
@Mapper
public interface UserMapper {
    //展示所有人员信息
    public List<UserPojo>  getUser();
    //通过id精准查询
    public UserPojo getUserById(@Param("id")Long id);
    //增加人员信息
    public int insertUser(UserPojo user);
    //修改人员信息
    public void updateUser(UserPojo user);
    //删除人员信息
    public int deleteUserById(@Param("id")Long id);
}
