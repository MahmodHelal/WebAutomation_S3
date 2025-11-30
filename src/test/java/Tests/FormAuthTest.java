package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FormAuthTest extends  BaseTestClass{

    @DataProvider(name = "LoginData")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"tomsmith","SuperSecretPassword!"},
                {"invalid","SuperSecretPassword!"},
                {"tomsmith","invalid"},
                {"invalid","invalid"},
        };
    }


    @Test(dataProvider ="LoginData")
    public void verifyFormAuthPageWithValidCredentials(String username,String password){

        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUsername(username);
        formAuthPage.setPassword(password);
        secureAreaPage=formAuthPage.clickLoginButton();
//        Assert.assertTrue(secureAreaPage.getActualSuccessMsg().contains(secureAreaPage.getExpectedSuccessMsg()));
    }

// Assignment For s3
    /*
    * 1- validate wrong password
    * 2- validate wrong username
    * 3- validate wrong password and username
    * */

}
