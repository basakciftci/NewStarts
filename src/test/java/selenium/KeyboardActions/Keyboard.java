package selenium.KeyboardActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard{
    @Test
    public void allUpperCase(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://google.com" );
        WebElement search=driver.findElement( By.name("q") );
        Actions actions=new Actions( driver );
        actions.keyDown( Keys.SHIFT ).sendKeys( search,"t" )
                .keyUp( Keys.SHIFT ).sendKeys( search,"echtorial academy"+Keys.ENTER ).perform();

    }

    @Test
    public void copyPaste(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://amazon.com" );
        WebElement search=driver.findElement( By.id( "twotabsearchtextbox" ) );
        Actions actions=new Actions( driver );
        actions.sendKeys( search,"java" ).keyDown( Keys.CONTROL ).sendKeys( "a" )
                .sendKeys( "c" )
                .sendKeys( "v" )
                .sendKeys( "v" ).keyUp( Keys.CONTROL ).perform();
    }
    @Test
    public void cutPasteTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://amazon.com" );
        WebElement search=driver.findElement( By.id( "twotabsearchtextbox" ) );
        Actions actions=new Actions( driver );
        actions.sendKeys( search,"iphone 12" )
                .keyDown( Keys.CONTROL )
                .sendKeys( "a" )
                .sendKeys( "x" ).sendKeys( "v" ).sendKeys( "v" ).sendKeys( "v" ).keyUp( Keys.CONTROL )
                .perform();
    }



}
