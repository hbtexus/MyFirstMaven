package com.cybertek.test.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixedDependencies {
    @Test
    public void openBrowser(){
        System.out.println("Opening browser");
    }
    @Test (dependsOnMethods = "Opening browser")
    public void logIn(){
        System.out.println("Login");
        Assert.assertTrue(false);
    }

    // BE CAREFUL WHAT YOU PUT IN THE BEFORE OR AFTER METHOD, HERE AFTER TEST OPENBROWSER AFTER METHOD WILL EXECUTE
    // AND IT WILL CLOSE THE BROWSER

    @AfterMethod
    public void cleanUp(){
        System.out.println("Close browser");
    }
}
