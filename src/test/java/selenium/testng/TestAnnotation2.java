package selenium.testng;

import org.testng.annotations.Test;

public class TestAnnotation2{
    @Test(expectedExceptions=RuntimeException.class)
    public void test6(){
        System.out.println("test6");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods="test6")
    public void test7(){
        System.out.println("test 7");
    }
}
