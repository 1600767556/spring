package com.bjpowernode;

import com.bjpowernode.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        someService.doThird();

    }


}
