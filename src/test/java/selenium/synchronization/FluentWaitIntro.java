package selenium.synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FluentWaitIntro{
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver,3);
    }
    @Test
    public void test1(){
        driver.get("https://google.com");
        Wait<WebDriver> fluentWait=new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofSeconds(2)).
                ignoring(NoSuchElementException.class);
    WebElement temirlan=fluentWait.until(driver1 -> driver1.findElement(By.id("temirlan")));
    }
    @Test(expectedExceptions=TimeoutException.class)
    public void test2(){
        driver.get("https://the-internet.herokuapp.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("basak")));
        wait.until(ExpectedConditions.titleIs("armagan"));
    }
    @Test
    public void test3(){
        driver.get("https://the-internet.herokuapp.com/");
        Wait<WebDriver> fluentWait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement non_existing=fluentWait.until(driver1 -> driver1.findElement(By.id("fluent")));
    }

}
