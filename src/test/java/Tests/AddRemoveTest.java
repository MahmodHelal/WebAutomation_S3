package Tests;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTestClass {
    @Test
    public void validateAddRemoveElements(){

        addRemovePage =homePage.clickAddRemoveElementsLink();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();
        addRemovePage.clickAddButton();



        addRemovePage.clickDeleteButton(3);






    }
}
