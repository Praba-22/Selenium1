package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/prabakaren.j/git/Selenium-Java/Automation_StepByStep/Feature",glue= "steps", 
dryRun=false, monochrome=true)
public class Runner_class {
 
	
}

