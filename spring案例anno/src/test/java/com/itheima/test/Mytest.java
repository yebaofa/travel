package com.itheima.test;

import com.itheima.service.Operator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Mytest {

    @Autowired
    Operator operator;

    @Test
    public void test1(){
        operator.pay();
    }
}
