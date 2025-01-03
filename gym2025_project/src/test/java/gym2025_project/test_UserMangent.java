package gym2025_project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import gym2025_project.User;
import gym2025_project.Admin;
import gym2025_project.sign_in;
public class test_UserMangent {
	
	
	User U1=new User();
	User U2=new User();
	Admin A= new Admin();
	activity v1=new activity("rama@gmail.com",3,2);
	sign_in s=new sign_in();
	 User U3=new User();
	 User U4=new User();
	 User U5=new User();
	public void initi() {
		// User U3=new User();
		    U3.set_username("dania");
	        U3.set_age(21); 
			U3.set_numbphone("0999765464");
			U3.set_pass("1111");
			U3.set_type("inactive client");
			U3.set_email("dania@gmail.com");
			A.creat_account(U3);
			//User U4=new User();
		    U4.set_username("dodo");
	        U4.set_age(21); 
			U4.set_numbphone("099976977994");
			U4.set_pass("1111");
			U4.set_type("pending instructor");
			U4.set_email("dodo@gmail.com");
			A.creat_account(U4);
			A.add_user_activity(v1);
			
	}
public void init2() {
	   U5.set_username("dodo");
       U5.set_age(21); 
		U5.set_numbphone("099976977994");
		U5.set_pass("111");
		U5.set_type("pending instructor");
		U5.set_email("dodo@gmail.com");
		//A.creat_account(U5);
}
   
@Given("I am logged in as an admin")
public void i_am_logged_in_as_an_admin() {
	s.sign_in("haya@gmail.com","123hh",A);
    
}

@When("when i clic in add account")
public void when_i_clic_in_add_account() {
	initi();
  // A.creat_account(U1);
}

@When("i enter {string} as username")
public void i_enter_as_username(String string) {
	  U1.set_username("rama");
	  U2.set_username("rama");
	  U5.set_username("r");
}

@When("i enter {int} as age")
public void i_enter_as_age(Integer int1) {
	  U1.set_age(21);
	  U2.set_age(21);
	  U5.set_age(33);
}

@When("i enter {string} as email")
public void i_enter_as_email(String string) {
	 U1.set_email("Rama@gmail.com");
	 U2.set_email("Rama@gmail.com");
	 U5.set_email("R@gmail.com");
}

@When("i enter {string} as password")
public void i_enter_as_password(String string) {
	U1.set_pass("1311R");
	U2.set_pass("1311R");
	U5.set_pass("1R");
}

@When("i enter {string} as numberphone")
public void i_enter_as_numberphone(String string) {
	 U1.set_numbphone("059987754");
	 U2.set_numbphone("059986754");
	 U5.set_numbphone("05954");
}

@When("i enter {string} as type of regester")
public void i_enter_as_type_of_regester(String string) {
	 U1.set_type("active client");
	 U2.set_type("pending instructor");
	 U5.set_type("pending instructor");
}

@Then("it will dispplay {string}")
public void it_will_dispplay(String string) {

	if(U1.get_type().equals("clinet")) {
		   assertTrue(A.msg.equals("created clinet_account successfully"));
		}
}

@Then("it will be dispplay {string}")
public void it_will_be_dispplay(String string) {
	if(U1.get_type().equals("pending instructor")) {
		  assertTrue(A.msg.equals("created instructor_account successfully"));
} 
}
//====================================================================================================
@Given("the numberphone {string} already exists")
public void the_numberphone_already_exists(String string) {
	initi();
	A.account_exists(U3);
}

@When("i clic in add account")
public void i_clic_in_add_account() {
A.creat_account(U3);
;
}

@Then("I need to seee {string}")
public void i_need_to_seee(String string) {
	assertTrue(A.msg.equals("User already added"));
}

//=====================================================================================================================

@When("I leave the password field empty")
public void i_leave_the_password_field_empty() {
	
   U5.set_pass("");
   A.creat_account(U5);
}
@When("i clic in add account2")
public void i_clic_in_add_account2() {
	init2();
}

@Then("I should see {string}")
public void i_should_see(String string) {
	 assertTrue(A.msg.equals("we canot creat account becouce miss information"));
}

@When("I leave the username field empty")
public void i_leave_the_username_field_empty() {
   U5.set_username("");
   A.creat_account(U5);
}

@When("I leave the age field empty")
public void i_leave_the_age_field_empty() {
    U5.set_age(0);
    A.creat_account(U5);
}

@When("I leave the email field empty")
public void i_leave_the_email_field_empty() {
    U5.set_email("");
    A.creat_account(U5);
}

@When("i leave the phonenumber field empty")
public void i_leave_the_phonenumber_field_empty() {
    U5.set_numbphone("");
    A.creat_account(U5);
}

@When("i leave the type field empty")
public void i_leave_the_type_field_empty() {
    U5.set_type("");
    A.creat_account(U5);
}
//=========================================================================================================================
@Given("the numberphone {string} that i want to delete this account")
public void the_numberphone_that_i_want_to_delete_this_account(String string) {
   String num="059986754";
}
@When("i clic in delete")
public void i_clic_in_delete() {
	initi();
   A.delete_account("0999765464");
}

@Then("want to see {string}")
public void want_to_see(String string) {
	assertTrue(A.msg.equals("user deleted"));
}
//=============================================================================
@Given("a new instructor registration request with email {string} is pending")
public void a_new_instructor_registration_request_with_email_is_pending(String string) {
    A.status_instructor("dodo@gmail.com");
}

@When("I approve the registration request")
public void i_approve_the_registration_request() {
	initi();
   A.approve_instructor("dodo@gmail.com");
}

@Then("the instructor's account should be activated")
public void the_instructor_s_account_should_be_activated() {
	
	assertTrue(A.msg.equals("you have been accepted"));
}


//=================================================================================
@When("I navigate to the user activity dashboard")
public void i_navigate_to_the_user_activity_dashboard() {
	initi();
	A.viewOverallStatistics();
}

@Then("I should see statistics like total logins, active users, and inactive users")
public void i_should_see_statistics_like_total_logins_active_users_and_inactive_users() {
	assertTrue(A.msg.equals("shown"));
}
//======================================================================================================================
@Given("a user with email {string} exists")
public void a_user_with_email_exists(String string) {
 A.add_user_activity(v1);
 
}

@When("I view the engagement details for this user")
public void i_view_the_engagement_details_for_this_user() {
    A.view_user_activity("rama@gmail.com");
}

@Then("I should see metrics like number of logins, programs enrolled, and messages sent")
public void i_should_see_metrics_like_number_of_logins_programs_enrolled_and_messages_sent() {
	assertTrue(A.msg.equals("user found"));
}



@Given("no user with email {string} exists")
public void no_user_with_email_exists(String string) {
    activity v2=new activity("samrea@gmail.com",5,8);
}

@When("I try to view the engagement details for this user")
public void i_try_to_view_the_engagement_details_for_this_user() {
    A.view_user_activity("samrea@gmail.com");
}

@Then("I should see an error message {string}")
public void i_should_see_an_error_message(String string) {
	assertTrue(A.msg.equals("user not found"));
}


}
