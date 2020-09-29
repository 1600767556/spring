package com.bjpowernode;

import com.bjpowernode.handler.MyInvocationHandler;
import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
    /*    SomeService someService = new SomeServiceImpl();
        someService.doSome();
        someService.doOther();*/
    SomeService someService = new SomeServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(someService);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(someService.getClass().getClassLoader(),
                someService.getClass().getInterfaces(), invocationHandler);
    proxy.doOther();
        System.out.println("------------------------");
    proxy.doSome();
    }


}
