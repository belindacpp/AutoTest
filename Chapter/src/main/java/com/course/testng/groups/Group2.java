package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class Group2 {
    public void student1(){
        System.out.println("student1");
    }
    public void student2(){
        System.out.println("student2");
    }
}
