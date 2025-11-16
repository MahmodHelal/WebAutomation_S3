package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTestClass {

    @Test
    public void verifyCheckboxOneIsSelected(){

        checkboxPage=homePage.clickCheckboxLink();

        Assert.assertFalse(checkboxPage.checkboxOneIsSelected());

        checkboxPage.clickCheckBoxOne();

        Assert.assertTrue(checkboxPage.checkboxOneIsSelected());


    }


    // second assignment for s3 deadline next friday
    /*
    * 1- write a test to verify that checkbox one is selected
    * 2- write a test to verify that checkbox two is selected
    * According to POM pattern
    * */
}
