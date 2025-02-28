package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFiles {

    public String readcConfigFile(String key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\shams\\AutomationFramework_E2\\gitPractice\\practiceMonday\\src\\test\\resources\\config.properties");
        Properties prop= new Properties();
        prop.load(fis);
   String keyValue=     prop.getProperty(key);
   return keyValue;
    }
}
