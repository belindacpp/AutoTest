package com.course.testng;

import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class ExceptionPrac {
    @Test(expectedExceptions = RuntimeException.class)
    public void faildException(){
        System.out.println("执行语句成功，但不符合预期的exception,所以case执行失败");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void successedException(){
        System.out.println("new了一个符合预期的异常，所以case会执行成功");
        throw new RuntimeException();
    }
}
