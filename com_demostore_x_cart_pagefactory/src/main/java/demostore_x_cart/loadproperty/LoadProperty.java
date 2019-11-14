package demostore_x_cart.loadproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Yatin
 */
public class LoadProperty {

    static Properties prop;
    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {

        prop = new Properties();
        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\demostore_x_cart\\resources\\propertiesfile\\config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }


}
