package com.mysite.demoselconcepts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class LinksAttributeTest {

    //@Test
    public void testGetHrefLink(){
        System.setProperty("webdriver.chrome.driver","C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getWindowHandle());

        WebElement mobilesPageElement = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
        String link = mobilesPageElement.getAttribute("href");
        System.out.println(link);
        driver.close();

    }

    @Test
    public void testGetBestSellerImage() throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getWindowHandle());

        WebElement bestSellerPageElement = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
        bestSellerPageElement.click();
        WebElement bestSellerImageElement = driver.findElement(By.cssSelector("#anonCarousel1 > ol > li > div.zg-carousel-general-faceout > div > a:nth-child(1) > div > img"));
        System.out.println(bestSellerImageElement.getAttribute("src"));
        String imgLink = bestSellerImageElement.getAttribute("src");
        BufferedImage downImg = ImageIO.read(new URL(imgLink));

        ImageIO.write(downImg,"jpg",new File("C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\myimage.jpg"));
    }
}
