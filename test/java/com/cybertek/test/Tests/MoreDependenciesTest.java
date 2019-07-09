package com.cybertek.test.Tests;

import org.testng.annotations.Test;

public class MoreDependenciesTest {
    @Test
    public void openBrowser(){
        System.out.println("Opening browser");
    }
    @Test (dependsOnMethods = "Opening browser")
    public void logIn(){
        System.out.println("Login");
    }
    @Test (dependsOnMethods = "Login")
    public void logOut(){
        System.out.println("Logout");
    }
}
