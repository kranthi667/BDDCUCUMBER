package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:/Users/kranthi/workspace/BDDCUCUMBER/src/test/java/Feature/Tags.feature",
	    extraGlue= {"StepDefination"},
		strict=true,
		dryRun=false,
		monochrome= true,
		tags= {"@SmokeTest","@RegressionTest"}
		//format= {"pretty","html:test-outout"}
		
		)


public class TestRunner {

}
