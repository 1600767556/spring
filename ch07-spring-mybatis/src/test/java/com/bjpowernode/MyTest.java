package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("容器中对象的名称:"+beanDefinitionName+"||"+applicationContext.getBean(beanDefinitionName).getClass().getName());
        }

    }
    @Test
    public void testDaoInsert(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(1017);
        student.setName("卫庄");
        student.setEmail("weizhuang@qq.com");
        student.setAge(20);
        int nums = studentDao.insertStudent(student);
        System.out.println(nums);
    }
    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService studentDao = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setId(1018);
        student.setName("盖聂");
        student.setEmail("盖聂@qq.com");
        student.setAge(20);
        int nums = studentDao.addStudent(student);
        System.out.println(nums);
    }
    @Test
    public void testServiceSelect(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) applicationContext.getBean("studentService");
        List<Student> students = service.queryStudents();
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
