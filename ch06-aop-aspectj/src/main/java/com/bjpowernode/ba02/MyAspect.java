package com.bjpowernode.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    /**
     * @AfterReturning:后置通知
     * @param res
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(JoinPoint joinPoint,Object res){
        System.out.println("后置通知:方法的定义:"+joinPoint.getSignature());
        System.out.println("后置通知:方法名称:"+joinPoint.getSignature().getName());
        System.out.println("后置通知:在目标方法之后执行的,获取的返回值是:"+res);
        if (res.equals("abc")){

        }else {

        }
        if (res!=null){
            res="Hello Aspectj";
        }
    }
}
