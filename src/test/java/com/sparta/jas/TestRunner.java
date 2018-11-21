package com.sparta.jas;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:src\\reports"},
        features = {"C:\\Users\\TECH-W92\\Engineering19\\Week9\\Day3\\CucumberExample\\src\\test\\resources\\features\\login.feature"},
        glue = {"step_defs"},
        tags = {"@test"}
)

public class TestRunner {
}
