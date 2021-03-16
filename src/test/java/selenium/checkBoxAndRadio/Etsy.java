package selenium.checkBoxAndRadio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy{
    @Test
    public void test1() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://www.etsy.com/" );
        WebElement searchButton=driver.findElement( By.xpath("//button[@value='Search']") );
        searchButton.click();
        driver.manage().window().maximize();
        Thread.sleep( 3000 );
       WebElement shipp1= driver.findElement( By.xpath( "//label[@for='max-processing-days-1']" ) );
       shipp1.click();
       shipp1=driver.findElement( By.xpath( "//label[@for='max-processing-days-1']/preceding-sibling::input" ) );
        Assert.assertTrue(shipp1.isSelected());
        WebElement shipp3=driver.findElement( By.xpath( "//label[@for='max-processing-days-3']" ) );
        shipp3.click();
        shipp3=driver.findElement( By.xpath( "//label[@for='max-processing-days-3']/preceding-sibling::input" ) );
        Assert.assertTrue( shipp3.isSelected() );
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice" );
        WebElement bmw=driver.findElement( By.id( "bmwradio" ) );
        Assert.assertFalse( bmw.isSelected() );
        bmw.click();

        Assert.assertTrue( bmw.isSelected() );//Assert.assertEquals(true,bmw.isSelected());
        WebElement benz=driver.findElement( By.id( "benzradio" ) );
        Assert.assertFalse( benz.isSelected() );
        WebElement honda=driver.findElement( By.id( "hondaradio" ) );
        Assert.assertFalse( honda.isSelected() );
    }

}
