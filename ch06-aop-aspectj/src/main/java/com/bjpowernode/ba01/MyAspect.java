package com.bjpowernode.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

    /*@Before(value ="execution(public void com.bjpowernode.ba01.SomeServiceImpl.doSome(String,Integer))" )
    public void myBefore(){
        System.out.println("前置通知;切面功能:在目标方法之前输出执行时间:"+new Date());
    }*/
    @Before(value ="execution(void *..SomeServiceImpl.doSome(String,Integer))" )
    public void myBefore2(JoinPoint joinPoint){
        System.out.println("方法的签名:"+joinPoint.getSignature());
        System.out.println("方法名称:"+joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("参数:"+arg);
        }
        System.out.println("2===前置通知;切面功能:在目标方法之前输出执行时间:"+new Date());
    }
    /*@Before(value ="execution(* *..SomeServiceImpl.*(..))" )
    public void myBefore3(){
        System.out.println("3====前置通知;切面功能:在目标方法之前输出执行时间:"+new Date());
    }
    @Before(value ="execution(* do*(..))" )
    public void myBefore4(){
        System.out.println("4====前置通知;切面功能:在目标方法之前输出执行时间:"+new Date());
    }
*/
}
