package selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static selenium.utils.DriverUtils.getDriver;

public class Test1{
    @Test
    public void test1(){
        WebDriver driver=getDriver("chrome");
        driver.get("https://google.com");
        List<WebElement> elements=driver.findElements(By.xpath("//adlkfdghdefufhuifhoi"));
        System.out.println(elements.size());
        List <WebElement > elemnt=driver.findElements(By.cssSelector("//input[@name='q']"));
        System.out.println(elemnt.size());
    }
}
