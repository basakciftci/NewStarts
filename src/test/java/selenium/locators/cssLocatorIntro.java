package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cssLocatorIntro{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @Test
    public void test1(){
        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        search.sendKeys("java programming");
        js.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",search);
    }
}
