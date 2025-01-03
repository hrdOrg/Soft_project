package gym2025_project;

import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class testFeedback {

	private feedback testFeedback;

    @Given("the client has completed a program")
    public void the_client_has_completed_a_program() {
        testFeedback = new feedback();
    }

    @When("the client submits a {string} for improvement")
    public void the_client_submits_a_for_improvement(String suggestion) {
        // Simulate submitting an improvement
        testFeedback.setImprovment("dania", "she is excellent coach");
    }

    @Then("the system should save the {string} for the instructor to review")
    public void the_system_should_save_the_for_the_instructor_to_review(String suggestion) {
    	assertTrue(testFeedback.massage.equals("improvement is add"));
   
       
    }

    @When("the client engages in community {string} via discussion forums")
    public void the_client_engages_in_community_via_discussion_forums(String feedbackContent) {
        // Simulate submitting feedback
        testFeedback.setFeedback("program 1", "dania", "she is excellent coach");
    }

    @Then("the system should allow the client to post {string}")
    public void the_system_should_allow_the_client_to_post(String feedbackContent) {
        assertTrue(testFeedback.massage.equals("the feedback is add"));
    }

    @When("the client {string} a the program")
    public void the_client_a_the_program(String action) {
        testFeedback.setRate(5, "Rama");
    }

    @Then("the system should save the {string} for the program")
    public void the_system_should_save_the_for_the_program(String rateType) {
        assertTrue(testFeedback.massage.equals("the rate is add"));
    }



	
}
