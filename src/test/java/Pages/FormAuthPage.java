package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {
    WebDriver driver;

    public FormAuthPage(WebDriver driver){
        this.driver = driver;
    }

    By usernameTextboxLocator = By.id("username");
    By passwordTextboxLocator = By.id("password");
    By loginButtonLocator = By.className("radius");

  /*  WebElement usernameTextbox = driver.findElement(By.id("username"));
    WebElement passwordTextbox = driver.findElement(By.id("password"));
    WebElement loginButton = driver.findElement(By.className("radius"));*/

    By actualErrorTextLocator = By.id("flash");
    String expectedUsernameErrorMsg = "Your username is invalid!";
    String expectedPasswordErrorMsg = "Your password is invalid!";




    public void setUsername(String userName){

        driver.findElement(usernameTextboxLocator).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordTextboxLocator).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
        return new SecureAreaPage(driver);
    }

    public String getActualErrorMessage(){
       return driver.findElement(actualErrorTextLocator).getText();
    }

    public String getExpectedUsernameErrorMessage(){
        return expectedUsernameErrorMsg;
    }

    public String getExpectedPasswordErrorMessage(){
        return expectedPasswordErrorMsg;
    }


}
