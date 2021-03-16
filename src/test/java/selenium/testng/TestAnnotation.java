package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotation{
    WebDriver driver;
    @BeforeClass
    public void classSetup(){
        System.out.println("Before class hook is executed");
    }
    @AfterClass
    public void classCleanUp(){
        System.out.println("After class hook is executed");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before method hook is executed");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method hook is executed");
        driver.close();
    }
    @Test(priority=10 ,enabled=false)
    public void testGoogle(){
        System.out.println("Executing Google Test");
        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test(priority=1,invocationCount=3)
    public void testTechtorial(){
        System.out.println("Executing Techtorial Test");
        driver.get("https://techtorialacademy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("techtorial"));
    }
    @Test(expectedExceptions=RuntimeException.class)
    public void test6(){
        System.out.println("test6");
        throw  new RuntimeException();
    }
    @Test(dependsOnMethods="test6")
    public void test7(){

    }
}
