package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderInfo{
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test(dataProvider="MRSTestData")
    @Parameters({"username","password"})
    public void testData(String myUsername,String myPassword){
        driver.get("https://demo.openmrs.org");
        WebElement userName=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement inpatientWard=driver.findElement(By.id("Inpatient Ward"));
        userName.sendKeys(myUsername);
        password.sendKeys(myPassword);
        inpatientWard.click();
        WebElement login=driver.findElement(By.id("loginButton"));
        login.click();
    }
    @AfterMethod
    public void  tearDown(){
        driver.quit();
    }
    @DataProvider(name="MRSTestData")
    public Object [][] getTestData(String username, String password){
        return new Object[][]{{"admin123","invalidPassword"},
                {"invalidUsername","Admin123" },
                {"",""},
                {"admin123"," "},{" ","admin123"},
                {" ", "Admin123"},
                {"invalidUsername", "invalidPassword"},
                {"techtorial", "techtorial123"},
                {"Admin123", "admin"},};
    }

}
