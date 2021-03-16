package selenium.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DropDonwIntro{
    @Test
    public void dropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/dropdown" );
        WebElement dropDown=driver.findElement( By.id( "dropdown" ) );
        Select select=new Select( dropDown );
        select.selectByValue( "1" );

        //select.selectByVisibleText( "Option 1" );
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://www.amazon.com/" );
        WebElement book=driver.findElement( By.id( "searchDropdownBox" ) );
        Select select=new Select( book );
        select.selectByVisibleText( "Books" );
    }

    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/dropdown" );
        WebElement dropDown=driver.findElement( By.id( "dropdown" ) );
        Select select=new Select( dropDown );
        select.selectByIndex( 1 );

    }
    @Test
    public void test4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/dropdown" );
        WebElement dropDown=driver.findElement( By.id( "dropdown" ) );
        Select dropdownHandler=new Select( dropDown );

        List<WebElement>listOFOptions=dropdownHandler.getOptions();
        for (WebElement option:listOFOptions){
            System.out.println( option.getText() );
        }

    }
    @Test
    public void test5(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://www.amazon.com/" );
        WebElement searchDrop=driver.findElement( By.id( "searchDropdownBox" ) );
        Select dropDownHandler=new Select( searchDrop );

        List <WebElement> listOptions=dropDownHandler.getOptions();
        System.out.println(listOptions.size());//it gives us the options size
        for (WebElement option:listOptions) {
            System.out.println( option.getText() );
        }

    }
    @Test
    public void test6(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice"  );
        WebElement drop=driver.findElement( By.id( "carselect" ) );
        Select dropdown=new Select( drop );
        dropdown.selectByValue( "honda" );
        WebElement selectedOption=dropdown.getFirstSelectedOption();
        assertEquals( "Honda",selectedOption.getText() );
    }

    @Test
    public void test7(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice" );
        WebElement dropdown=driver.findElement( By.id( "carselect" ) );
        Select select=new Select( dropdown );
        select.selectByVisibleText( "Benz" );
        WebElement firstSelected=select.getFirstSelectedOption();
       assertEquals( "Benz",firstSelected.getText() );
    }
    @Test
    public void test8(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement drop=driver.findElement( By.id( "searchDropdownBox" ) );
        Select select=new Select( drop );
        select.selectByVisibleText( "Prime Video" );
        WebElement firstSelected=select.getFirstSelectedOption();
        assertEquals( "Prime Video", firstSelected.getText() );

    }



}