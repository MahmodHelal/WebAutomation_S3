package Pages.DynamicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1 {
    WebDriver driver;
    By startButtonLocator = By.cssSelector("#start > button");
    By resultLocator = By.cssSelector("#finish h4");
    String expectedResult = "Hello World!";
    WebDriverWait wait;

    public Example1(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public void clickOnStartButton(){


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(startButtonLocator))).click();
    }

    public String getActualResult(){
        //explicit wait

        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(resultLocator))).getText();
//        return wait.until(ExpectedConditions.presenceOfElementLocated(resultLocator)).getText();



    }

    public  String getExpectedResult(){
        return expectedResult;
    }


}
