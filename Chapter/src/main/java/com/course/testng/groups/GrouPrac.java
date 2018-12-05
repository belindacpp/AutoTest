package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GrouPrac {
    @Test(groups = "mam")
    public void man1(){
        System.out.println("这个是man1");
    }
    @Test(groups = "mam")
    public void man2(){
        System.out.println("这个是man2");
    }
    @Test(groups = "wemon")
    public void wemon1(){
        System.out.println("wemon1");
    }

    @BeforeGroups("mam")
    public void manGroupbefore(){
        System.out.println("man Group before");
    }
    @AfterGroups("mam")
    public void manGroupafter(){
        System.out.println("after man group");
    }

}
