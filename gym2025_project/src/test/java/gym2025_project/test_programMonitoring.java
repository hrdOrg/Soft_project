package gym2025_project;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_programMonitoring {
	
	sign_in s=new sign_in();
	Admin A= new Admin();
    instructor v=new instructor();
    UserFitnessProgram f=new UserFitnessProgram ();
    public void inti() {
   	 User R=new User();
     R.set_username("rama");
 	R.set_age(21); 
 	R.set_numbphone("09765464");
 	R.set_pass("1311");
 	R.set_type("pending instructor");
 	R.set_email("rama@gmail.com");
 	
 	program p=new program();
	p.set_titel("stringlifts");
	p.set_duration("one month");
	p.set_level("easy");
	p.set_goals("losse 5kg");
	p.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	p.set_price("50 NIS");
 	
    f.set_name(R);
    f.set_programName(p);
    f.set_gender("F");
    f.set_completedSessions(5);
    f.set_totalSessions(5);
    f.set_fitnessGoal("i want to arrive to normal wheight");
    f.set_hight(1.67);
    f.set_weight(80);
    f.updateStatusprogram(p);
    }

@Given("i am admin")
public void i_am_admin() {
	s.sign_in("haya@gmail.com","123hh",A);
}

@When("i clic to view stitic on the most popular program")
public void i_clic_to_view_stitic_on_the_most_popular_program() {
    A.most_papularprogram(v.programList);
}

@Then("must show list of statistics")
public void must_show_list_of_statistics() {
	 assertTrue(A.msg=="popular program shown");
}

@When("i clic to generate report on attendence and client progress")
public void i_clic_to_generate_report_on_attendence_and_client_progress() {
	inti();
    A.report_progress(f);
}

@Then("it must dis report on attendence and client progress")
public void it_must_dis_report_on_attendence_and_client_progress() {
	 assertTrue(A.msg=="repot genrated");
}

@When("i clic on track active and completed programs")
public void i_clic_on_track_active_and_completed_programs() {
	A.trackProgram(v.programList);
    
}

@Then("i should dis list of active program")
public void i_should_dis_list_of_active_program() {
	 assertTrue(A.msg=="done");
}

}
