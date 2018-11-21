package com.sparta.jas.bbcSite.bbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomepage {
    private WebDriver driver;
    private String homepageURL = "https://www.bbc.co.uk/";
    private By signInLinkID = By.id("idcta-link");

    public BbcHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomepage(){
        driver.navigate().to(homepageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInLinkID).click();
    }
}
