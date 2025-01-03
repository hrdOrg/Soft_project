package gym2025_project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testEnrolled {

		private boolean isEnrolled = false;
	    //private String programSchedule = "No schedule available.";
	    private program selectedProgram ;

	    @Given("the client has browsed the programs")
	    public void the_client_has_browsed_the_programs() {
	        System.out.println("Client is browsing the available programs.");
	    }

	    @When("the client selects a program and enrolls in it")
	    public void the_client_selects_a_program_and_enrolls_in_it() {
	        selectedProgram.set_titel("Fitness Bootcamp");
	        isEnrolled = true;
	        selectedProgram.set_duration("Monday, Wednesday, Friday: 6 PM - 7 PM (Online)");
	        System.out.println("Client has selected and enrolled in: " + selectedProgram);
	    }

	    @Then("the system should confirm the client's enrollment in the program")
	    public void the_system_should_confirm_the_client_s_enrollment_in_the_program() {
	        if (isEnrolled) {
	            System.out.println("Enrollment confirmed for program: " + selectedProgram.get_titel());
	        } else {
	            System.out.println("Enrollment failed. No program selected.");
	        }
	    }

	    @When("the client views the program schedule")
	    public void the_client_views_the_program_schedule() {
	        System.out.println("Client is viewing the program schedule.");
	    }

	    @Then("the system should display the correct schedule with dates and times for online or in-person sessions")
	    public void the_system_should_display_the_correct_schedule_with_dates_and_times_for_online_or_in_person_sessions() {
	        if (isEnrolled) {
	            System.out.println("Schedule for " + selectedProgram.get_titel() + ": " + selectedProgram.get_duration());
	        } else {
	            System.out.println("No schedule available. Please enroll in a program first.");
	        }
	    }
	

	
}
