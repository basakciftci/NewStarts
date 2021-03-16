package selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.pages.amazon.AmazonPAge;
import selenium.utils.DriverUtils;

import java.util.List;

public class AmazonHomePage{
    WebDriver driver;
    AmazonPAge amazonPAge;
    @BeforeMethod
    public void setup(){

        driver=DriverUtils.getDriver("chrome");
        amazonPAge=new AmazonPAge(driver);
    }
    @Test
    public void searchTest(){
        driver.get("https://www.amazon.com/");
        amazonPAge.search.sendKeys("MSI Gaming Laptop"+ Keys.ENTER);
        List<WebElement> result=amazonPAge.result;
        for (int i=0;i<result.size();i++){
            if (i==5){
                String price=amazonPAge.price.get(i).getText();
                System.out.println(price);
                Assert.assertEquals(price,"999"); }
        }



    }



}
