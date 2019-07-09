package com.cybertek.test.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MixedAnnotations {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up the drivers here");
        WebDriverManager.chromedriver().setup();

    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Opening a browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("Go to website and login");
        driver.get("https://google.com");
    }
    @Test
    public void testOne(){
        System.out.println("Testing testing : account info");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Log out");
        System.out.println("Closing the browser");
        driver.quit();
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Report everything");
    }
    @Test
    public void testTwo(){
        System.out.println("Testing testing : payment");
    }
}
