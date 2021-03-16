package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.utils.Base;

import java.util.List;

public class EtsyParameter extends Base{
    private SoftAssert softAssert;
    @Parameters({"searchItem"})
    @Test
    public void login(String mySearchItem){
        driver.get("https://www.etsy.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys(mySearchItem + Keys.ENTER);
        List<WebElement> links=driver.findElements(By.xpath("//h3[@class='text-gray text-truncate mb-xs-0 text-body ']"));
       // Assert.assertTrue(driver.getCurrentUrl().contains("java"));
        String [] arr=mySearchItem.split(" ");
        String java=arr[0];
        String programming=arr[1];
        String mug=arr[2];

        for (WebElement itemLink:links){
            String temp=itemLink.getText();
            System.out.println(temp);
            softAssert.assertTrue(temp.contains(java)||temp.contains(programming)||temp.contains(mug));
        }
        //softAssert.assertAll();


    }
}