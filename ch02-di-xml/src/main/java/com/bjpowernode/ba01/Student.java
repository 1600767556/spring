package com.bjpowernode.ba01;

import com.bjpowernode.ba02.School;

public class Student {
    public School setSchool;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {

        this.age = age;
        System.out.println("setAge");
    }

    public void setSchool(School school) {
    }
}
