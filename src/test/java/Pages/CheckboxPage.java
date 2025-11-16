package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;

    By checkBoxOneLocator = By.xpath("//input[@type='checkbox'][1]");
    By checkBoxTwoLocator = By.xpath("//input[@type='checkbox'][2]");

    public CheckboxPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCheckBoxOne(){
        driver.findElement(checkBoxOneLocator).click();
    }

    public void clickCheckBoxTwo(){
        driver.findElement(checkBoxTwoLocator).click();
    }

    public boolean checkboxOneIsSelected(){
        return driver.findElement(checkBoxOneLocator).isSelected();
    }

    public boolean checkboxTwoIsSelected(){
        return driver.findElement(checkBoxTwoLocator).isSelected();
    }



}
