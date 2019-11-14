package demostore_x_cart.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yatin
 */
public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
