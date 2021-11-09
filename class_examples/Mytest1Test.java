// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Mytest1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void mytest1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1050, 660));
    driver.switchTo().frame(0);
    driver.switchTo().defaultContent();
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("hello");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    js.executeScript("window.scrollTo(0,1500)");
    {
      WebElement element = driver.findElement(By.cssSelector(".RzdJxc:nth-child(1) .WZIVy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("rso")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    driver.close();
  }
}