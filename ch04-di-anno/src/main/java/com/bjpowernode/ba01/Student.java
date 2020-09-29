package com.bjpowernode.ba01;

import org.springframework.stereotype.Component;

/*@Component(value = "myStudent")*/
@Component("myStudent")
//@Component
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("student的无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
