package selenium.locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy{
    @Test
    public void test1()

    {
        System.setProperty( "webdriver.chrome.driver", "resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "https://etsy.com" );
        WebElement searchBox=driver.findElement( By.id( "global-enhancements-search-query" ) );
        searchBox.sendKeys( "Java book"+ Keys.ENTER );
        String linkText=driver.getCurrentUrl();
        System.out.println(linkText);
    }
    @Test
    public void nameLocator(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://demo.guru99.com/test/newtours/register.php" );
        WebElement firstName=driver.findElement( By.name( "firstName" ) );
        firstName.sendKeys( "Temirlan" );
//        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.name("submit")).click();
//        String expTitle="Welcome: Mercury Tours";
//        String actTitle=driver.getTitle();
//        //validation
//        if (expTitle.equals(actTitle)==true){
//            System.out.println("Test is passed");
//        }else{
//            System.out.println("Test is failed");
//        }

    }
    @Test
    public void  tagNameLocator(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTest=driver.findElement( By.xpath( "//a[@href='/abtest']" ) );
        abTest.click();
        WebElement abTestHeader=driver.findElement(By.tagName( "h3" ) );
        String currentUrl=driver.getCurrentUrl();
        System.out.println(abTestHeader.getText());
        System.out.println(currentUrl);
    }
    @Test
    public void tagNameSample(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement horizontal=driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizontal.click();
        WebElement hrzHeader=driver.findElement( By.tagName( "h3" ) );
        System.out.println(hrzHeader.getText());
        WebElement subHeader=driver.findElement( By.tagName( "h4" ) );
        System.out.println(subHeader.getText());
    }
    @Test
    public void linkText(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTestLinkText=driver.findElement( By.linkText( "A/B Testing" ) );
        abTestLinkText.click();
    }
    @Test
    public void linkTest2(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title=driver.getTitle();
        System.out.println("Title is "+title);
        String homeUrl=driver.getCurrentUrl();
        System.out.println(homeUrl);

        WebElement forgotPas=driver.findElement( By.linkText( "Forgot Password" ) );
        forgotPas.click();

        WebElement header=driver.findElement(By.tagName( "h2" ) );
        System.out.println(header.getText());
        driver.navigate().back();

        WebElement hovers=driver.findElement( By.linkText( "Hovers" ) );
        hovers.click();
        driver.navigate().back();
        String url=driver.getCurrentUrl();
        if (url.equals( homeUrl )){
            System.out.println("Url matched");
        }else{
            System.out.println("Url did not matched");
        }

    }@Test
    public void partialLinkTextTEst(){
        System.setProperty( "webdriver.chrome.driver","resources\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement sliderLink=driver.findElement( By.partialLinkText("Slider") );
        sliderLink.click();

    }


}
