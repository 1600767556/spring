package com.bjpowernode.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceTools {
    public static void doLog(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format = simpleDateFormat.format(date);
        System.out.println("非业务方法,方法的执行时间:"+format);


    }
    public static void doTrans(){
        System.out.println("非业务方法,方法执行完毕后提交事务");
    }

}
