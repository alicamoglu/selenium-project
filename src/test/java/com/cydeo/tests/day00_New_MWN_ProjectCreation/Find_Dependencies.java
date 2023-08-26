package com.cydeo.tests.day00_New_MWN_ProjectCreation;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.*;

public class Find_Dependencies {
    public static void main(String[] args) throws InterruptedException {
        //search in google "mvnrepository"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().setPosition(new Point(1190,3));
        driver.manage().window().setSize(new Dimension(700,1468));

        driver.get("https://google.com");
//        driver.findElement(By.cssSelector("div[class='tHlp8d']")).click();
        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
//        searchBox.sendKeys("mvnrepository" + Keys.ENTER);           // without sleep enter goes to nextline in searchbox and
        searchBox.sendKeys("mvnrepository");
        Thread.sleep(1000);
        searchBox.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("a[href='https://mvnrepository.com/']")).click();

        WebElement searchInMVNRepository = driver.findElement(By.name("q"));
        searchInMVNRepository.sendKeys("selenium webdriver");
//        Thread.sleep(500);                  // without sleep it has human control check
//        searchInMVNRepository.sendKeys(Keys.ENTER);
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();


    }
}
