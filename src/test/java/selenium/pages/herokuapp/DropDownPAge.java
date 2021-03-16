package selenium.pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPAge{
    public DropDownPAge(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(tagName="h3")
    public WebElement dropDownTitle;

}
