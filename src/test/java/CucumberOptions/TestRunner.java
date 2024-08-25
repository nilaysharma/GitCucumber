package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepdefinitions",monochrome=true,dryRun=true,
tags="@RegressionTest",plugin={"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
//in glue field we don't need to give the whole it will automatically find the stepdefinitons
public class TestRunner extends AbstractTestNGCucumberTests{

}
