package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Commands.feature",glue= "Steps", plugin ={"html:TEST/report5.html",}, 
			 
	dryRun=false, monochrome=true,tags="@default",publish=true)

public class Runner_Class {


}



 