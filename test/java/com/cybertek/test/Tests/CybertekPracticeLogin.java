package com.cybertek.test.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CybertekPracticeLogin {
    public static void main(String[] args) throws Throwable{

        WebDriverManager.chromedriver().setup();  // Setting up ChromeDriver as a WebDriver

        WebDriver driver = new ChromeDriver();     //  Creating the ChromeDriver object and opening the Chrome Browser

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // Wait 3 sec until the page is loaded

        driver.get("http://practice.cybertekschool.com/login"); // Bringing the login page

        driver.manage().window().maximize();    // Maximizing the web page size

        driver.findElement(By.name("username")).sendKeys("tomsmith1");  // Finding WebElement for Username field

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword1");   // // Finding WebElement for Password field

        driver.findElement(By.id("wooden_spoon")).click();  // Click on submit button

        Thread.sleep(3000); // Wait 3 sec

        String actualLoginPage = driver.findElement(By.id("flash")).getText();  // Actual result

        String expectedErrorMessage = "Your username is invalid!";  // Expected result

        // Our real test, in this case it is passed

        if(actualLoginPage.contains(expectedErrorMessage)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Actual Login Page Message = " + actualLoginPage);
            System.out.println("Expected Error Message = " + expectedErrorMessage);
        }
        driver.close();


    }
}
