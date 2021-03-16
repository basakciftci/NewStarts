package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp{
    @Test
    public void test(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/" );
        WebElement clickLink=driver.findElement( By.xpath( "//a[@href='/abtest']" ) );
        clickLink.click();
        String title=driver.getTitle();
        System.out.println("Result is "+title);
    }

    @Test
    public void dropDownTest(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/");
        WebElement dropDown=driver.findElement( By.xpath( "//a[@href='/dropdown']" ) );
        String dropDownText=dropDown.getText();
        System.out.println(dropDownText);

    }
    @Test
    public void checkBoxes(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/" );
        driver.manage().window().maximize();
        WebElement checkBox=driver.findElement( By.xpath( "//a[@href='/checkboxes']" ) );
        checkBox.click();
        String title=driver.getTitle();
        driver.navigate().back();
        WebElement dropDown=driver.findElement( By.xpath( "//a[@href='/dropdown']" ) );
        dropDown.click();
        String dropDownText=driver.getTitle();
        System.out.println(dropDownText);
        System.out.println(title);
        driver.quit();
    }
}

