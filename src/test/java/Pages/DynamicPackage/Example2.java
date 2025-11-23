package Pages.DynamicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2 {
    WebDriver driver;
    By startButtonLocator = By.xpath("//div[@id='start']/button");
    By resultLocator = By.xpath("//div[@id='finish']/h4");
    String expectedResult = "Hello World!";
    WebDriverWait wait;

    public Example2(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public void clickOnStartButton(){
        driver.findElement(startButtonLocator).click();
    }

    public String getActualResult(){
//        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(resultLocator))).getText();

        return wait.until(ExpectedConditions.presenceOfElementLocated(resultLocator)).getText();
    }

    public  String getExpectedResult(){
        return expectedResult;
    }


    // Assignment for s3 deadline next saturday
    /*1- test dynamic loading page using explicit and implicit waits
    2- use Example One Page and Example Two Page
    * */



}
