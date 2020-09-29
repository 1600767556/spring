package com.bjpowernode.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component(value = "myStudent")*/
@Component("myStudent")
//@Component
public class Student {
    /**
     * 简单类型的属性赋值
     */
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private Integer age;

    public Student() {
        System.out.println("student的无参构造方法");
    }

  /*  public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
