package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(strict = true)
@CucumberOptions(
		features="C:/Users/kranthi/workspace/BDDCUCUMBER/src/test/java/Feature/Login.feature",
		glue= {"StepDefination"},
		strict=true,
		dryRun=false,
		monochrome= true
		//format= {"pretty","html:test-outout"}
		
		)


public class TestRunner {

}
