package gym2025_project;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;


public class testCustomize {

	 //private client testClient= new client(20, "heba", "Famale", 60.0, 1.65);
	 private client testClient;
	 public void initial() {
		 testClient= new client(20, "heba", "Famale", 60.0, 1.65);
	 }

	    @Given("THE1 client is logged in")
	    public void the1_client_is_logged_in() {
	    	System.out.println("inside customze");
	    }

	    @When("the client1 add their profile with personal details like1 {string}")
	    public void the_client1_add_their_profile_with_personal_details_like1(String string) {
	    	initial();
	        testClient.setAge(21);
	    }

	    @Then("the system should add the client's1 {string} successfully")
	    public void the_system_should_add_the_client_s1_successfully(String string) {
	    	 assertEquals(21 , testClient.getAge());
	    }

	    @Given("THE2 client is logged in")
	    public void the2_client_is_logged_in() {
	    	System.out.println("inside customze");
	    }

	    @When("the client2 add their profile with personal details like2  {string}")
	    public void the_client2_add_their_profile_with_personal_details_like2(String string) {
	    	initial();
	        testClient.addFittnessGoals("Build muscle");
	        
	    }
////////////////////////////////
	    @Then("the system should add the client's2 {string} successfully")
	    public void the_system_should_add_the_client_s2_successfully(String string) {
	    	assertTrue(testClient.msg.equals("the goal is add"));
	    }

	    @Given("THE3 client is logged in")
	    public void the3_client_is_logged_in() {
	    	System.out.println("inside customze");
	    }

	    @When("the client3 delete their profile with personal details like3  {string}")
	    public void the_client3_delete_their_profile_with_personal_details_like3(String string) {
	    	initial();
	        testClient.deleteFittnessGoals("Build muscle");
	    }

	    @Then("the system should delete the client's3 {string} successfully")
	    public void the_system_should_delete_the_client_s3_successfully(String string) {
	    	 assertEquals(null, testClient.getFittnessGoals());
	    }

	    @Given("THE4 client is logged in")
	    public void the4_client_is_logged_in() {
	    	System.out.println("inside customze");
	    }

	    @When("the client4 add their profile with personal details like4  {string}")
	    public void the_client4_add_their_profile_with_personal_details_like4(String string) {
	    	initial();
	        testClient.addDietary("Vegetarian");

	    }
////////////////////////////
	    @Then("the system should add the client's4 {string} successfully")
	    public void the_system_should_add_the_client_s4_successfully(String string) {
	    	 assertTrue(testClient.msg.equals("the dietary is add"));
	    }

	    @Given("THE5 client is logged in")
	    public void the5_client_is_logged_in() {
	    	System.out.println("inside customze");
	    }

	    @When("the client5 delete their profile with personal details like5 {string}")
	    public void the_client5_delete_their_profile_with_personal_details_like5(String string) {
	    	initial();
	        testClient.deleteDietary("Vegetarian");
	    }

	    @Then("the system should delete the client's5 {string} successfully")
	    public void the_system_should_delete_the_client_s5_successfully(String string) {
	    	 assertEquals(null, testClient.getDietary());
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
}
