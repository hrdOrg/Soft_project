package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_ContentManagement {
	
	Admin A= new Admin();
	sign_in s=new sign_in();
	suggestion_instructor r=new suggestion_instructor();
	
	@Given("i am sign in as admain")
	public void i_am_sign_in_as_admain() {
		s.sign_in("haya@gmail.com","123hh",A);
	}

	@When("i clic show   wellness articles, tips, or recipes shared by instructors")
	public void i_clic_show_wellness_articles_tips_or_recipes_shared_by_instructors() {
	r.show_wellnessarticles_fromInstructor();
	}

	@When("i agreed to them")
	public void i_agreed_to_them() {
	  r.approve_wellnessarticles_fromInstructor();
	}

	@Then("see me {string}")
	public void see_me(String string) {
		 assertTrue(r.msg=="the instructor suggestions were approved");
	}

	@When("i  reject to them")
	public void i_reject_to_them() {
	   r.reject_wellnessarticles_fromInstructor();
	}

	@Then("show me {string}")
	public void show_me(String string) {
		 assertTrue(r.msg=="the instructor suggestions were rejected");
	}


	@When("i clic show articles or tips shared on health and wellness")
	public void i_clic_show_articles_or_tips_shared_on_health_and_wellness() {
     r.show_helthwellnessarticles();
     
	}
	@When("i apporv to them")
	public void i_apporv_to_them() {
	    r.approve_helthwellnessarticles();
	}


	@Then("display {string}")
	public void display(String string) {
		assertTrue(r.msg=="the helth wellness articleswere approved");
	}
  

	@When("i clic show user feedback and complaints")
	public void i_clic_show_user_feedback_and_complaints() {
	r.show_feedback();
	}

	@Then("i should see list of user feedback and complaints")
	public void i_should_see_list_of_user_feedback_and_complaints() {
		assertTrue(r.msg=="feedback shown");
	}


	
}