package demostore_x_cart.testsuite;

import demostore_x_cart.loadproperty.LoadProperty;
import demostore_x_cart.pages.LoginPage;
import demostore_x_cart.testbase.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by Yatin
 */
public class LoginTest extends BaseTest {

//LoginPage loginPage = new LoginPage();

@Test
    public void userShouldLoginSuccessfully(){

    LoadProperty loadProperty = new LoadProperty();
    LoginPage loginPage = new LoginPage();
    loginPage.clickOnSignInSignUpLink();
    loginPage.signUpVerification();
    loginPage.clickOnCreateAccountLink();
    loginPage.newAccountVerification();
    loginPage.enterEmail();
    loginPage.passwordField(loadProperty.getProperty("password"));
    loginPage.confirmPwdField(loadProperty.getProperty("confirmPwd"));
    loginPage.clickOnCreate();
    loginPage.createAccountVerification();
    loginPage.clickOnHotDealLink();
    loginPage.clickOnSaleLink();
    loginPage.isSaleVerifyTextIsDisplayed();
    loginPage.clickOnLaceUpBootsLink();
    loginPage.isLaceUpBootVerifyTextIsDisplayed();

}


}
