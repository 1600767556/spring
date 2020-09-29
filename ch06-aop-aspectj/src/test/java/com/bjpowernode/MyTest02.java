package com.bjpowernode;

import com.bjpowernode.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        String str = someService.doOther("张三", 28);
        System.out.println(str);
    }


}
