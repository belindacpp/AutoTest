package com.course.testng;
import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase01(){
        System.out.println("这是测试用例01");
    }
    @Test
    public void testcase02(){
        System.out.println("这是测试用例02");
    }
    @BeforeMethod
    public void beforeMehonPrac(){
        System.out.println("这是一个BeforeMethon方法,在每个@Test测试方法之前都运行一次");
    }
    @AfterMethod
    public void afterMethonPrac(){
        System.out.println("这是一个AfterMethon方法，在每个@Test测试方法之后都运行一次");
    }
    @BeforeClass
    public void beforeClassPrac(){
        System.out.println("这是一个BeforeClass方法,在一个类运行前运行一次");
    }
    @AfterClass
    public void afterClassPrac(){
        System.out.println("这是一个AfterClass方法，在一个类运行后运行一次");
    }
    @BeforeSuite
    public void beforeSuitPrac(){
        System.out.println("这是一个BeforeSuit方法，多个calss可以加到一个suit里面，在suit之前运行");
    }
    @AfterSuite
    public void afterSuitPrac(){
        System.out.println("这是一个AfterSuit方法,多个calss可以加到一个suit里面，在suit之后运行");
    }
}
