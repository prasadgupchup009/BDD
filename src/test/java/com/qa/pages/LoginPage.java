package com.qa.pages;

import com.qa.utils.ConfigReader;
import com.qa.utils.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ConfigReader {

    utilities util = new utilities();
    private By userName = By.name("userName");

    private By passWord = By.name("password");

    private By loginBtn = By.xpath("//input[@value='Login']");

    private By loginTxt = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[1]/font");

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void logIn (String un , String password) {
          util.enterText(userName,un);
          util.enterText(passWord,password);
          util.click(loginBtn);
    }

    public void verifyLogin() {
        util.verifyText(loginTxt,"Passengers:");

    }
}
