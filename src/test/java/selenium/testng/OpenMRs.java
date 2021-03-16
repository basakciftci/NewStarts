package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenMRs{
    protected WebDriver driver;
     private Select select;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
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
        WebElement register=driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"));
        register.click();
        WebElement name=driver.findElement(By.name("givenName"));
        name.sendKeys("Basak");
        WebElement lastName=driver.findElement(By.name("familyName"));
        lastName.sendKeys("Ciftci");
        WebElement nextButton=driver.findElement(By.id("next-button"));
        nextButton.click();
        WebElement gender=driver.findElement(By.id("gender-field"));
        select=new Select(gender );
        select.selectByVisibleText("Female");
        nextButton.click();
        WebElement dateDay=driver.findElement(By.id("birthdateDay-field"));
        dateDay.sendKeys("03");
        WebElement month=driver.findElement(By.id("birthdateMonth-field"));
        select=new Select(month);
        select.selectByVisibleText("March");
        WebElement year=driver.findElement(By.id("birthdateYear-field"));
        year.sendKeys("1989");
        nextButton.click();
        WebElement address1=driver.findElement(By.id("address1"));
        address1.sendKeys("695 Devonshire");
        WebElement city=driver.findElement(By.id("cityVillage"));
        city.sendKeys("DEs Plaines");
        nextButton.click();
        WebElement phone=driver.findElement(By.name("phoneNumber"));
        phone.sendKeys("123456789");
        nextButton.click();
        WebElement relative=driver.findElement(By.id("relationship_type"));
        select=new Select(relative);
        select.selectByIndex(2);
        nextButton.click();
        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();

    }
    @AfterMethod
    public void  tearDown(){
       driver.quit();
    }
}
