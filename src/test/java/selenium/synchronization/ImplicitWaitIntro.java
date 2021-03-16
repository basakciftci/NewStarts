package selenium.synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitIntro{
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);
    }
    @Test
    public void test(){
        driver.get("https://google.com");
        driver.findElement(By.name("q"));
    }
    @Test
    public void test2(){
        driver.get("https://facebook.com");
        //explicit wait
        wait.until(ExpectedConditions.titleIs("Facebook - Log In or Sign Up"));
    }
    @Test
    public void test3(){
        driver.get("http://techtorialacademy.com");
//        WebElement applyButton=
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//temirlan")));
        WebElement applyButtonAlt=locateMyElement(By.xpath("//temirlan"),3);

    }
    public void clickOn(By locator){
        WebDriverWait  wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public WebElement locateMyElement(By locator){
        WebDriverWait  wait=new WebDriverWait(driver,10);
        WebElement locatedElement=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return locatedElement;
    }
    public WebElement locateMyElement(By locator, int timeOut){
        WebDriverWait  wait=new WebDriverWait(driver,10);
        WebElement locatedElement=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return locatedElement;
    }

}
