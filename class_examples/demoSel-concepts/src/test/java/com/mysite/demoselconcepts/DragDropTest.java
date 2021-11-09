package com.mysite.demoselconcepts;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTest {

    //testing login to yahoo.com
    //@Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://in.yahoo.com/");

        WebElement loginPageElement = driver.findElement(By.cssSelector("#ysignin"));
        loginPageElement.click();
        WebElement username = driver.findElement(By.cssSelector("#login-username"));
        username.sendKeys("itasworkshop");
        WebElement login = driver.findElement(By.cssSelector("#login-signin"));
        login.click();

        //staleElementReferenceException condition
        new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"login-passwd\"]")));
        driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("******");
        driver.findElement(By.cssSelector("#login-signin")).click();
        driver.findElement(By.cssSelector("#ymail > div")).click();

       // #message-to-field
        //#mail-app-component > div > div > div.compose-header.en_0 > div:nth-child(3) > div > div > input
        //#editor-container > div.rte.em_N.ir_0.iy_A.iz_h.N_6Fd5
        //#mail-app-component > div > div > div.em_N.D_F.ek_BB.p_R.o_h > div:nth-child(2) > div > button

        driver.findElement(By.cssSelector("#app > div.I_ZnwrMC.D_F.em_N.o_h.W_6D6F.H_6D6F > div > div.a_3rehn.W_3o4BO.s_3o4BO.cZ10Gnkk_ZM1sUU.D_F.ek_BB.em_0 > nav > div > div:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#message-to-field")).sendKeys("itasworkshop@yahoo.com",Keys.ENTER);
        driver.findElement(By.cssSelector("#mail-app-component > div > div > div.compose-header.en_0 > div:nth-child(3) > div > div > input")).sendKeys("Test Email from Selenium App");
        driver.findElement(By.cssSelector("#editor-container > div.rte.em_N.ir_0.iy_A.iz_h.N_6Fd5")).sendKeys("Hello, This is Test Body!");
        driver.findElement(By.cssSelector("#mail-app-component > div > div > div.em_N.D_F.ek_BB.p_R.o_h > div:nth-child(2) > div > button")).click();
    }

    @Test
    public void getDragAndDrop(){
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.co.in/imghp?hl=en&authuser=0&ogbl");

        //body > div.elementor.elementor-218.elementor-location-header > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-5bb9ce67.elementor-section-height-min-height.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-sticky.elementor-sticky--active.elementor-section--handles-inside.elementor-sticky--effects > div > div.elementor-column.elementor-col-33.elementor-top-column.elementor-element.elementor-element-32fdca72 > div > div > div > a > img
        WebElement logoElement = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img"));
        System.out.println(logoElement.getLocation().getX());
        System.out.println(logoElement.getLocation().getY());
        WebElement aboutElement = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[2]/input"));
        System.out.println(aboutElement.getLocation().getX());
        System.out.println(aboutElement.getLocation().getY());
        System.out.println(aboutElement.getAttribute("value"));
        Actions action = new Actions(driver);

       // action.dragAndDrop(logoElement,aboutElement).perform();
        //action.clickAndHold(logoElement);
        action.dragAndDropBy(logoElement,382,185).build().perform();
        action.pause(100);
        action.sendKeys(Keys.ENTER);


    }
}
