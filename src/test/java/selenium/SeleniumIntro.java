package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro{
    @Test
    public void test1(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
      WebElement searchField= driver.findElement( By.xpath( "//input[@name='q']" ) );
      searchField.sendKeys( "Selenium cookbook"+ Keys.ENTER );
      String googleTitle=driver.getTitle();
        System.out.println("Google search result page's title: "+googleTitle);

    }


}
