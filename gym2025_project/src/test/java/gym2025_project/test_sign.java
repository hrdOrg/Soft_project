package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class test_sign {
	sign_in s=new sign_in();
	Admin A= new Admin();
	@Given("a user wants to sign in")
	public void a_user_wants_to_sign_in() {


	}

	@When("they click on sign_in")
	public void they_click_on_sign_in() {
		s.sign_in("rama@gmail.com","1311",A);
	}

	@When("they enter {string} as his_email")
	public void they_enter_as_his_email(String string) {
	  s.set_username("rama@gmail.com");
	}

	@When("they enter {string} as his_password")
	public void they_enter_as_his_password(String string) {
	    s.set_pass("1311");
	}

	@Then("they see a message {string}")
	public void they_see_a_message(String string) {
		 assertTrue(A.msg=="client logged in successfully");
	}

	@When("they enter {string} as  his_email")
	public void they_enter_as_his_email1(String string) {
	  s.set_username("heba@gmail.com");
	}

	@When("they enter {string} as incorrect his_password")
	public void they_enter_as_incorrect_his_password(String string) {
	   s.set_pass("1311");
	}
}
