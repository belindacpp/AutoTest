package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class Group1 {
    public void teachaer1(){
        System.out.println("teacher1");
    }
    public void teachaer2(){
        System.out.println("teacher2");
    }
}
