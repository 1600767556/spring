package com.bjpowernode.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        String name = "";
        if (args!=null && args.length>1){
            Object arg = args[0];
            name = (String) arg;
        }
        Object res = null;
        System.out.println("环绕通知:在目标方法执行之前,输出时间"+new Date());
        if ("zhangsan".equals(name)){
            //等同于method.invoke
            res = proceedingJoinPoint.proceed();
        }

        System.out.println("环绕通知,在目标方法之后,提交事务");
        if (res !=null){
            res = "Hello Aspectj AOP";
        }
        return res;
    }
}
