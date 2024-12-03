package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\Sk_sathish\\eclipse-workspace\\nationalinsurance\\src\\test\\resources\\Aboutus.feature" ,
	           tags="@Tags",
	           glue="StepDefinition",
	           dryRun=false,
	           plugin = {"html:target/html","json:target/report.json"}
	          
			)
public class testrunner {

	} 


