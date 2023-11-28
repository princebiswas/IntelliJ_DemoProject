package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Helper;

public class RegistrationPage extends Helper {
    public WebElement element = null ;
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement ClickOnMyAccount () {
        element = getElementByXpath("//span[text()='My Account']");
        return element;
    }

    public WebElement ClickOnRegister(){
        element= getElementByXpath("//a[text()='Register']");
        return element;

    }

    public WebElement EnterFirstName(){
        element= getElementByName("firstname");
        return element;

    }

    public WebElement EnterLastName(){
        element= getElementByName("lastname");
        return element;

    }

    public WebElement EnterEmail(){
        element= getElementByName("email");
        return element;

    }
    public WebElement EnterTelephone(){
        element= getElementByName("telephone");
        return element;

    }
    public WebElement EnterPassword(){
        element= getElementByName("password");
        return element;

    }
    public WebElement EnterConfirmPassword(){
        element= getElementByName("confirm");
        return element;

    }
    public WebElement ClickOnNewsletterSubscribeYes(){
        element= getElementByName("newsletter");
        return element;

    }
    public WebElement ClickOnPrivacyPolicyCheckbox(){
        element= getElementByName("agree");
        return element;

    }
    public WebElement ClickOnContinueButton(){
        element= getElementByXpath("//input[@type='submit']");
        return element;

    }




}
