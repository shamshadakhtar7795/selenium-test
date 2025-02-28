package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class baseClass {

    PropertyFiles pf=new PropertyFiles();
   public WebDriver driver;

@BeforeClass
    public void browserConfig() throws IOException {
String browserName=pf.readcConfigFile("browser");
String url=pf.readcConfigFile("url");


if(browserName.equalsIgnoreCase("edge"))

{  driver=new EdgeDriver();

System.out.println("Browser Launched ");
driver.get(url);

    } else if (browserName.equalsIgnoreCase("chrome")) {


  driver=new ChromeDriver();
    System.out.println("Browser Launched ");
    driver.get(url);
    }

}


    }
