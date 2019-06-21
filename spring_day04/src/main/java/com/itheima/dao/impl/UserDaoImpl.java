package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    JdbcTemplate template;
    public void setTemplate(JdbcTemplate template){
        this.template=template;
    }
    public void add(Double money,String username) {
        String sql="update account set money=money+? where username=?";

        template.update(sql,money,username);
    }

    public void reduce(Double money,String username) {
        String sql="update account set money=money-? where username=?";

        template.update(sql,money,username);
    }
}
