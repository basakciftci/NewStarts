package selenium.properties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIntro{
    @Test
    public void testProperties() throws IOException{
        File propertiesFile=new File("src/test/resources/configurations.properties");
        Properties properties=new Properties();
        properties.load(new FileInputStream(propertiesFile));
       String url= properties.getProperty("url");
        System.out.println(url);

        String username=properties.getProperty("username");
        System.out.println(username);



    }
    @Test
    public void test1() throws IOException{
        File test1=new File("src/test/resources/credentials.properties");
        Properties properties=new Properties();
        properties.load(new FileInputStream(test1));
        String environment=properties.getProperty("environment");

    }

}
