package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class Base{
    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;
    protected Select select;
    @BeforeMethod
    public void setup(){
        String browser=CommonUtils.readProperty("src/test/resources/configurations.properties","browser");
        driver=DriverUtils.getDriver(browser);
        actions=new Actions(driver);
        softAssert=new SoftAssert();

    }
    @AfterMethod
    public void tearDown(ITestResult result){
        if (!result.isSuccess()){
            CommonUtils.takeAScreenShot(driver,result.getName());
        }driver.quit();
    }


}
