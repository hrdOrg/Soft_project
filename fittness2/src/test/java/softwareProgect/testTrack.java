package softwareProgect;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;
import softwareProject.client;
import softwareProject.program;


public class testTrack {

	 private client testclient;

	    @Given("the client has completed certain program milestones")
	    public void the_client_has_completed_certain_program_milestones() {
	        testclient = new client(20, "heba", "Famale", 60.0, 1.65);
	        testclient.addAchievements("Completed Beginner Program");
	        testclient.addAchievements("Achieved Weight Goal");
	    }

	    @When("the client checks their achievements")
	    public void the_client_checks_their_achievements() {
	        testclient.getAchievements();
	    }

	    @Then("the system should show earned \"achievements\" for completed goals")
	    public void the_system_should_show_earned_achievements_for_completed_goals() {
	    	/*
	        assertTrue(achievements.contains("Completed Beginner Program"));
	        assertTrue(achievements.contains("Achieved Weight Goal"));*/
	    	assertTrue(testclient.msg.equals("this is your Achievements"));
	    }
///////////////////////////////////////////////////
	    @Given("the client is enrolled in a program")
	    public void the_client_is_enrolled_in_a_program() {
	        testclient = new client(25, "heba", "Famale", 60.0, 1.65);
	        program prog = new program();
	        prog.set_titel("Beginner Program");
	        testclient.enroll(prog);
	        testclient.setAttendance(80);
	    }

	    @When("the client checks their program progress")
	    public void the_client_checks_their_program_progress() {
	       testclient.getAttendance();
	    }

	    @Then("the system should show the percentage of the program completed")
	    public void the_system_should_show_the_percentage_of_the_program_completed() {
	      //  assertEquals(80, attendance);
	    	assertTrue(testclient.msg.equals("this is your attendance"));
	    }

	    @When("the client tracks their progress, such as \"BMI\"")
	    public void the_client_tracks_their_progress_such_as_bmi() {
	        testclient.calBMI();
	    }

	    @Then("the system should display the updated \"BMI\"")
	    public void the_system_should_display_the_updated_bmi() {
	       // assertEquals(22.03, bmi, 0.01); // Approximate value for 60kg and 1.65m
	    	assertTrue(testclient.msg.equals("BMI is calculated"));
	    }

	    @When("the client tracks their progress, such as \"weight\"")
	    public void the_client_tracks_their_progress_such_as_weight() {
	        testclient.getWeight();
	    }

	    @Then("the system should display the updated \"weight\"")
	    public void the_system_should_display_the_updated_weight() {
	       // assertEquals(60.0, weight, 0.01);
	    	assertTrue(testclient.msg.equals("this is your weight"));
	    }
	
}
