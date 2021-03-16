package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Practice{
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
    @BeforeClass
    public void classStart(){
        System.out.println("This will be start");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This will be at the end");
    }
    @Test(enabled=false)
    public void test1(){
        System.out.println("This is Kadir s page");
        driver.get("https://www.tutorialspoint.com/java/index.htm");
        Assert.assertTrue(driver.getCurrentUrl().contains("java"));
    }
    @Test(priority=3,invocationCount=2)
    public void test2(){
        System.out.println("This is Basaks page");
        driver.get("https://www.udemy.com/cart/");
        Assert.assertTrue(driver.getCurrentUrl().contains("udemy"));
    }
    @Test(priority=2,invocationCount=2)
    public void test3(){
        System.out.println("This is new start ");
        driver.get("https://artoftesting.com/manual-testing-interview-questions");
        Assert.assertTrue(driver.getCurrentUrl().contains("manual-testing"));
    }

}
