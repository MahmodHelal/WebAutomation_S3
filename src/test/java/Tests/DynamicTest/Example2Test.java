package Tests.DynamicTest;

import BaseTest.BaseTestClass;
import Pages.DynamicPackage.Example2;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Example2Test extends BaseTestClass {
    Example2 example2;

    @Test
    public void validateExample2Page(){
        dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        example2 = dynamicLoadingPage.clickOnExampleTwo();
        example2.clickOnStartButton();


        Assert.assertEquals(example2.getActualResult(),example2.getExpectedResult(), "Actual result does not match expected result From Example2");
    }
}
