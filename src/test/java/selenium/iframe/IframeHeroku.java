package selenium.iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class IframeHeroku{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void iFrameTest(){
        driver.get("https://the-internet.herokuapp.com/");
        WebElement frames=driver.findElement(By.linkText("Frames"));
        frames.click();
        WebElement iframe=driver.findElement(By.linkText("iFrame"));
        iframe.click();
        driver.switchTo().frame("mce_0_ifr");
        WebElement typing=driver.findElement(By.id("tinymce"));
        typing.clear();
        typing.sendKeys("TEchtorial academy");
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement header=driver.findElement(By.tagName("h3"));
        System.out.println(header.getText());



    }
    @Test
    public void nestedIframeTest(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        //switch to first frame
        driver.switchTo().frame("frame-top");
        //switch to second inner frame by index
        driver.switchTo().frame(1);
        WebElement middle=driver.findElement(By.id("content"));
        System.out.println(middle.getText());
        //switch back to parent frame and to right frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //find out number of iframes on the page
//        List< WebElement> iframe=driver.findElements(By.tagName("frame"));
//        System.out.println(iframe.size());

    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();
        WebElement nestedFrames=driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();
        driver.switchTo().frame("frame-top");
        WebElement leftFrame=driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
        driver.switchTo().frame(leftFrame);
        WebElement middleText=driver.findElement(By.id("content"));
        System.out.println(middleText.getText());
        driver.switchTo().defaultContent();
    }
    @Test
    public void test1() {
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        WebElement secondPerson=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(secondPerson);
        WebElement middleText=driver.findElement(By.id("content"));
        System.out.println(middleText.getText());
        //when we use the nested frames, we can use the parentFrame() method to switch to parent frame.
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.tagName("body")).getText());
    }
}
