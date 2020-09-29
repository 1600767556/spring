package com.bjpowernode;

import com.bjpowernode.ba08.SomeService;
import com.bjpowernode.ba08.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest08 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        System.out.println("someService : "+someService.getClass().getName());
        someService.doThird();

    }


}
