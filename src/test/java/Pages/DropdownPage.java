package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }

    public void selectOptionOne(){
        driver.findElement(By.xpath("//option[contains(text(),'Option 1')]")).click();
    }

    public void selectOptionTwo(){
        driver.findElement(By.xpath("//option[contains(text(),'Option 2')]")).click();
    }


    public boolean elementIsSelected(String Option){
       return driver.findElement(By.xpath("//option[contains(text(),'"+Option+"')]")).isSelected();

    }


}
