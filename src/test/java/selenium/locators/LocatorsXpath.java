package selenium.locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath{
    @Test
    public void absoluteXpath(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );//provide chrome driver executable location
        WebDriver driver=new ChromeDriver();//instantiate chrome driver
        driver.get( "https://the-internet.herokuapp.com/" );//navigate
        WebElement horizontal=driver.findElement( By.linkText( "Horizontal Slider" ) );
        horizontal.click();
        WebElement header=driver.findElement( By.xpath( "/html/body/div[2]/div/div/h3" ) );
        System.out.println(header.getText());
        WebElement element=driver.findElement( By.xpath( "//a[text()='Elemental Selenium']" ) );
        System.out.println(element.getText());
        WebElement element2=driver.findElement( By.xpath( "//div[text()='Powered by ']" ) );
        System.out.println(element2.getText());

        Assert.assertEquals("Temirlan","Temirlan");

    }
}
