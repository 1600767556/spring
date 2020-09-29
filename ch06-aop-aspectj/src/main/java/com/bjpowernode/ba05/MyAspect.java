package com.bjpowernode.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /**
     * 最终通知
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void  myAfter(){
        System.out.println("执行最终通知，总是会执行");
    }
}
