package com.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static WebDriver driver;
    public static Properties prop;

    public ConfigReader() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/java/com/qa/config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.getMessage();
        }
    }
    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","browser/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","browser/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }


    public static void closeBrowse() {
        driver.quit();
    }
}
