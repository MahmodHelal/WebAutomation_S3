package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    String expectedSuccessMsg = "You logged into a secure area!";
    By actualMsgLocator = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }


    public String getActualSuccessMsg(){
        return driver.findElement(actualMsgLocator).getText();
    }

    public String getExpectedSuccessMsg(){
        return expectedSuccessMsg;
    }
}
