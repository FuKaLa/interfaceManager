package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/6/11.
 */
@Mapper
@Repository
public interface UserDao {


    int existUser(@Param("userName")String userName);

    int checkRole(@Param("userName")String userName,@Param("roleId") Integer roleId);

    int checkUser(@Param("userName") String userName,@Param("roleId") Integer roleId,@Param("password") String password);

}
