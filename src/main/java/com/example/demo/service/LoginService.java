package com.example.demo.service;

/**
 * Created by Administrator on 2019/6/11.
 */
public interface LoginService {

    int existUser(String userName);

    int checkRole(String userName,Integer roleId);

    int checkUser(String userName,Integer roleId,String password);
}
