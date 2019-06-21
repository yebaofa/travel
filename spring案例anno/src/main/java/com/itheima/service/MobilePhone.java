package com.itheima.service;

import org.springframework.stereotype.Service;

@Service("target")
public class MobilePhone implements Operator {
    public void pay() {
        System.out.println("缴费");
    }
}
