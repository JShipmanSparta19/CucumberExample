package com.sparta.jas.seleniumConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumProperties {
    private Properties seleniumProperties;
    private String driverPath;
    private long implicitWaitTime;

    public SeleniumProperties(String propertiesPath){
        seleniumProperties = new Properties();
        try {
            seleniumProperties.load(new FileReader(propertiesPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        implicitWaitTime = Long.parseLong(seleniumProperties.getProperty("implicitWaitTime"));
    }

    public String getDriverPath(String browser) {
        driverPath = seleniumProperties.getProperty(browser.toLowerCase() + "DriverPath");
        return driverPath;
    }

    public long getImplicitWaitTime() {
        return implicitWaitTime;
    }
}
