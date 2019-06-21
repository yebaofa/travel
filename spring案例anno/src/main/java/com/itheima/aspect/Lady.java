package com.itheima.aspect;



import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class Lady {

    @Before("pointcut()")
    public void hello() {
        System.out.println("你好");
    }

    @AfterReturning("pointcut()")
    public void bye() {
        System.out.println("交给我1元钱");
    }



    @Pointcut("execution(* com.itheima.service.*.*(..))")
    public void pointcut() {
    }
}
