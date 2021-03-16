package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion{
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("this is end of test");
        driver.close();
    }
    @Test
    public void test1(){
        System.out.println("Code before assertion");
        Assert.assertEquals(2,2);
        System.out.println("Code after assertion");
    }
    @Test
    public void test2(){
        System.out.println("Code before soft assertion");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(2,2);
        softAssert.assertEquals("John","John");
        System.out.println("Code after soft assertion");
        softAssert.assertAll();

    }
    @Test
    public void googleSearch(){
        driver.get("https://google.com");
        Assert.assertEquals("Google",driver.getTitle());
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("java oca certification"+ Keys.ENTER);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("google"));

        String searchResult=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        searchResult=searchResult.substring(6,13);
        searchResult=searchResult.replace(",","");
        int number=Integer.parseInt(searchResult);
        softAssert.assertTrue(number>100000);
        softAssert.assertAll("Good job Tester");//if it does not pass we will see the message


    }
}
