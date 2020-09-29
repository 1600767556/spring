package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }
    @Test
    public void test02(){
        //使用spring容器创建的对夏
        String config = "beans.xml";
        //ApplicationContext表示spring容器
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) application.getBean("someService");
        someService.doSome();
    }
    /**
     * 获取spring容器中java对象的信息
     */
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println("对象数量="+beanDefinitionCount);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i <beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("对象名称:"+beanDefinitionName);
        }

    }
    @Test
    public void test04(){
        String config="beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Date mydate = (Date) applicationContext.getBean("myDate");
        System.out.println("Date:"+mydate);

    }

}
