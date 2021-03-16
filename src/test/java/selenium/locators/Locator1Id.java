package selenium.locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1Id{
    @Test
    public void test1(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "https://www.amazon.com" );
        WebElement searchBox=driver.findElement( By.id("twotabsearchtextbox") );
        searchBox.sendKeys( "iphone 12"+Keys.ENTER );
        //searchBox.submit();
        WebElement first=driver.findElement( By.xpath( "//span[@class='a-size-medium a-color-base a-text-normal']" ) );
        first.click();
        WebElement text=driver.findElement( By.xpath( "//span[@class='a-size-large qa-title-text']" ) );
        String phone=text.getText();
        System.out.println(phone);
        driver.quit();

    }
    @Test
    public void classNameTest(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );//provide chrome driver executable location
        WebDriver driver=new ChromeDriver();//instantiate chrome driver
        driver.get( "https://the-internet.herokuapp.com/" );//navigate
        WebElement horizontal=driver.findElement( By.partialLinkText( "Horiz" ) );//locate element
        horizontal.click();//click link

       WebElement subheader= driver.findElement( By.className( "subheader" ) );
        System.out.println(subheader.getText());


    }
}
