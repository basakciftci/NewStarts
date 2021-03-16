package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class LocateMultipleElements{
    @Test
    public void multipleElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://amazon.com" );
        WebElement search=driver.findElement( By.id( "twotabsearchtextbox" ) );
        Actions actions=new Actions( driver );
        actions.sendKeys( search,"iphone 12" + Keys.ENTER).perform();
     List<WebElement>prices= driver.findElements( By.xpath( "//span[@class='a-price']" ) );
     double totalPrice=0;
     for (WebElement elementPrice:prices){
//         System.out.println(elementPrice.getText());
         String temp=elementPrice.getText();
         if (temp.startsWith( "$" )){
             temp=temp.substring( 1 );
         }if (temp.contains( "," )){
             temp=temp.replace( ",","" );
         }if (temp.isEmpty()){
             continue;
         }
         if (temp.contains( "\n" ))
             temp=temp.replace( "\n","." );
         System.out.println(temp);
         totalPrice+=Double.parseDouble( temp );
     }
        System.out.println(totalPrice);
    }

    @Test
    public void samsung(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://amazon.com" );
        WebElement search=driver.findElement( By.id( "twotabsearchtextbox" ) );
        Actions actions=new Actions( driver );
        actions.sendKeys( search,"samsung" + Keys.ENTER).perform();
      List<WebElement> listS=driver.findElements( By.xpath( "//span[@class='a-size-medium a-color-base a-text-normal']" ) );
     List<String>productNames=new ArrayList<>();
      for (WebElement list:listS){
          String temp=list.getText();
          productNames.add( temp );
      }
      int index=0;
      while (index<productNames.size())
        System.out.println( index +". "+productNames.get( index++));
        Assert.assertTrue(productNames.get( index).toLowerCase().contains( "samsung" ));

    }
}
