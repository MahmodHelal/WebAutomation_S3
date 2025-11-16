package Tests;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTestClass {

    @Test
    public void validateOption1IsSelected(){
       dropdownPage= homePage.clickDropdownLink();
       dropdownPage.selectOptionOne();
       dropdownPage.elementIsSelected("Option 1");

    }

    @Test
    public void validateOption2IsSelected(){
        dropdownPage= homePage.clickDropdownLink();
        dropdownPage.selectOptionTwo();
        dropdownPage.elementIsSelected("Option 2");

    }
}
