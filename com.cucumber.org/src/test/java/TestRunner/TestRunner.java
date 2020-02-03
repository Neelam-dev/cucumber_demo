package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features="D:\\VnextScript\\com.cucumber.org\\src\\test\\java\\Features\\Login1.feature",
		glue={"StepDefination"},
		monochrome=true,
		dryRun=false,
		tags= {"@demo1,@demo2"}
		
	
	
	

		
		)

public class TestRunner {
	
	

}
