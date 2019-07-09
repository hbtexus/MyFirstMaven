package com.cybertek.test.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    public void test1(){
        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b);  // comparing a to b
    }

    @Test
    public void test2(){
        String a = "A";
        String b = "AAA";

        Assert.assertEquals(a,b);  // comparing a to b
        // comparing a to b, first parameter is actual second is expected
    }

    @Test
    public void test3(){
        String a = "AD";
        String b = "AAA";
        Assert.assertTrue(b.contains(a));
    }

    @Test
    public void test4(){
        String a = "ADAFD";
        String b = "AAA";
        Assert.assertTrue(b.contains(a), b + " should contain " + a );
    }

}
