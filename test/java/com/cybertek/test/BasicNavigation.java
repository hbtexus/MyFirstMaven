package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        String url = "http://google.com";
        String url1 = "http://amazon.com";

        driver.get(url);
        Thread.sleep(2000);

        driver.navigate().to(url1);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
