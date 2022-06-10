package com.tsi.amirzan.project;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features = "src/test/resources/Cucumber",
glue = "com.tsi.amirzan.project")
public class runCucumberTest {


}


