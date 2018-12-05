package com.test.extentreportDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentDemo1 {

    @Test
    public void test01(){
        int b=2;
        Assert.assertEquals(b,2);
        System.out.println("测试01成功");
    }
    @Test
    public void test02(){
        Assert.assertEquals(1,1);
        System.out.println("测试02成功");
    }
    @Test
    public void logdemo(){
        Reporter.log("这是一个日志输出");
    }

}
