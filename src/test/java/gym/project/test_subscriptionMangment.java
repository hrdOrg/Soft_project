package gym.project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_subscriptionMangment {
	
	
	sign_in s=new sign_in();
	Admin A= new Admin();
	subscribtion_client c=new subscribtion_client ();
	subscription_instructor i =new subscription_instructor();
	public void in() {
		i.set_useremail("rama@gmail.com");
		i.set_salary("10000$");
		
		c.set_useremail("dania@gmial.com");
		c.set_typeSub("monthly");
		c.setsxpires("1/19/2025");
		
	}
	
	@Given("i am logged in as admain of gym")
	public void i_am_logged_in_as_admain_of_gym() {
		s.sign_in("haya@gmail.com","123hh",A);
	}

	@When("i am clic in add  to subscription plans for clients and instructors")
	public void i_am_clic_in_add_to_subscription_plans_for_clients_and_instructors() {
		in();
	    A.add_SubscriptionplanForClient(c);
	    A.add_SubscriptionplanForinstructor(i);
	}

	@Then("i see {string}")
	public void i_see(String string) {
		assertTrue(A.msg=="added");
	}

	@When("i am clic in delete from subscription plans for clients and instructors")
	public void i_am_clic_in_delete_from_subscription_plans_for_clients_and_instructors() {
	   A.delete_SubscriptionplanForClient("tala@gmail.com");
	   A.delete_SubscriptionplanForinstructor("masa@gmial.com");
	}

	

	@Then("it will display {string}")
	public void it_will_display(String string) {
		assertTrue(A.msg=="undeleted,not found");
	}

	
	
	@When("i am clic in show subscription plans for clients and instructors")
	public void i_am_clic_in_show_subscription_plans_for_clients_and_instructors() {
	    A.show_subscriptionPlanForClient(c);
	    A.show_subscriptionPlanForinstructor(i);
	}


@Then("i should dissplyy {string}")
public void i_should_dissplyy(String string) {
	assertTrue(A.msg=="shown");
}

}
