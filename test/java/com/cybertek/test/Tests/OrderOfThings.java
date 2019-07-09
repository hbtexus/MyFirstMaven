package com.cybertek.test.Tests;

import org.testng.annotations.Test;

public class OrderOfThings {
    @Test (priority = 0)
    public void ctest1(){
        System.out.println("Executing 1");
    }

    @Test (priority = -1)
    public void atest2(){
        System.out.println("Executing 2");
    }

    @Test (priority = 1)
    public void btest3(){
        System.out.println("Executing 3");
    }
}
