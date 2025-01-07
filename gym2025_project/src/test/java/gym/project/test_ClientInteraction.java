package gym.project;
import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_ClientInteraction {
	
	Admin A=new Admin();
	client_msg c=new client_msg(); 
	User U=new User("dania",21,"dania@gmail.com","123#","0598979234","active client");
	User U1=new User("rama",21,"rama@gmail.com","193#&","0598587234","pending instructor");
	//UserFitnessProgram P=new UserFitnessProgram("dania","stringlifts","F",59,1.67,"loose 3Kg",3);
	
	
	@Given("client is enrolled in the system")
	public void client_is_enrolled_in_the_system() {
	   A.creat_account(U);
	}

	@When("the user sends a message to the client")
	public void the_user_sends_a_message_to_the_client() {
	   c.send_massege_to_client("you must attend the meeting tomorrow");
	}

	@Then("the client should receive the message")
	public void the_client_should_receive_the_message() {
		assertTrue(c.msgg=="msg sent succesfully");
	}
	
	
	//=======================================================

	@Given("i am logged in as instuctor")
	public void i_am_logged_in_as_instuctor() {
	    A.creat_account(U1);
	}

	@Given("a client is enrolled in the system")
	public void a_client_is_enrolled_in_the_system() {
	    A.creat_account(U);
	}

	@When("the user writes feedback for the client")
	public void the_user_writes_feedback_for_the_client() {
	    c.send_feedback_to_client("you did well today");
	}

	@Then("the client should be able to view the feedback in their profile")
	public void the_client_should_be_able_to_view_the_feedback_in_their_profile() {
		assertTrue(c.msgg=="feedback sent succesfully");
	}
	


}
