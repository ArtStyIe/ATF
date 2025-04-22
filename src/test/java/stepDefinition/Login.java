package stepDefinition;

import Util.DataKeys;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import static Actions.Action.*;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HighlightElement.highlightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {

    @Given("user insert username")
    public void userInsertUsername() {
        navigate(loginPageUrl, driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), "Admin");
        saveData(USERNAME, "Admin");
    }

    @And("user insert password")
    public void userInsertPassword() {
        sendKey(loginPage.getPasswordField(), "admin123");
        isDisplayed(loginPage.getLoginLogo());
        waitUntil(3);
        saveData(PASSWORD, "admin123");

    }

    @When("user clicks on Login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        click(loginPage.getSubmitButton(), 3);

    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() {
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

    @And("insert username")
    public void insertUsername() {
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), getData(USERNAME).toString());
    }

    @And("insert password")
    public void insertPassword() {
        waitUntil(3);
        sendKey(loginPage.getPasswordField(), getData(PASSWORD).toString());

    }
}

