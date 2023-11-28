package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import process.RegistrationProcess;

import static steps.Hooks.driver;


public class Registration_Steps  {
    RegistrationProcess rpr;



    @Given("User navigates to Register account page")
    public void userNavigatesToRegisterAccountPage() {

    }

    @When("User enters First Name in First Name text box")
    public void userEntersFirstNameInFirstNameTextBox() {
        rpr = new RegistrationProcess(driver);

    }

    @And("User enters last name in Last name text box")
    public void userEntersLastNameInLastNameTextBox() {
    }

    @And("User enters email in email text box")
    public void userEntersEmailInEmailTextBox() {
    }

    @And("User enters telephone number in telephone text box")
    public void userEntersTelephoneNumberInTelephoneTextBox() {
    }

    @And("User enters password {string} in Password text box")
    public void userEntersPasswordInPasswordTextBox(String arg0) {
    }

    @And("User enters confirm Password {string} in Password confirm text box")
    public void userEntersConfirmPasswordInPasswordConfirmTextBox(String arg0) {
    }

    @And("User clicks on Privacy Policy  check box")
    public void userClicksOnPrivacyPolicyCheckBox() {
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
    }

    @Then("User should create account successfully")
    public void userShouldCreateAccountSuccessfully() {
    }

    @And("User selects Yes for Newsletter")
    public void userSelectsYesForNewsletter() {
    }

    @When("User do not enter any info in any fields")
    public void userDoNotEnterAnyInfoInAnyFields() {
    }

    @Then("Warning message will be displayed for all mandatory fields")
    public void warningMessageWillBeDisplayedForAllMandatoryFields() {
    }

    @And("User enters email {string} in email text box")
    public void userEntersEmailInEmailTextBox(String arg0) {
    }

    @Then("Warning message will display for duplicate email")
    public void warningMessageWillDisplayForDuplicateEmail() {
    }
}
