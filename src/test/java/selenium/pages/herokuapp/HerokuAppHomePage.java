package selenium.pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppHomePage{
    public  HerokuAppHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="A/B Testing")
   public WebElement abTesting;
    @FindBy(linkText="Add/Remove Elements")
   public WebElement addRemoveElements;
    @FindBy(xpath="//a[@href='/challenging_dom']")
   public WebElement challengingDomLink;
    @FindBy(xpath="//a[text()='Dropdown']")
    public WebElement dropDownLink;





}
