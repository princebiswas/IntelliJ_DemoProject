package process;

import org.openqa.selenium.WebDriver;
import pageobject.RegistrationPage;
import utility.Helper;

public class RegistrationProcess extends Helper {
    RegistrationPage rpa = new RegistrationPage(driver);
    public RegistrationProcess(WebDriver driver) {
        super(driver);

        String FN = Helper.randomString(6);
        System.out.println("First_Name-" + FN);

        String LN = Helper.randomString(5);
        System.out.println("Last_Name-" + LN);

        String MN = Helper.randomNumber(9);
        System.out.println("Phone_Number-" + MN);

        String EM = Helper.randomString(5);
        System.out.println("Email-" + EM);


                rpa.ClickOnMyAccount().click();
        rpa.ClickOnRegister().click();
        rpa.EnterFirstName().sendKeys("FN");
        rpa.EnterLastName().sendKeys("LN");
        rpa.EnterEmail().sendKeys("EM"+"@gmail.com");
        rpa.EnterTelephone().sendKeys("MN");
        rpa.EnterPassword().sendKeys("Abcd1234");
        rpa.EnterConfirmPassword().sendKeys("Abcd1234");
        rpa.ClickOnNewsletterSubscribeYes().click();
        rpa.ClickOnPrivacyPolicyCheckbox().click();
        rpa.ClickOnContinueButton().click();


    }













}
