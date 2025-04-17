package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.HighlightElement.highlightElement;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {

    @Given("user insert username")
    public void userInsertUsername() throws InterruptedException {
        navigate(loginPageUrl, driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), "Admin");
    }

    @And("user insert password")
    public void userInsertPassword() throws InterruptedException {
        sendKey(loginPage.getPasswordField(), "admin123");
        isDisplayed(loginPage.getLoginLogo());
        waitUntil(3);

    }

    @When("user clicks on Login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        click(loginPage.getSubmitButton(), 3);

    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() throws InterruptedException {
        waitUntil(3);
        highlightElement(homePage.getDashboardSign());
        Assert.assertEquals("Dashboard", homePage.getDashboardSign().getText());
    }

    @And("user clicks on Log0ut button")
    public void userClickOnLog0utButton() {
        click(homePage.getUserMeniu(), 3);
        highlightElement(homePage.getLog0utButton());
        waitUntil(5);
        click(homePage.getLog0utButton(), 3);
    }

}

