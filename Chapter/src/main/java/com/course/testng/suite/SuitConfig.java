package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {
    @BeforeSuite
    public void suitPrac01(){
        System.out.println("这是beforeSuit");
    }
    @AfterSuite
    public void suitPrac02(){
        System.out.println("这是afterSuit");
    }
    @BeforeTest
    public void beforeTestPrac(){
        System.out.println("Beforetest运行了");
    }
    @AfterTest
    public void afterTestPrac(){
        System.out.println("afterTest开始了");
    }

}
