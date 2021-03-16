package selenium.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class AlertsInfo{
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @Test
    public void alertsTest(){
        driver.get("https://the-internet.herokuapp.com/");
        WebElement jasLink=driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        actions.keyDown(Keys.SHIFT).click(jasLink).perform();
        String currentWindowId=driver.getWindowHandle();
        Set<String> allWindowIds=driver.getWindowHandles();
        String newWindowID="";
        for (String id: allWindowIds){
            if (!id.equals(currentWindowId)){
                newWindowID=id;
            }
        }driver.switchTo().window(newWindowID);
        WebElement jsalert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsalert.click();
        driver.switchTo().alert().accept();
        WebElement jsAlert2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsAlert2.click();
        driver.switchTo().alert().dismiss();
        WebElement jsAlert3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsAlert3.click();
        driver.switchTo().alert().sendKeys("Basak");
        driver.switchTo().alert().accept();


//        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().sendKeys("jsdsuicn"+ Keys.ENTER);
    }
}
