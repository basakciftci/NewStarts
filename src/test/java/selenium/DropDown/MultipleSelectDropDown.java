package selenium.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MultipleSelectDropDown{
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice" );
        WebElement multiOptionDD=driver.findElement( By.id( "multiple-select-example" ) );
        Select select=new Select( multiOptionDD );
        boolean multi=select.isMultiple();
        if (multi){
            select.selectByIndex( 0 );
            select.selectByIndex( 1 );
        }
        System.out.println(select.getAllSelectedOptions().get( 0 ).getText()+", "
                +select.getAllSelectedOptions().get( 1 ).getText());
    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice" );
        WebElement dd=driver.findElement( By.id( "multiple-select-example" ));
        Select select=new Select( dd );
        boolean isMulti=select.isMultiple();
        if (isMulti){
            select.selectByValue( "apple" );
            select.selectByValue( "peach" );
        }
      List<WebElement> selected=  select.getAllSelectedOptions();
        for (int i=0;i<selected.size();i++) {
            System.out.println( selected.get( i ).getText() );
        }
        //fail fast approach, important to validate the total number of selected options
        // first before validating the selected values

        Assert.assertEquals( 2,selected.size() );
        List<String > expectedValues=new ArrayList<>();
        expectedValues.add("Apple");
        expectedValues.add( "Peach" );
    for (WebElement element:selected){
        Assert.assertTrue( expectedValues.contains( element.getText() ) );
    }

    }
    @Test
    public void test3() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get( "https://learn.letskodeit.com/p/practice" );
        WebElement dd=driver.findElement( By.id( "multiple-select-example" ));
        Select ddHandler=new Select( dd );
        ddHandler.selectByVisibleText( "Orange" );
        ddHandler.selectByVisibleText( "Peach" );
        Thread.sleep( 3000 );
        ddHandler.deselectByVisibleText( "Orange" );
        ddHandler.selectByIndex( 2 );

    }
}
