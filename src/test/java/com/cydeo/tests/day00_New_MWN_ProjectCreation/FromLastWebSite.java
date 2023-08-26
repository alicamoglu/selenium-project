package com.cydeo.tests.day00_New_MWN_ProjectCreation;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class FromLastWebSite {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-api");

    }
}
