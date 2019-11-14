package demostore_x_cart.pages;

import demostore_x_cart.util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yatin
 */
public class LoginPage extends Util {
    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _signInSignUpLink;

    @FindBy(id = "ui-id-3")
    WebElement _signInText;

    @FindBy(xpath = "//a[contains(@class,'popup-button default-popup-button create-account-link')]")
    WebElement _createAccountLink;

    @FindBy(id = "ui-id-6")
    WebElement _newAccountText;

    @FindBy(id = "login")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _passwordField;

    @FindBy(id = "password-conf")
    WebElement _confirmPwdField;

    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement _createButton;

    @FindBy(id = "page-title")
    WebElement _createAccountVerify;

    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]")
    WebElement _hotDealLink;

    @FindBy(xpath = "//li[@class='leaf has-sub']//span[contains(text(),'Sale')]")
    WebElement _saleLink;

    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _saleVerifyText;

    @FindBy(xpath = "//a[contains(text(),'Lace-Up Boots in Light Brown')]")
    WebElement _laceUpBootsLink;

    @FindBy(xpath = "//h1[@class='fn title']")
    WebElement _laceUpBootVerifyText;

    public boolean isLaceUpBootVerifyTextIsDisplayed() {
        verifyThatElementIsDisplayed(_laceUpBootVerifyText);
        return true;
    }

    public void clickOnLaceUpBootsLink() {
        clickOnElement(_laceUpBootsLink);
    }

    public boolean isSaleVerifyTextIsDisplayed() {
        verifyThatElementIsDisplayed(_saleVerifyText);
        return true;
    }

    public void clickOnSaleLink() {
        clickOnElement(_saleLink);
    }
    public void clickOnHotDealLink() {
        clickOnElement(_hotDealLink);
    }
    public void clickOnSignInSignUpLink() {
        clickOnElement(_signInSignUpLink);
    }
    public boolean signUpVerification() {
        verifyThatElementIsDisplayed(_signInText);
        return true;
    }
    public void clickOnCreateAccountLink() {
        clickOnElement(_createAccountLink);
    }
    public boolean newAccountVerification() {
        verifyThatElementIsDisplayed(_newAccountText);
        return true;
    }

    public void enterEmail() {
        sendTextToElement(_emailField, "andy" + generateRandomNumber() + "@mail.com");
    }

    public void passwordField(String password) {

        sendTextToElement(_passwordField, password);
    }

    public void confirmPwdField(String confirmpwd) {

        sendTextToElement(_confirmPwdField, confirmpwd);
    }

    public void clickOnCreate() {
        clickOnElement(_createButton);
    }

    public boolean createAccountVerification() {
        verifyThatElementIsDisplayed(_createAccountVerify);
        return true;
    }


}
