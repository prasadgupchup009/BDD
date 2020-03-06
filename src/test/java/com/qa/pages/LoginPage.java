package com.qa.pages;

import com.qa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends ConfigReader {

    private By userName = By.name("userName");

    private By passWord = By.name("password");

    private By loginBtn = By.xpath("//input[@value='Login']");

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void logIn (String un , String password) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
        driver.findElement(userName).sendKeys(un);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}
