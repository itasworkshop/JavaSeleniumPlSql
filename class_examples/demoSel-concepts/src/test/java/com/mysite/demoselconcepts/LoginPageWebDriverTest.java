package com.mysite.demoselconcepts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWebDriverTest {

    //@Test
    public void testLoginDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://in.yahoo.com/");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.id("yschsp")).sendKeys("WHO", Keys.ENTER);
        System.out.println(driver.findElement(By.id("yschsp")).getAttribute("value"));
    }

}
