package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin= {"html:target/html.cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
				tags = {"@U_Login"},
		//				tags = {"@Sanity"}, //to run for single tag
//		tags= {"@Sanity or @Regression"} // to for multiple tag using OR
//		tags = {"@Sanity, @RegressionTest"},// to for multiple tag
//				tags = {"@RegressionTest, @Rapid"},//for using comma
//				tags = {"@RegressionTest and @Rapid"},//to for multiple tag using AND, IT IS the case when 1000secnario is present
//						tags= {"@Sanity or (@Regression and @Rapid)"},
//		tags = {"@Sanity or @Regression and @Rapid"},
//				tags= {"not @Sanity"},	//EXCEPT SANITY RUN ALL using not/~@Sanity
						
//				tags={"@Ignore"},//@WIP--Work In Progress
				glue = {"stepDefs"}
		
		)
public class TestRunner {

	
	
}
