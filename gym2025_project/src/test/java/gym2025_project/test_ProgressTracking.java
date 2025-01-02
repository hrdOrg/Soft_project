package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_ProgressTracking {
	
	Admin A=new Admin();
	client_msg c=new client_msg(); 
	User U=new User("dania",21,"dania@gmail.com","123#","0598979234","active client");
	UserFitnessProgram P=new UserFitnessProgram();
	program p2=new program();
	
	
	public void initial() {
		p2.set_titel("Janbaz Basics"); 
		p2.set_duration("three month");
		p2.set_level("middle");
		p2.set_goals("losse 8kg");
		p2.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		p2.set_price("150 NIS");
		P.set_name(U);
		P.set_programName(p2);
		P.set_gender("F");
		P.set_completedSessions(5);
		P.set_totalSessions(5);
		P.set_fitnessGoal("i want to arrive to normal wheight");
		P.set_hight(1.67);
		P.set_weight(80);
	}

	@Given("a client is enrolled in a program that tracks attendance")
	public void a_client_is_enrolled_in_a_program_that_tracks_attendance() {
		  A.creat_account(U); 
	}

	@When("the client attends a session")
	public void the_client_attends_a_session() {
		 initial();
		 P.completeSession();
	}
	
	@Then("the system should {string}")
	public void the_system_should(String string) {
		assertTrue(P.msg=="Update the client’s completion rate");
	}	

	//===========================================================
	
	@Given("a client enrolled in the system")
	public void a_client_enrolled_in_the_system() {
		A.creat_account(U);
	}
	
	@When("the system identifies a suitable time for a reminder")
	public void the_system_identifies_a_suitable_time_for_a_reminder() {
	    c.send_motivation_to_client("keep going >_<");
	}

	@Then("the system should send a motivational reminder to the client")
	public void the_system_should_send_a_motivational_reminder_to_the_client() {
		assertTrue(c.msgg=="motivation sent succesfully");
	}
	
	
	//===========================================================

	@Given("client enrolled in the system")
	public void client_enrolled_in_the_system() {
	    A.creat_account(U);
	}
	
	@When("the user views the client’s notification history")
	public void the_user_views_the_client_s_notification_history() {
	    
		c.set_Notification("there are msg waiting for you");
	}

	@Then("the user should see a record of the sent reminder or recommendation")
	public void the_user_should_see_a_record_of_the_sent_reminder_or_recommendation() {
		assertTrue(c.msgg=="notification sent succesfully");
	}

}
