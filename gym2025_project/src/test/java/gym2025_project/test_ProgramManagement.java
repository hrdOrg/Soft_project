package gym2025_project;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_ProgramManagement {
	
	Admin A=new Admin();
	instructor n=new instructor();
	program p=new program();
	program p1=new program();
	sign_in sign=new sign_in();
	schedule s=new schedule();
	program d=new program();
	
	public void initial() {
		d.set_titel("Janbaz Basics"); 
		d.set_duration("three month");
		d.set_level("middle");
		d.set_goals("losse 8kg");
		d.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		d.set_price("150 NIS");

		n.creat_program(d);
		
		
	}
	
	@Given("i am logged in as instructor")
	public void i_am_logged_in_as_instructor1() {
	      sign.sign_in("dania@gmail.com", "1111", A);
	}

	@When("i clic in creat fitness programs")
	public void i_clic_in_creat_fitness_programs() {
	  n.creat_program(p);
	 // n.creat_program(p1);
	}

	@When("i enter {string} as program titel")
	public void i_enter_as_program_titel(String string) {
	  p.set_titel("stringlifts");
	  p1.set_titel("Junbaz");
	  
	}

	@When("i enter {string} as duration")
	public void i_enter_as_duration(String string) {
	  p.set_duration("one month");
	  p1.set_duration("tow month");
	}

	@When("i enter {string} as difficulty level")
	public void i_enter_as_difficulty_level(String string) {
      p.set_level("easy");
      p1.set_level("hard");
	}

	@When("i enter  {string} as goals")
	public void i_enter_as_goals(String string) {
	  p.set_goals("losse 5kg");
	  p1.set_goals("losse 10kg");
	}

	@When("i upload video tutorial or image or document")
	public void i_upload_video_tutorial_or_image_or_document() {
	  p.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	  p1.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	}

	@When("i set {string} as price")
	public void i_set_as_price(String string) {
	  p.set_price("50 NIS");
	  p1.set_price("100 NIS");
	}

	@Then("i should see {string}")
	public void i_should_see1(String string) {
		assertFalse(n.msg=="program added");
	}

	@Given("program titel {string} already exist")
	public void program_titel_already_exist(String string) {
	   n.program_exists(p1);
	}
	
	/*@Then("i see {string}")
	public void i_see(String string) {
		assertFalse(n.msg=="program already added");
	}
*/
	@When("i leave program titel empty")
	public void i_leave_program_titel_empty() {
	   p.set_titel(null);
	}

	@When("i leave duration empty")
	public void i_leave_duration_empty() {
	   p.set_duration(null);
	}

	@When("i leave difficulty level empty")
	public void i_leave_difficulty_level_empty() {
	  p.set_level(null);
	}

	@When("i leave goals empty")
	public void i_leave_goals_empty() {
	  p.set_goals(null);
	}

	@When("i dont upload video tutorial or image or document")
	public void i_dont_upload_video_tutorial_or_image_or_document() {
	    p.set_link(null);
	}


	@Given("I am logged in as an instructor")
	public void i_am_logged_in_as_an_instructor() {
		 sign.sign_in("dania@gmail.com", "1111", A);
	}

	@Given("the  program titel {string} that i want to delete this fitness program")
	public void the_program_titel_that_i_want_to_delete_this_fitness_program(String string) {
	    String tit="stringlifts";
	}

	@When("i clic in delete")
	public void i_clic_in_delete() {
		initial();
	   n.delete_program("Janbaz Basics");
	}

	@Then("I should see {string}")
	public void i_should_see(String string) {
		assertTrue(n.msg=="program deleted");
	}

	@Given("I am logged in as an instuctor")
	public void i_am_logged_in_as_an_instuctor() {
		 sign.sign_in("dania@gmail.com", "1111", A);
	}

	@When("a fitness program titled {string} exists")
	public void a_fitness_program_titled_exists(String string) {
	      s.set_titel("dania");
	}

	@When("I select the {string} section of the program")
	public void i_select_the_section_of_the_program(String string) {
		
	    n.set_schedule(s);
	}

	@When("I add a new session with the date {string}")
	public void i_add_a_new_session_with_the_date(String string) {
	    s.set_date("2024-12-10");
	}

	@When("I set the time to {string}")
	public void i_set_the_time_to(String string) {
	   s.set_time( "6:00 PM");
	}

	@When("I choose the session type as {string}")
	public void i_choose_the_session_type_as(String string) {
	  s.set_type("Online");
	}

	@When("I provide a meeting link {string}")
	public void i_provide_a_meeting_link(String string) {
	   s.set_place("https://example.com/session");
	}


	@Then("the schedule for the online group session should be created successfully")
	public void the_schedule_for_the_online_group_session_should_be_created_successfully() {
		assertTrue(n.msg=="schedule not added");
	}


	@When("I provide the location as {string}")
	public void i_provide_the_location_as(String string) {
	  s.set_place( "Fitness Studio A, Downtown" );
	}

	@Then("the schedule for the in-person group session should be created successfully")
	public void the_schedule_for_the_in_person_group_session_should_be_created_successfully() {
		assertTrue(n.msg=="schedule not added");
	}



}
