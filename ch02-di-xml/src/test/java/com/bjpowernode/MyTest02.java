package com.bjpowernode;


import com.bjpowernode.ba02.School;
import com.bjpowernode.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest02 {

    @Test
    public void test01() {
        //使用spring容器创建的对夏
        String config = "ba02/applicationContext.xml";
        //ApplicationContext表示spring容器
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) application.getBean("myStudent");
        System.out.println(myStudent);

    }

    @Test
    public void test02() {
        //普通创建
        Student student = new Student();
        student.setAge(18);
        student.setName("少司命");
        School school = new School();
        school.setAddress("路村庄");
        school.setName("路村小学");
        student.setSchool(school);
        System.out.println(student);
    }
}
