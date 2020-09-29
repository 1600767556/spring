package com.bjpowernode.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /**
     * 异常通知
     * @param ex
     */
    @AfterThrowing(
            value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "ex"
    )
   public void myAfterException(Exception ex){
        System.out.println("异常通知,方法发生异常时执行:"+ex.getMessage());
   }
}
