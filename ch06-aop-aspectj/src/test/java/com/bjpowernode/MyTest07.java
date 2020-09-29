package com.bjpowernode;

import com.bjpowernode.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someService");
        System.out.println("someService : "+someService.getClass().getName());
        someService.doThird();

    }


}
