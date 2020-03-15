package com.eugene.tests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/eugene/resources"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json"}
)
public class RunTest {
}
