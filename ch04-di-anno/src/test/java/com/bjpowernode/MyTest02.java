package com.bjpowernode;


import com.bjpowernode.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
       Student myStudent = (Student) applicationContext.getBean("myStudent");
     //   Student myStudent = (Student) applicationContext.getBean("student");
        System.out.println(myStudent);
    }

}
