package com.demo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.demo.steps",
        monochrome = true,
        strict = true,
       // dryRun=true,
        plugin = {"pretty", "html:target/report"},
        tags= {"@WindowPopUp"}
        )
public class CucumberRunner {

}
