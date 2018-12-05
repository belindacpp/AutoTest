package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnorePrac {
    @Test
    public void ignore001(){
        System.out.println("ignore001执行");
    }
    @Test(enabled = false)
    public void ignore002(){
        System.out.println("ignore002执行");
    }
    @Test(enabled = true)
    public void ignore003(){
        System.out.println("ignore003执行");
    }
}
