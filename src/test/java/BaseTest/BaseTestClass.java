package BaseTest;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
    protected  WebDriver driver;
    protected HomePage homePage ;
    protected FormAuthPage formAuthPage;
    protected SecureAreaPage secureAreaPage;
    protected CheckboxPage checkboxPage;
    protected DropdownPage dropdownPage;
    protected AddRemovePage addRemovePage;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
    }

/*    @AfterClass
    public void tearDown(){
        driver.quit();
    }*/

}
