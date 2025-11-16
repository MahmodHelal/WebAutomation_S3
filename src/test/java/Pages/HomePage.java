package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;


    By formLinkLocator = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator =By.linkText("Dropdown");



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




}
