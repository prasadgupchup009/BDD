package com.qa.stepDefs;

import com.qa.pages.LoginPage;
import com.qa.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class openBrowser extends ConfigReader {

    LoginPage loginPage = new LoginPage();

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
        System.out.println("User See Login page");
    }

    @And("^Browser is closed$")
    public void browserIsClosed() {
        driver.quit();
    }


    }

