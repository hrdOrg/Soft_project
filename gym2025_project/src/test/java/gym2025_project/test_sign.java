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
		 User R=new User();
	    R.set_username("rama");
		R.set_age(21); 
		R.set_numbphone("09765464");
		R.set_pass("1311");
		R.set_type("pending instructor");
		R.set_email("rama@gmail.com");
		
		 User R2=new User();
		    R2.set_username("dania");
			R2.set_age(21); 
			R2.set_numbphone("0999765464");
			R2.set_pass("1111");
			R2.set_type("inactive client");
			R2.set_email("dania@gmail.com");
			A.creat_account(R2);
			A.creat_account(R);
	}
	
	@Given("a user wants to sign in")
	public void a_user_wants_to_sign_in() {
   System.out.println("i want sign in");
    intil();
	}

	@When("they click on sign_in")
	public void they_click_on_sign_in() {
		s.sign_in("dania@gmail.com","1111",A);
	}

	@When("they enter {string} as his_email")
	public void they_enter_as_his_email(String string) {
	  s.set_username("dania@gmail.com");
	}

	@When("they enter {string} as his_password")
	public void they_enter_as_his_password(String string) {
	    s.set_pass("1111");
	}

	@Then("they see a message {string}")
	public void they_see_a_message(String string) {
		 assertTrue(A.msg=="client logged in successfully");
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
