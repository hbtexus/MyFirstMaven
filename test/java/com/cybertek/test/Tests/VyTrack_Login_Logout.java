package com.cybertek.test.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrack_Login_Logout {
    public static void main(String[] args) throws Throwable{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://qa1.vytrack.com/user/login");

        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("user156");

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();

        driver.findElement(By.xpath("//*[@id='user-menu']/a")).click();

        driver.findElement(By.linkText("Logout")).click();

        driver.close();
    }
}
