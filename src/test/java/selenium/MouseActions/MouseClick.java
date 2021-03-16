package selenium.MouseActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick{
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement abTesting=driver.findElement( By.linkText( "A/B Testing" ) );
        Actions action=new Actions( driver );
        action.click( abTesting ).perform();
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement contextMenu=driver.findElement( By.partialLinkText( "Context Menu" ) );
        Actions actions=new Actions( driver );
        actions.click(contextMenu).perform();
        WebElement rectangle=driver.findElement( By.id( "hot-spot" ) );
        actions.contextClick( rectangle ).perform();

    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement horizontal=driver.findElement( By.linkText( "Horizontal Slider" ) );
        Actions actions=new Actions( driver );
        actions.click( horizontal ).perform();
        WebElement slider=driver.findElement( By.xpath( "//input[@type='range']" ) );
        actions.clickAndHold(slider).moveByOffset( 50,0 ).release().perform();
    }
    @Test
    public void test4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement hoversLink=driver.findElement( By.linkText( "Hovers" ) );
        Actions actions= new Actions( driver );
        actions.click(hoversLink).perform();
        WebElement user=
                driver.findElement( By.xpath( "//h5[.='name: user3']/../preceding-sibling::img" ) );
        actions.moveToElement( user ).perform();
        WebElement user3Name=driver.findElement( By.xpath( "//h5[text()='name: user3']" ) );
        boolean isUser3Displayed=user3Name.isDisplayed();
        Assert.assertTrue(isUser3Displayed);
    }
    @Test
    public void draggableElementsTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get( "https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=7f722" );
        WebElement draggableEl1=driver.findElement( By.id( "pnl_header" ) );
        Actions actions=new Actions( driver );
        actions.dragAndDropBy( draggableEl1,200,-230 ).perform();

    }
    @Test
    public void draggableElementsTest2() throws InterruptedException{
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get( "https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=7f722" );
        WebElement draggableEl1=driver.findElement( By.id( "pnl_header" ) );
        WebElement destinationElement=driver.findElement( By.id( "handlepnl_content" ) );
        Actions actions=new Actions( driver );
        actions.dragAndDrop(draggableEl1,destinationElement).perform();
        Thread.sleep( 3000 );
        driver.close();
    }
    @Test
    public void homeWork1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        WebElement hoversLink=driver.findElement( By.linkText( "Hovers" ) );
        Actions actions= new Actions( driver );
        actions.click(hoversLink).perform();
        WebElement user1=
                driver.findElement( By.xpath("//h5[.='name: user1']/../preceding-sibling::img"));
        actions.moveToElement( user1 ).perform();
        WebElement user1Name=driver.findElement( By.xpath( "//h5[text()='name: user1']" ));
        boolean isUser1Displayed=user1Name.isDisplayed();
        Assert.assertTrue(isUser1Displayed);


    }
    @Test
    public void homework2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/horizontal_slider" );
        Actions actions=new Actions( driver );
        WebElement slider=driver.findElement( By.xpath( "//input[@type='range']" ) );
        actions.clickAndHold(slider).moveByOffset( 5,0 ).release().perform();
         WebElement value=driver.findElement( By.xpath( "//span[@id='range']" ) );
         String str=value.getText();
        //System.out.println(str);
        Assert.assertEquals( "2.5",str );

    }
    @Test
    public void homework3Horizontal(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=14c67" );
        Actions actions=new Actions( driver );
        WebElement drag=driver.findElement( By.id( "hpnl_header" ) );
        actions.dragAndDropBy( drag,400,0).perform();

    }
    @Test
    public void homework3Vertical(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=14c67" );
        Actions actions=new Actions( driver );
        WebElement drag=driver.findElement( By.id( "hpnl_header" ) );
        actions.dragAndDropBy( drag,400,0).perform();
        WebElement dragVertical=driver.findElement( By.id( "vpnl_header" ) );
        actions.dragAndDrop( dragVertical,drag ).perform();
}

@Test
    public void doubleClickTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get( "http://demo.guru99.com/test/simple_context_menu.html" );
        String currentTitle=driver.getTitle();
        Assert.assertEquals( "Simple Context Menu",currentTitle );
        WebElement doubleClick=driver.findElement( By.xpath( "//button[@ondblclick='myFunction()']" ) );
        Actions actions=new Actions( driver );
        actions.doubleClick(doubleClick).perform();
}
}