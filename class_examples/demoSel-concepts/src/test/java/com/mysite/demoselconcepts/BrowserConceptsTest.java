package com.mysite.demoselconcepts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConceptsTest {

    //@Test
    public void testLoginDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getWindowHandle());

        //<a href="/mobile-phones/b/?ie=UTF8&amp;node=1389401031&amp;ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7" class="nav-a  " tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_0" data-csa-c-content-id="nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7" data-csa-c-id="z0kh80-5dabj-12ct8c-uwm6nb">Mobiles</a>
        //#nav-xshop > a:nth-child(2)
        //WebElement mobilesPageElement = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)"));
        WebElement mobilesPageElement = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
        mobilesPageElement.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();

    }
}
