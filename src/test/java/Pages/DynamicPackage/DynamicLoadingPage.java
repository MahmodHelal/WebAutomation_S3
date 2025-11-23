package Pages.DynamicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;


    By exampleOneLocator = By.linkText("Example 1: Element on page that is hidden");

    By exampleTwoLocator = By.partialLinkText("Example 2:");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }


     public  Example1 clickOnExampleOne(){
        driver.findElement(exampleOneLocator).click();
        return new Example1(driver);
     }

     public Example2 clickOnExampleTwo(){
        driver.findElement(exampleTwoLocator).click();
        return new Example2(driver);
     }
}
