package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_NotificationsAndUpdates {
	Admin A=new Admin();
	instructor n=new instructor();
	program p=new program();
	program p1=new program();
	sign_in sign=new sign_in();
	schedule s=new schedule();
	
	@Given("iam loged in as instructor")
	public void iam_loged_in_as_instructor() {
		sign.sign_in("dania@gmail.com", "1111", A);
	}

	@When("the system detects the schedule change")
	public void the_system_detects_the_schedule_change() {
	   n.scheduleChange();
	}

	@Then("the system should send a notification to the client about the updated schedule")
	public void the_system_should_send_a_notification_to_the_client_about_the_updated_schedule() {
		assertTrue(n.msg=="Notification sent for client to check your schedule");
	}

	@When("the system identifies clients who may be interested in the program")
	public void the_system_identifies_clients_who_may_be_interested_in_the_program() {
	   n.Newschedule();
	}

	@Then("the system should send an announcement to the clients")
	public void the_system_should_send_an_announcement_to_the_clients() {
		assertTrue(n.msg=="Notification sent for client to see what's new! ");
	}

	@When("the system sends notifications")
	public void the_system_sends_notifications() {
	    n.special_offers();
	}

	@Then("the client should receive a notification about the special offer")
	public void the_client_should_receive_a_notification_about_the_special_offer() {
		assertTrue(n.msg=="Notification sent for client to show new special offers");
	}

}
