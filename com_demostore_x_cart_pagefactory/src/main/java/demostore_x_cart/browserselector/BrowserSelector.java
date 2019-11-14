package demostore_x_cart.browserselector;

import demostore_x_cart.loadproperty.LoadProperty;
import demostore_x_cart.util.Util;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yatin
 */
public class BrowserSelector extends Util {
    String baseUrl = new LoadProperty().getProperty("baseUrl");
    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.geckodriver.driver", projectPath + "drivers/geckodriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } else {
            System.out.println("Wrong browser selected");
        }
    }


}
