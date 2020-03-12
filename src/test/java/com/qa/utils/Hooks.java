package com.qa.utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeScenario(Scenario name){
        System.out.println("***************** Before Hooks ");
        ConfigReader.initialization();
    }

    @After
    public void afterScenarioFinish(Scenario name){
        System.out.println("***************** After Hooks ");
        ConfigReader.closeBrowse();
    }

    @AfterStep
    public void takeScreenshot() throws Exception {
        utilities.takeSnapShot();
    }


}

