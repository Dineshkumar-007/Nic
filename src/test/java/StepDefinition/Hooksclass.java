package StepDefinition;

import Baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooksclass {
	BaseClass base = new BaseClass();
	@Before
	public void browserlaunch(Scenario scenario) {
		base.browserLaunch();
		
	}
	@After
	public void browserclose(Scenario scenario) throws InterruptedException {
		System.out.println("Completed");
		
		Thread.sleep(5000);
		base.browserQuit();

}}
