package demostore_x_cart.testbase;

import demostore_x_cart.basepage.BasePage;
import demostore_x_cart.browserselector.BrowserSelector;
import demostore_x_cart.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Yatin
 */
public class BaseTest extends BasePage {

String browser = new LoadProperty().getProperty("browser");
BrowserSelector browserSelector = new BrowserSelector();

@BeforeMethod
    public void setUp(){
    browserSelector.selectBrowser(browser);
    }
@AfterMethod
    public void tearDown(){
    driver.quit();
}




}
