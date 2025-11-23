package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTestClass {

    @Test
    public void validateAlertsPage() throws InterruptedException {
        alertsPage = homePage.clickAlertsLink();
        alertsPage.clickOnJsAlert();
        Thread.sleep(2000);
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsAlert());

        alertsPage.acceptAlert();
        Assert.assertTrue(alertsPage.getActualResult().contains(alertsPage.getExpectedResultOfJsAlert()));


        alertsPage.clickOnJsConfirm();
        Thread.sleep(2000);
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsConfirm());

        alertsPage.dismissAlert();
        Assert.assertTrue(alertsPage.getActualResult().contains(alertsPage.getExpectedResultOfJsCancel()));

        alertsPage.clickOnJsPrompt();
        Thread.sleep(2000);
        Assert.assertEquals(alertsPage.getActualAlertText(),alertsPage.getExpectedTextOfJsPrompt());
        Thread.sleep(2000);
        alertsPage.sendTextToAlert("Hello Helal");
        Thread.sleep(2000);
        Assert.assertTrue(alertsPage.getActualResult().contains("Hello Helal"));
    }
}
