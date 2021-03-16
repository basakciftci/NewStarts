package selenium.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.pages.herokuapp.DropDownPAge;
import selenium.pages.herokuapp.HerokuAppHomePage;

public class DropDownTEst{
    WebDriver driver;
    HerokuAppHomePage herokuAppHomePage;
    DropDownPAge dropDownPAge;
   @BeforeMethod
   public void setup(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       herokuAppHomePage=new HerokuAppHomePage(driver);
       dropDownPAge=new DropDownPAge(driver);
   }
   @Test
           public void test1(){
       driver.get("https://the-internet.herokuapp.com/");
       herokuAppHomePage.dropDownLink.click();
       String expected="Dropdown List";
       Assert.assertEquals(expected, dropDownPAge.dropDownTitle.getText());
   }


}
