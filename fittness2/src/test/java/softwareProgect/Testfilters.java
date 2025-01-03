package softwareProgect;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testfilters {

	@Given("the client is logged in")
	public void the_client_is_logged_in() {
	    
	}

	@When("the client chooses a {string} as a filter")
	public void the_client_chooses_a_as_a_filter(String string) {
	   
	}

	@Then("the system should display the programs that are for {string}")
	public void the_system_should_display_the_programs_that_are_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
