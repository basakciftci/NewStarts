package selenium.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPAge{
    public AmazonPAge(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement search;
    @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> result;
    @FindBy(xpath="//span[@class='a-price-whole']")
    public List<WebElement> price;
}
