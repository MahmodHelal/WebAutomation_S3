package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;

    By jsAlert = By.xpath("//button[@onclick=\"jsAlert()\"]");
    By jsConfirm = By.xpath("//button[@onclick=\"jsConfirm()\"]");
    By jsPrompt = By.xpath("//button[@onclick=\"jsPrompt()\"]");
    By resultTextLocator = By.id("result");
    String expectedTextOfJsAlert = "I am a JS Alert";
    String expectedTextOfJsConfirm = "I am a JS Confirm";
    String expectedTextOfJsPrompt = "I am a JS prompt";
    String expectedResultOfJsCancel = "You clicked: Cancel";

    public String getExpectedTextOfJsConfirm() {
        return expectedTextOfJsConfirm;
    }

    public String getExpectedTextOfJsPrompt() {
        return expectedTextOfJsPrompt;
    }

    public String getExpectedResultOfJsCancel() {
        return expectedResultOfJsCancel;
    }

    String expectedResultOfJsAlert = "You successfully clicked an alert";





    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public Alert switchAlert(){
        return driver.switchTo().alert();

    }
    public void clickOnJsAlert(){
        driver.findElement(jsAlert).click();
    }
    public void clickOnJsConfirm(){
        driver.findElement(jsConfirm).click();
    }
    public void clickOnJsPrompt(){
        driver.findElement(jsPrompt).click();
    }

    public void acceptAlert(){
        switchAlert().accept();
    }

    public  void dismissAlert(){
        switchAlert().dismiss();
    }

    public void sendTextToAlert(String text){
        switchAlert().sendKeys(text);
        switchAlert().accept();
    }

    public String getActualResult(){
        return  driver.findElement(resultTextLocator).getText();
    }


    public String getActualAlertText(){
        return switchAlert().getText();
    }

    public String getExpectedResultOfJsAlert() {
        return expectedResultOfJsAlert;
    }

    public String getExpectedTextOfJsAlert() {
        return expectedTextOfJsAlert;
    }



}
