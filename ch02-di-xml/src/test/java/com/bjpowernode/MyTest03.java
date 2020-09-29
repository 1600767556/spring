package com.bjpowernode;
import com.bjpowernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {

    @Test
    public void test01() {
        //使用spring容器创建的对夏
        String config = "ba03/applicationContext.xml";
        //ApplicationContext表示spring容器
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) application.getBean("myStudent2");
        System.out.println(myStudent);
        File myfile = (File) application.getBean("myfile");
        System.out.println("myFile:" + myfile.getName());
    }

}
