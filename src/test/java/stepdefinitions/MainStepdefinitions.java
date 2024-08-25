package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStepdefinitions {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Test 1");
	}
//	@When("User login into the application using username {string} and password {string}")
//	public void user_login_into_the_application_using_username_and_password(String usrname, String pswd) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("username is:-"+usrname+" password:-"+pswd);
//	}
	
	@When("^User login into the application using username (.+) and password (.+)$")
	public void user_login_into_the_application_using_username_and_password(String usrname, String pswd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username is:-"+usrname+" password:-"+pswd);
	}
	
	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test 2");
	}
	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test 3");
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test 4");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page..");
	}

	@Then("user enters his credentials")
	public void user_enters_his_credentials(List<String> dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println(dataTable.get(0));
		System.out.println(dataTable.get(1));
		System.out.println(dataTable.get(2));
	}
	
	@Given("launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("browser launched successfully");
	}

	@Then("open the url")
	public void open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("url launched successfully");
	}
	
}
