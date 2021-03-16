package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization2{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Parameters({"email","gender"})
    @Test
    public void test(String myemail,String myGender){
        System.out.println("E mail is "+myemail);
        System.out.println("Gender is "+myGender);

        driver.get("https://google.com");
        WebElement searchbox=driver.findElement(By.name("q"));
    }

}
