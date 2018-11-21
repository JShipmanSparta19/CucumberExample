package com.sparta.jas.bbcSite.bbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcLoginPage {
    private WebDriver driver;
    private String loginUrl = "https://account.bbc.com/signin";

    private By usernameID = By.id("user-identifier-input");
    private By passwordID = By.id("password-input");
    private By submitID = By.id("submit-button");
    private By incorrectPasswordErrorId = By.id("form-message-password");

    public BbcLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.navigate().to(loginUrl);
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void typeUsername(String name){
        driver.findElement(usernameID).sendKeys(name);
    }

    public void typePassword(String password){
        driver.findElement(passwordID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitID).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorId).getText();
    }
}
