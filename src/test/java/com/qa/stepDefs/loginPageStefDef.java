package com.qa.stepDefs;

import com.qa.pages.LoginPage;
import com.qa.utils.ConfigReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class loginPageStefDef extends ConfigReader {

    LoginPage loginPage = new LoginPage();
    By element;
    String txt = new String();

    @Given("^The browser is open$")
    public void theBrowserIsOpen() {
        ConfigReader.initialization();
    }

    @When("User logs in")
    public void userLogsIn() {
        loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Then("^user sees login Page$")
    public void userSeesLoginPage() {
        loginPage.verifyLogin();
    }

    @And("^Browser is closed$")
    public void browserIsClosed() {
        driver.quit();
    }


    }

