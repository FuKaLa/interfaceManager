package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/11.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDao userDao;

    @Override
    public int existUser(String userName) {
        return userDao.existUser(userName);
    }

    @Override
    public int checkRole(String userName, Integer roleId) {
        return userDao.checkRole(userName,roleId);
    }

    @Override
    public int checkUser(String userName, Integer roleId, String password) {
        return userDao.checkUser(userName,roleId,password);
    }
}
