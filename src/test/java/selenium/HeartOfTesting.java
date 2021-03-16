package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeartOfTesting{
    @Test
    public void test1(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement horizontalLink=driver.findElement( By.xpath("//a[text()='Horizontal Slider']") );
        horizontalLink.click();
        WebElement header=driver.findElement( By.xpath("//h3[contains(text(),'Horizontal Slider')]") );
        String headerText=header.getText();//get text from header
        String expectedText="Horizontal Slider";
        Assert.assertEquals(expectedText,headerText);//validating the header
    }
}
