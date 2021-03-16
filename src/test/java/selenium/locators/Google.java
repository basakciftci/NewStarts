package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google{
    @Test
    public void test1(){
       // System.setProperty( "webdriver.chrome.driver", "resources\\chromedriver.exe" );//provide chrome driver executable location
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();//instantiate chrome driver
        driver.get( "https://www.google.com/" );
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(title,"Google");
        Assert.assertEquals( url,"https://www.google.com/" );
        WebElement search=driver.findElement( By.xpath( "//input[@class='gLFyf gsfi']" ) );
        search.sendKeys( "Selenium Cookbook" + Keys.ENTER );
        String seleniumTitle=driver.getTitle();
        Assert.assertEquals( seleniumTitle,"Selenium Cookbook - Google Search" );


    }


}
