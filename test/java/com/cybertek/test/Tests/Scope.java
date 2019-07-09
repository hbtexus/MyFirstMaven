package com.cybertek.test.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scope {
    public static void main(String[] args) {
        // 1. Give me the count of links on the page  (we want count of all tageName  //a)
        // 2. Count of links on the footer section

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://qaclickacademy.com/practice.php");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));  // Limiting webdriver scope to footer driver

        System.out.println(footerDriver.findElements(By.tagName("a")).size());
    }
}
