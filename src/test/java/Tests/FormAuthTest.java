package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends  BaseTestClass{


    @Test
    public void verifyFormAuthPageWithValidCredentials(){

        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUsername("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
        secureAreaPage=formAuthPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getActualSuccessMsg().contains(secureAreaPage.getExpectedSuccessMsg()));
    }

// Assignment For s3
    /*
    * 1- validate wrong password
    * 2- validate wrong username
    * 3- validate wrong password and username
    * */

}
