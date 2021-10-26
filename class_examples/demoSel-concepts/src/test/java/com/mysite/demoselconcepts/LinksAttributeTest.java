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
import java.util.ArrayList;
import java.util.List;

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

    //@Test
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

    @Test
    public void testGetAmazonHomePageLinks() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\JavaSeleniumPlSql\\class_examples\\demoSel-concepts\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/");

        WebElement homeMenuPageElement = driver.findElement(By.cssSelector("#nav-hamburger-menu"));
        homeMenuPageElement.click();

        //<a href="/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2" class="hmenu-item">Best Sellers</a>
        //WebElement mobilesPageElement = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(2) > a"));
        //#hmenu-content > ul.hmenu.hmenu-visible
        //<ul class="hmenu hmenu-visible" data-menu-id="1">
        //<li><div class="hmenu-item hmenu-title ">trending</div></li><li><a href="/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2" class="hmenu-item">Best Sellers</a></li><li><a href="/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3" class="hmenu-item">New Releases</a></li><li><a href="/gp/movers-and-shakers/?ref_=nav_em_ms_0_1_1_4" class="hmenu-item">Movers and Shakers</a></li><li class="hmenu-separator"></li><li><div class="hmenu-item hmenu-title ">digital content and devices</div></li><li><a href="" class="hmenu-item" data-menu-id="2" data-ref-tag="nav_em_1_1_1_6"><div>Echo &amp; Alexa</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="3" data-ref-tag="nav_em_1_1_1_7"><div>Fire TV</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="4" data-ref-tag="nav_em_1_1_1_8"><div>Kindle E-Readers &amp; eBooks</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="5" data-ref-tag="nav_em_1_1_1_9"><div>Audible Audiobooks</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="6" data-ref-tag="nav_em_1_1_1_10"><div>Amazon Prime Video</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="7" data-ref-tag="nav_em_1_1_1_11"><div>Amazon Prime Music</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li class="hmenu-separator"></li><li><div class="hmenu-item hmenu-title ">shop by department</div></li><li><a href="" class="hmenu-item" data-menu-id="8" data-ref-tag="nav_em_1_1_1_13"><div>Mobiles, Computers</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="9" data-ref-tag="nav_em_1_1_1_14"><div>TV, Appliances, Electronics</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="10" data-ref-tag="nav_em_1_1_1_15"><div>Men's Fashion</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" data-menu-id="11" data-ref-tag="nav_em_1_1_1_16"><div>Women's Fashion</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><ul class="hmenu-compress-section compressed"><li class="hmenu-mini-divider"></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="12" data-ref-tag="nav_em_1_1_1_17"><div>Home, Kitchen, Pets</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="13" data-ref-tag="nav_em_1_1_1_18"><div>Beauty, Health, Grocery</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="14" data-ref-tag="nav_em_1_1_1_19"><div>Sports, Fitness, Bags, Luggage</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="15" data-ref-tag="nav_em_1_1_1_20"><div>Toys, Baby Products, Kids' Fashion</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="16" data-ref-tag="nav_em_1_1_1_21"><div>Car, Motorbike, Industrial</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="17" data-ref-tag="nav_em_1_1_1_22"><div>Books</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="" class="hmenu-item" tabindex="-1" data-menu-id="18" data-ref-tag="nav_em_1_1_1_23"><div>Movies, Music &amp; Video Games</div><i class="nav-sprite hmenu-arrow-next"></i></a></li></ul><li><a class="hmenu-item hmenu-compressed-btn" href=""><div>see all</div><i class="nav-sprite hmenu-arrow-more"></i></a><a class="hmenu-item hmenu-expanded-btn" href=""><div>see less</div><i class="nav-sprite hmenu-arrow-less"></i></a></li><li class="hmenu-separator"></li><li><div class="hmenu-item hmenu-title ">programs &amp; features</div></li><li><a href="" class="hmenu-item" data-menu-id="19" data-ref-tag="nav_em_1_1_1_25"><div>Gift Cards &amp; Mobile Recharges</div><i class="nav-sprite hmenu-arrow-next"></i></a></li><li><a href="/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_26" class="hmenu-item">Flight Tickets</a></li><li><a href="/finds?ref_=nav_em_sbc_desktop_foundit_0_1_1_27" class="hmenu-item">#FoundItOnAmazon</a></li><li><a href="/outlet?ref_=nav_em_sbc_desktop_outlet_0_1_1_28" class="hmenu-item">Amazon Outlet</a></li><li class="hmenu-separator"></li><li><div class="hmenu-item hmenu-title ">help &amp; settings</div></li><li><a href="/gp/css/homepage.html?ref_=nav_em_ya_0_1_1_30" class="hmenu-item">Your Account</a></li><li><a href="/gp/help/customer/display.html?nodeId=508510&amp;ref_=nav_em_cs_help_0_1_1_31" class="hmenu-item">Customer Service</a></li><li><a class="hmenu-item" onclick="$Nav.getNow('signInRedirect')('nav_em_hd_re_signin', 'https://www.amazon.in/ap/signin?openid.assoc_handle=inflex&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.mode=checkid_setup&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%2F%3Fie%3DUTF8%26ref_%3Dnavm_em_hd_re_signin&amp;ref_=nav_em_hd_clc_signin_0_1_1_32', 'nav_em_hd_clc_signin_0_1_1_32')">Sign In</a></li>
        //</ul>
        ////*[@id="hmenu-content"]/ul[1]
        //#hmenu-content > ul.hmenu.hmenu-visible

        List<WebElement> menuPageElement = driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li/a"));

        //String link = mobilesPageElement.getAttribute("href");
        System.out.println(menuPageElement);

        for(WebElement element : menuPageElement){
            //System.out.println(element.getText());
            System.out.println(element.getAttribute("href"));
            //System.out.println(element.getAttribute("href"));
        }
        driver.close();
    }
}
