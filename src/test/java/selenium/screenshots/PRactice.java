package selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PRactice{
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void cleanUp(ITestResult result){
        if (!result.isSuccess()){
            takeScreenshot(result.getName());
        }
        driver.quit();
    }
        @Test
    public void heroku(){
        driver.get("https://the-internet.herokuapp.com/");
        takeScreenshot("heroku");
        WebElement horizontal=driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizontal.click();
        takeScreenshot("heroku");
        Actions actions=new Actions( driver );
        WebElement slider=driver.findElement( By.xpath( "//input[@type='range']" ) );
        actions.clickAndHold(slider).moveByOffset( 5,0 ).release().perform();
        takeScreenshot("heroku");
        WebElement value=driver.findElement( By.xpath( "//span[@id='range']" ) );
        String str=value.getText();
        Assert.assertEquals( "2.5",str );
        takeScreenshot("heroku");

    }
    @Test
    public void takeScreenshot(String screenshotName){
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String screenshotDirectory="screenshot/";
        try {
            FileUtils.copyFile(screenshot, new File(screenshotDirectory +screenshotName+ "-" +
                    System.currentTimeMillis() + ".png"));
        }catch (IOException ex){
            System.out.println("Screenshot was not taken");
            ex.printStackTrace();
        }

    }
}
