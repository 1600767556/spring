package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SomeServiceImpl2 implements SomeService {
    @Override
    public void doSome() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format = simpleDateFormat.format(date);
        System.out.println("非业务方法,方法的执行时间:"+format);

        System.out.println("执行业务方法doSome");
        System.out.println("非业务方法,方法执行完毕后提交事务");
    }

    @Override
    public void doOther() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format = simpleDateFormat.format(date);
        System.out.println("非业务方法,方法的执行时间:"+format);

        System.out.println("执行业务方法doOther");
        System.out.println("非业务方法,方法执行完毕后提交事务");
    }
}
