package gym.project;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestEnroll {
	public static final Logger logger = Logger.getLogger(TestEnroll.class.getName());
		    private program h ;
		    private instructor n = new instructor();
		    client testclient =new client(); 
		    public void init() {
		    	h.set_titel("Fitness Bootcamp"); 
				h.set_duration("one month");
				h.set_level("Beginner");
				h.set_goals("Muscle Building");
				h.set_link("https://www.youtube.com/watch?v=IdjDjxNn553fere9ws");
				h.set_price("100 NIS");

				n.creat_program(h);
		    }
		    //h.set_titel("Fitness Bootcamp");

		    @Given("the CLIENT has browsed the programs")
		    public void the_client_has_browsed_the_programs() {
		    	logger.info("inside the Enroll");
		    }

		    @When("the client selects a program and enrolls in it")
		    public void the_client_selects_a_program_and_enrolls_in_it() {
		    	 testclient.enroll(h);
		    }

		    @Then("the system should confirm the client's enrollment in the program")
		    public void the_system_should_confirm_the_client_s_enrollment_in_the_program() {
		    	 assertTrue(testclient.msg.equals("the program is enrolled"));
		    }

		    @Given("the CLIENT is enrolled in a program")
		    public void the_client_is_enrolled_in_a_program() {
		    	logger.info("inside the Enroll");
		    }

		    @When("the client views the program schedule")
		    public void the_client_views_the_program_schedule() {
		    	testclient.getprograms();
		    }

		    @Then("the system should display the programs")
		    public void the_system_should_display_the_programs() {
		    	assertTrue(testclient.msg.equals("this is your programs"));
		    }

	}


