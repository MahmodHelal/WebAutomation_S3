package StepDefinitions;

import BaseTest.BaseTestClass;
import HooksPackage.Hooks;
import Pages.FormAuthPage;
import Pages.HomePage;
import Pages.SecureAreaPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class Login_stepDef  {


    HomePage homePage = new HomePage(Hooks.driver);
    FormAuthPage formAuthPage;
    SecureAreaPage secureAreaPage;

    @Given("user is on Login Page")
    public void userIsOnLoginPage(){
        formAuthPage = homePage.clickFormLink();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
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



    @When("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) throws InterruptedException {
        formAuthPage.setUsername(username);
        formAuthPage.setPassword(password);


    }

    @Then("Validate Message According To {string}")
    public void validateMessageAccordingTo(String validation) {
        if (validation.trim().equals("valid")){
            Assert.assertTrue(secureAreaPage.getActualSuccessMsg().contains(secureAreaPage.getExpectedSuccessMsg()));
        }else if (validation.trim().equals("invalidPassword")){
            Assert.assertTrue(formAuthPage.getActualErrorMessage().contains(formAuthPage.getExpectedPasswordErrorMessage()));
        }else if (validation.trim().equals("invalidUsername")){
            Assert.assertTrue(formAuthPage.getActualErrorMessage().contains(formAuthPage.getExpectedUsernameErrorMessage()));
        }else {
            Assert.fail("unexpected Result");
        }
    }

}
