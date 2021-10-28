package com.mysite.demoselconcepts;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTest {

    //testing login to yahoo.com
    @Test
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
}
