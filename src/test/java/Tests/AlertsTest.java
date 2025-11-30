package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertsTest extends BaseTestClass {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void validateAlertsPage() throws InterruptedException {

        alertsPage = homePage.clickAlertsLink();
        alertsPage.clickOnJsAlert();
        //
        softAssert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsAlert());

        alertsPage.acceptAlert();
        Assert.assertTrue(alertsPage.getActualResult().contains(alertsPage.getExpectedResultOfJsAlert()));


        alertsPage.clickOnJsConfirm();
        //
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsConfirm());

        alertsPage.dismissAlert();
        Assert.assertTrue(alertsPage.getActualResult().contains(alertsPage.getExpectedResultOfJsCancel()));

        alertsPage.clickOnJsPrompt();
        //
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsPrompt());
        //
        alertsPage.sendTextToAlert("Hello Helal");
        //
        Assert.assertTrue(alertsPage.getActualResult().contains("Hello Helal"));
        softAssert.assertAll();
    }
}
