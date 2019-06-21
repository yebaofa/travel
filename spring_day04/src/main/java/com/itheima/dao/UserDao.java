package com.itheima.dao;

public interface UserDao {
    void add(Double money,String username);
    void reduce(Double money,String username);
}
