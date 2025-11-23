package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {
    WebDriver driver;

    By AddButtonLocator = By.xpath("//button[contains(text(),'Add Element')]");
    By deleteButtonLocator = By.xpath("//button[contains(text(),'Delete')]");



    public AddRemovePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddButton(){
        driver.findElement(AddButtonLocator).click();
    }

    public void clickDeleteButton(int count){
        List<WebElement> deleteButtons = driver.findElements(deleteButtonLocator);

        if (count <= deleteButtons.size()){
        for (int i =1 ; i <= count; i++){
            deleteButtons.get(i).click();
        }
        }else {
            System.out.println("Wrong count");
        }


    }




}
