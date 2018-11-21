package com.sparta.jas.seleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverConfig {
    private WebDriver driver;
    private SeleniumProperties seleniumProperties = new SeleniumProperties("C:\\Users\\TECH-W92\\Engineering19\\Week9\\Day3\\CucumberExample\\src\\test\\java\\com\\sparta\\jas\\seleniumConfig\\selenium.properties");

    public SeleniumDriverConfig(String browser) {
        String driverName;

        if (browser.equalsIgnoreCase("firefox")){
            driverName = "gecko";
        } else {
            driverName = browser.toLowerCase();
        }

        System.setProperty("webdriver."+ driverName + ".driver", seleniumProperties.getDriverPath(browser.toLowerCase()));

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
