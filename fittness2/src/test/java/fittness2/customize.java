package fittness2;
/*
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.client;

public class customize {
	
	client c = new client(); 
	
	
	
	@When("the client add their profile with personal details like {string}")
	public void the_client_add_their_profile_with_personal_details_like(String string) {
	   c.setAge(20);
	}

	@Then("the system should add the client's {string} successfully")
	public void the_system_should_add_the_client_s_successfully(String string) {
	   assertTrue(c.getAge()==20);
	}

	@When("the client delete their profile with personal details like  {string}")
	public void the_client_delete_their_profile_with_personal_details_like1(String string) {
	    
	}

	@Then("the system should delete the client's {string} successfully")
	public void the_system_should_delete_the_client_s_successfully(String string) {
	    
	}

	@When("the client add their profile with personal details like  {string}")
	public void the_client_add_their_profile_with_personal_details_like1(String string) {
	    
	}

	@When("the client delete their profile with personal details like {string}")
	public void the_client_delete_their_profile_with_personal_details_like(String string) {
	    
	}

	@When("the client adjusts their privacy settings to control visibility of their information")
	public void the_client_adjusts_their_privacy_settings_to_control_visibility_of_their_information() {
	    
	}

	@Then("the system should update the privacy settings accordingly")
	public void the_system_should_update_the_privacy_settings_accordingly() {
	    
	}



	
}*/

//@step_definitions
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.client;

public class customize {

    private client testClient;

    @Given("the client is logged in")
    public void the_client_is_logged_in() {
        testClient = new client(25, "John Doe", "Male", 75.0, 1.75);
    }

    @When("the client adds their profile with personal details like \"age\"")
    public void the_client_adds_age() {
        testClient.setAge(30);
    }

    @Then("the system should add the client's \"age\" successfully")
    public void the_system_should_add_age_successfully() {
        assertEquals(30, testClient.getAge());
    }

    @When("the client adds their profile with personal details like \"fitness goals\"")
    public void the_client_adds_fitness_goals() {
        testClient.addFittnessGoals("Build muscle");
    }

    @Then("the system should add the client's \"fitness goals\" successfully")
    public void the_system_should_add_fitness_goals_successfully() {
       // ArrayList<String> goals = testClient.getFittnessGoals();
       // assertEquals("Build muscle", goals.get(0));
    }

    @When("the client deletes their profile with personal details like \"fitness goals\"")
    public void the_client_deletes_fitness_goals() {
        testClient.deleteFittnessGoals("Build muscle");
    }

    @Then("the system should delete the client's \"fitness goals\" successfully")
    public void the_system_should_delete_fitness_goals_successfully() {
       // ArrayList<String> goals = testClient.getFittnessGoals();
       // assertEquals(0, goals.size());
    }

    @When("the client adds their profile with personal details like \"dietary preferences\"")
    public void the_client_adds_dietary_preferences() {
        testClient.addDietary("Vegetarian");
    }

    @Then("the system should add the client's \"dietary preferences\" successfully")
    public void the_system_should_add_dietary_preferences_successfully() {
       // ArrayList<String> dietary = testClient.getDietary();
       // assertEquals("Vegetarian", dietary.get(0));
    }

    @When("the client deletes their profile with personal details like \"dietary preferences\"")
    public void the_client_deletes_dietary_preferences() {
        testClient.deleteDietary("Vegetarian");
    }

    @Then("the system should delete the client's \"dietary preferences\" successfully")
    public void the_system_should_delete_dietary_preferences_successfully() {
       // ArrayList<String> dietary = testClient.getDietary();
       // assertEquals(0, dietary.size());
    }

    @When("the client adjusts their privacy settings to control visibility of their information")
    public void the_client_adjusts_privacy_settings() {
        // Simulate setting privacy settings
       // testClient.setPrivacySettings(true);
    }

    @Then("the system should update the privacy settings accordingly")
    public void the_system_should_update_privacy_settings_accordingly() {
        //assertEquals(true, testClient.getPrivacySettings());
    }
}

