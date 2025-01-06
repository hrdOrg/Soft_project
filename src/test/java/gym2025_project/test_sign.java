package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class test_sign {
	sign_in s=new sign_in();
	Admin A= new Admin();
	public void intil() {
		//sign_in sign=new sign_in();
		 User RR=new User();
	    RR.set_username("samera");
		RR.set_age(21); 
		RR.set_numbphone("065464");
		RR.set_pass("1311");
		RR.set_type("pending instructor");
		RR.set_email("samera@gmail.com");
		
		 User RR2=new User();
		    RR2.set_username("daniaaa");
			RR2.set_age(21); 
			RR2.set_numbphone("5464");
			RR2.set_pass("1111");
			RR2.set_type("inactive client");
			RR2.set_email("daniaaa@gmail.com");
			A.creat_account(RR2);
			A.creat_account(RR);
	}
	
	@Given("a user wants to sign in")
	public void a_user_wants_to_sign_in() {
   System.out.println("i want sign in");
    intil();
	}

	@When("they click on sign_in")
	public void they_click_on_sign_in() {
	
		s.sign_in("samera@gmail.com","1311",A);
	}

	@When("they enter {string} as his_email")
	public void they_enter_as_his_email(String string) {
	  s.set_username("samera@gmail.com");
	}

	@When("they enter {string} as his_password")
	public void they_enter_as_his_password(String string) {
	    s.set_pass("1311");
	}

	@Then("they see a message {string}")
	public void they_see_a_message(String string) {
		 assertTrue(A.msg.equals("instructor logged in successfully"));
	}
//======================================================================================================================================
	@When("they click in sign_in")
	public void they_click_in_sign_in() {
		s.sign_in("heba@gmail.com","1111",A);
	}
	
	
	@When("they enter {string} as wrong his_email")
	public void they_enter_as_wrong_his_email(String string) {
		 s.set_username("heba@gmail.com");
	}

	@When("they enter {string} as hispassword")
	public void they_enter_as_hispassword(String string) {
		  s.set_pass("1111");
	}

	@Then("we see a message {string}")
	public void we_see_a_message(String string) {
		 assertTrue(A.msg=="Wrong  email_c. Try again");
	}
//=====================================================================================================================================

	@When("they click to sign_in")
	public void they_click_to_sign_in() {
		s.sign_in("dania@gmail.com","1234",A);
	}
	
	
	@When("they enter {string} as hisemail")
	public void they_enter_as_hisemail(String string) {
		  s.set_username("dania@gmail.com");
	}
	

	@When("they enter {string} as incorrect his_password")
	public void they_enter_as_incorrect_his_password(String string) {
		s.set_pass("1234");
	}

	@Then("you see a message {string}")
	public void you_see_a_message(String string) {
		assertTrue(A.msg=="Wrong pass_c. Try again");
	}


}
