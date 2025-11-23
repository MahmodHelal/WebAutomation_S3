package Tests;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTestClass {

    @Test
    public void validateOption1IsSelected() throws InterruptedException {
       dropdownPage= homePage.clickDropdownLink();
       dropdownPage.selectOptionOne();
       dropdownPage.elementIsSelected("Option 1");
       Thread.sleep(2000);

    }

    @Test
    public void validateOption2IsSelected(){
        dropdownPage= homePage.clickDropdownLink();
        dropdownPage.selectOptionTwo();
        dropdownPage.elementIsSelected("Option 2");

    }
}
