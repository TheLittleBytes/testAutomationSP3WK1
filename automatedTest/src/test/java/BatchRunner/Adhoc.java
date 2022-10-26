package BatchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "Features",
		glue = "BatchRunner",
		plugin = {"pretty", "html:test-output"},
		tags = "@smokeTest"
		
	
		
		)
public class Adhoc {

}
