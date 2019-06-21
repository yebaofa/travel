package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {


    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void transfer(double money,String reduceUser,String addUser) {
            userDao.reduce(money,reduceUser);
            int i=1/0;
            userDao.add(money,addUser);
    }
}
