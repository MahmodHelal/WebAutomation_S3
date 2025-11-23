package StepDefinitions;

import HooksPackage.Hooks;
import Pages.FormAuthPage;
import Pages.HomePage;
import Pages.SecureAreaPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static HooksPackage.Hooks.driver;

public class Login_stepDef {
    HomePage homePage= new HomePage(driver);
    FormAuthPage formAuthPage;
    SecureAreaPage secureAreaPage;

    @Given("user is on Login Page")
    public void userIsOnLoginPage(){
        formAuthPage = homePage.clickFormLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }

    @When("user enter valid credentials")
    public void userEnterValidCredentials() {
        formAuthPage.setUsername("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        secureAreaPage= formAuthPage.clickLoginButton();
    }

    @Then("user should be redirected to secure area page")
    public void userShouldBeRedirectedToSecureAreaPage() {

        Assert.assertTrue(secureAreaPage.getActualSuccessMsg().contains(secureAreaPage.getExpectedSuccessMsg()));

    }
}
