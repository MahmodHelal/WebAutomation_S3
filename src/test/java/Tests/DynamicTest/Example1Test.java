package Tests.DynamicTest;

import BaseTest.BaseTestClass;
import Pages.DynamicPackage.Example1;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Example1Test extends BaseTestClass {
    Example1 example1;

    @Test
    public void validateExample1Page(){
        dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        example1 = dynamicLoadingPage.clickOnExampleOne();
        example1.clickOnStartButton();


        Assert.assertEquals(example1.getActualResult(),example1.getExpectedResult(), "Actual result does not match expected result From Example1");
    }
}
