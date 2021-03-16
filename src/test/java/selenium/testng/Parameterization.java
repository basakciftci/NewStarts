package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Parameters({"username","password"})
    @Test
    public void parametersTest(String myUserName,String myPassword){
        driver.get("https://facebook.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
        WebElement emailField=driver.findElement(By.id("email"));
        WebElement passwordField=driver.findElement(By.id("pass"));
        emailField.sendKeys(myUserName);
        passwordField.sendKeys(myPassword);
    }
    @Test
    public void parallelTest() throws InterruptedException{
        driver.navigate().to("http://techtorialacademy.com");
        Thread.sleep(2000);
    }
    @Test
    public void test3(){

    }

}
