package com.qa.utils;

import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class utilities extends ConfigReader{

    public utilities() {
        PageFactory.initElements(driver,this);
    }

    public  void wait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public  void click(By element) {
        wait(element);
        driver.findElement(element).click();

    }

    public  void enterText(By element,String value) {
        wait(element);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(value);
    }

    public  void switchFrames(By element) {
        wait(element);
        driver.switchTo().frame(driver.findElement(element));

    }
    public  void verifyText (By element , String message) {
        wait(element);
        Assert.assertTrue(driver.findElement(element).getText().equals(message));
    }

    public static void takeSnapShot() throws Exception{
        Scenario scenario = null;
        String location = "target/Screenshot";  //location for images
        String methodName = scenario.getName().toString();

       try {
           TakesScreenshot scrShot = ((TakesScreenshot) driver);
           File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(SrcFile, new File(location + methodName + "_" + ".png"));
       } catch (Exception e) {
           e.printStackTrace();
       }

    }
}
