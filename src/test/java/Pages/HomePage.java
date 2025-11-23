package Pages;

import Pages.DynamicPackage.DynamicLoadingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;


    By formLinkLocator = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator =By.linkText("Dropdown");

    By addRemoveElementsLocator = By.linkText("Add/Remove Elements");
    By dynamicLoadingLocator = By.linkText("Dynamic Loading");

    By alertsLocator = By.linkText("JavaScript Alerts");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }



    public FormAuthPage clickFormLink(){
        driver.findElement(formLinkLocator).click();
        return new FormAuthPage(driver);
    }


    public CheckboxPage clickCheckboxLink(){
        driver.findElement(checkBoxLocator).click();
        return new CheckboxPage(driver);
    }


    public DropdownPage clickDropdownLink(){
        driver.findElement(dropDownLocator).click();
        return new DropdownPage(driver);
    }


    public AddRemovePage clickAddRemoveElementsLink(){
        driver.findElement(addRemoveElementsLocator).click();
        return new AddRemovePage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLocator).click();
        return new DynamicLoadingPage(driver);
    }

    public AlertsPage clickAlertsLink(){
        driver.findElement(alertsLocator).click();
        return new AlertsPage(driver);
    }







}
