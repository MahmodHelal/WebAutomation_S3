package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dropdown")).click();
        WebElement Dropdown = driver.findElement(By.id("dropdown"));

        Select select = new Select(Dropdown);


        select.selectByVisibleText("Option 1");



        // third assignment for s3 deadline next sunday before session
        /*test Dropdown page according to POM Design Pattern
        * 1- try by text
        * 2- try by index
        * 3- try by value
        * 4- validate option is selected "bonus" access element already selected by contain text validate is selected
        * */





    }
}