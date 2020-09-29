package com.bjpowernode.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    /**
     * 最终通知
     */
    @After(value = "mypt()")
    public void  myAfter(){
        System.out.println("执行最终通知，总是会执行");
    }
    /**
     * 前置通知
     */
    @Before(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void  myBefore(){
        System.out.println("执行前置通知，在目标方法之前执行的");
    }
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))" )
    private void mypt(){
        //无需代码
    }
}
