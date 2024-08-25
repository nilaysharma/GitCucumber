package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@RegressionTest")
	public void chooseBrowser() {
		System.out.println("choose the browser to launch.");
	}
	
	public void TestcaseId() {
		System.out.println("get the testCase ID..");
	}
	
	@After
	public void closeBrowser() {
		System.out.println("browser closed successfully..");
	}
	
}
