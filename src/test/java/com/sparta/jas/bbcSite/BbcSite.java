package com.sparta.jas.bbcSite;

import com.sparta.jas.bbcSite.bbcPages.BbcHomepage;
import com.sparta.jas.bbcSite.bbcPages.BbcLoginPage;
import org.openqa.selenium.WebDriver;

public class BbcSite {
    private WebDriver driver;
    private BbcHomepage bbcHomepage;
    private BbcLoginPage bbcLoginPage;

    public BbcSite(WebDriver driver) {
        this.driver = driver;
        bbcHomepage = new BbcHomepage(driver);
        bbcLoginPage = new BbcLoginPage(driver);
    }

    public BbcHomepage getBbcHomepage() {
        return bbcHomepage;
    }

    public BbcLoginPage getBbcLoginPage() {
        return bbcLoginPage;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }
}
