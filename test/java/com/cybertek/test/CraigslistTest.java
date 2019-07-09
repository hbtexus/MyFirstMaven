package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CraigslistTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.craigslist.com/");

        driver.manage().window().fullscreen();

        driver.findElement(By.name("query")).sendKeys("corolla");
        driver.findElement(By.linkText("electronics")).click();
        driver.findElement(By.partialLinkText("+garden")).click();

    }
}
