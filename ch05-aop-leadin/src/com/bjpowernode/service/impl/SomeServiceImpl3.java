package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

public class SomeServiceImpl3 implements SomeService {
    @Override
    public void doSome() {
        ServiceTools.doLog();
        System.out.println("执行业务方法doSome");
        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        ServiceTools.doLog();
        System.out.println("执行业务方法doOther");
        ServiceTools.doTrans();
    }
}
