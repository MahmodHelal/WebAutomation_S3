package StepDefinitions;

import HooksPackage.Hooks;
import Pages.AlertsPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Alerts_StepDef {
    HomePage homePage = new HomePage(Hooks.driver);
    AlertsPage alertsPage;

    @Given("user on AlertsPage")
    public void userOnAlertsPage() {
        alertsPage=homePage.clickAlertsLink();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://the-internet.herokuapp.com/javascript_alerts");
    }

    @When("user click on JS Alert")
    public void userClickOnJSAlert() {
        alertsPage.clickOnJsAlert();
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsAlert());
    }


    @And("user submit alert")
    public void userSubmitAlert() {
        alertsPage.acceptAlert();
    }

    @Then("user should see Result Text")
    public void userShouldSeeResultText() {
        Assert.assertEquals(alertsPage.getActualResult(),alertsPage.getExpectedResultOfJsAlert());
    }
}
