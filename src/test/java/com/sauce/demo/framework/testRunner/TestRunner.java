package com.sauce.demo.framework.testRunner;

import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/resources/featureFiles" ,
        glue = { "com/sauce/demo/framework/stepDefinitions", "com/sauce/demo/framework/pageObjects"},
        plugin = "pretty",
        monochrome = true)
public class TestRunner {

}








