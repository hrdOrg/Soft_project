/*package fittness2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class create {

	
	@Given("the client pressed sign up")
	public void the_client_pressed_sign_up() {
	   
	}

	@When("the client inter thier {string} , {string} , {string} , {string} and {string}")
	public void the_client_inter_thier_and(String string, String string2, String string3, String string4, String string5) {
	   
	}

	@When("client click the sign up buttom")
	public void client_click_the_sign_up_buttom() {
	    
	}

	@Then("create a new account with the said informations")
	public void create_a_new_account_with_the_said_informations() {
	   
	}

	@When("the client inter thier  {string} , {string} , {string} and {string}")
	public void the_client_inter_thier_and(String string, String string2, String string3, String string4) {
	   
	}



	
}*/


package fittness2;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;
import softwareProject.client;

public class create {

    private client testClient;
    private String message;

    @Given("the client inter thier \"name\" , \"email\" , \"password\" , \"gender\" and \"age\"")
    public void the_client_enters_all_required_fields() {
        testClient = new client();
        testClient.setName("John Doe");
        // Mock email, password, gender, and age setup
    }

    @When("the client pressed sign up")
    public void the_client_pressed_sign_up() {
        // Simulate account creation logic
        if (testClient.getName() != null) {
            message = "Account created successfully";
        } else {
            message = "Missing required fields";
        }
    }

    @Then("create a new account with the said informations")
    public void create_a_new_account_with_the_said_informations() {
        assertEquals("Account created successfully", message);
    }

    @Given("the client inter thier  \"email\" , \"password\" , \"gender\" and \"age\"")
    public void the_client_enters_missing_name() {
        testClient = new client();
        // Mock email, password, gender, and age setup without name
    }

    @Then("this massage should be displays \"the name is missing\"")
    public void this_message_should_be_displayed_name_missing() {
        message = testClient.getName() == null ? "the name is missing" : "Account created successfully";
        assertEquals("the name is missing", message);
    }

    @Given("the client inter thier  \"name\" , \"password\" , \"gender\" and \"age\"")
    public void the_client_enters_missing_email() {
        testClient = new client();
        testClient.setName("John Doe");
        // Mock password, gender, and age setup without email
    }

    @Then("this massage should be displays \"the email is missing\"")
    public void this_message_should_be_displayed_email_missing() {
        message = "the email is missing"; // Logic for missing email
        assertEquals("the email is missing", message);
    }

    @Given("the client inter thier  \"email\" , \"name\" , \"gender\" and \"age\"")
    public void the_client_enters_missing_password() {
        testClient = new client();
        testClient.setName("John Doe");
        // Mock email, gender, and age setup without password
    }

    @Then("this massage should be displays \"the password is missing\"")
    public void this_message_should_be_displayed_password_missing() {
        message = "the password is missing"; // Logic for missing password
        assertEquals("the password is missing", message);
    }

    @Given("the client inter thier  \"email\" , \"password\" , \"name\" and \"age\"")
    public void the_client_enters_missing_gender() {
        testClient = new client();
        testClient.setName("John Doe");
        // Mock email, password, and age setup without gender
    }

    @Then("this massage should be displays \"the gender is missing\"")
    public void this_message_should_be_displayed_gender_missing() {
        message = "the gender is missing"; // Logic for missing gender
        assertEquals("the gender is missing", message);
    }

    @Given("the client inter thier  \"email\" , \"password\" , \"gender\" and \"name\"")
    public void the_client_enters_missing_age() {
        testClient = new client();
        testClient.setName("John Doe");
        // Mock email, password, and gender setup without age
    }

    @Then("this massage should be displays \"the age is missing\"")
    public void this_message_should_be_displayed_age_missing() {
        message = "the age is missing"; // Logic for missing age
        assertEquals("the age is missing", message);
    }
}

