package HooksPackage;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
 /*       // implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");


    }





    @After
    public void tearDown(){
        driver.quit();
    }

}
