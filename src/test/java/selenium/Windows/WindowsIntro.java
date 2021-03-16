package selenium.Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsIntro{
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @Test
    public void test1(){
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        actions.sendKeys(searchBox,"java programming"+Keys.ENTER).perform();
        WebElement link=driver.findElement(By.xpath("//span[text()='Java Programming Language']"));

        actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();

        String currentWindowId=driver.getWindowHandle();
        Set<String> allWindowIds=driver.getWindowHandles();
        String newWindowID="";
        for (String id: allWindowIds){
            if (!id.equals(currentWindowId)){
                newWindowID=id;
            }
        }driver.switchTo().window(newWindowID);
        WebElement header=driver.findElement(By.tagName("h1"));
        Assert.assertEquals(header.getText(),"Java™ Programming Language");
        driver.switchTo().window(currentWindowId);
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.partialLinkText("Java (programming language)"));
        actions.keyDown(Keys.SHIFT).click(element).keyUp(Keys.SHIFT).perform();
        allWindowIds=driver.getWindowHandles();
        String thirdWindowID="";
        for (String id: allWindowIds){
            if (!id.equals(currentWindowId)&& !id.equals(newWindowID)){
                thirdWindowID=id;
            }
        }driver.switchTo().window(thirdWindowID);
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println(url);
    }
    @Test
    public void test2(){

    }
}
