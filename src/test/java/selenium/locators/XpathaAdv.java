package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathaAdv{
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/checkboxes" );

        WebElement checkbox1=driver.findElement( By.xpath( "//input[@type='checkbox']/preceding-sibling::input" ) );
        checkbox1.click();
        boolean isChecked=checkbox1.isSelected();

        Assert.assertTrue( isChecked );
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/checkboxes" );

        WebElement checkbox2=driver.findElement( By.xpath( "//input[@type='checkbox']/following-sibling::input" ) );
        checkbox2.click();
        boolean isChecked=checkbox2.isSelected();
        Assert.assertFalse( isChecked );
    }

    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/checkboxes" );

        WebElement checkbox1=
                driver.findElement( By.xpath( "//input[@type='checkbox']/preceding-sibling::input" ) );
        WebElement checkbox2=
                driver.findElement( By.xpath( "//input[@type='checkbox']/following-sibling::input" ) );
        boolean checked1=checkbox1.isSelected();
        boolean checked2=checkbox2.isSelected();
        if (!checked1){
            checkbox1.click();
            Assert.assertTrue( checkbox1.isSelected() );
        }
        if (!checked2){
            checkbox2.click();
            Assert.assertFalse(checkbox2.isSelected()  );
        }

    }
}