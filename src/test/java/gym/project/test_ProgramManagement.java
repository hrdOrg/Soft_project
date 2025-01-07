package gym.project;
import static org.junit.Assert.assertFalse;


import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_ProgramManagement {
	public static final Logger logger = Logger.getLogger(test_ProgramManagement.class.getName());
	Admin A=new Admin();
	instructor n=new instructor();
	program p=new program();
	program p1=new program();
	sign_in sign=new sign_in();
	schedule s=new schedule();
	program d=new program();
	program r=new program();
	program GR=new program();
	program ddd=new program();
	public void initial() {
		d.set_titel("Janbaz Basics"); 
		d.set_duration("three month");
		d.set_level("middle");
		d.set_goals("losse 8kg");
		d.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		d.set_price("150 NIS");

		GR.set_titel("ana"); 
		GR.set_duration("three month");
		GR.set_level("middle");
		GR.set_goals("losse 8kg");
		GR.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		GR.set_price("150 NIS");
		
		n.creat_program(d);
		n.creat_program(GR);	
	}
	
	public void initial3() {
		
		ddd.set_titel("Janbaz"); 
		ddd.set_duration("three month");
		ddd.set_level("middle");
		ddd.set_goals("losse 8kg");
		ddd.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		ddd.set_price("150 NIS");
		n.creat_program(ddd);
	//	n.creat_program(r);
			
	}
	
	
	public void initial2() {
		r.set_titel("Janbaz Basics"); 
		r.set_duration("three month");
		r.set_level("s");
		r.set_goals("losse 8kg");
		r.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		r.set_price("150 NIS");

	//	n.creat_program(r);
			
	}
	
	@Given("i am logged in as instructor")
	public void i_am_logged_in_as_instructor() {
		sign.sign_in("dania@gmail.com", "1111", A);
	}

	@When("i clic in creat fitness program1")
	public void i_clic_in_creat_fitness_program1() {
		initial3();
	//	n.creat_program(r);
	}

	@When("i enter {string} as program titel")
	public void i_enter_as_program_titel(String string) {
		p.set_titel("stringlifts");
	    p1.set_titel("Junbaz");
	    r.set_titel("Juz");
	    
	}

	@When("i enter {string} as duration")
	public void i_enter_as_duration(String string) {
		p.set_duration("one month");
		p1.set_duration("tow month");
		r.set_duration("tow month");
	}

	@When("i enter {string} as difficulty level")
	public void i_enter_as_difficulty_level(String string) {
		p.set_level("easy");
	    p1.set_level("hard");
	    r.set_level("hard");
	    
	}

	@When("i enter  {string} as goals")
	public void i_enter_as_goals(String string) {
		p.set_goals("losse 5kg");
		p1.set_goals("losse 10kg");
		r.set_goals("losse 100kg");
	}

	@When("i upload video tutorial or image or document")
	public void i_upload_video_tutorial_or_image_or_document() {
		p.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		  p1.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		  r.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	}

	@When("i set {string} as price")
	public void i_set_as_price(String string) {
		p.set_price("50 NIS");
		p1.set_price("100 NIS");
		r.set_price("100 NIS");
	}

	@Then("I Should see {string}")
	public void i_should_see(String string) {
		assertTrue(n.msg.equals("program added"));
	}
	
	//==========================================================================

	@Given("program titel {string} already exist")
	public void program_titel_already_exist(String string) {
		n.program_exists(d);
	}

	@When("i clic in creat fitness programs2")
	public void i_clic_in_creat_fitness_programs2() {
		initial();
		n.creat_program(d);
	   
	}

	@Then("i See {string}")
	public void i_see(String string) {
	    assertTrue(n.msg.equals("program already added"));
	}
	
	//=============================================================================
	
	
	@When("i clic in creat fitness programs3")
	public void i_clic_in_creat_fitness_programs3() {
	    
	    initial2();
	  
	}

	@When("i leave program titel empty")
	public void i_leave_program_titel_empty() {
	   r.set_titel("");
	   n.creat_program(r);
	   
	}

	@Then("I SHould see {string}")
	public void i_s_hould_see(String string) {
	
	   assertTrue(n.msg.equals("we canot creat program becouse miss information"));
	}
	
	

	@When("i leave duration empty")
	public void i_leave_duration_empty() {
	    r.set_duration("");
	    n.creat_program(r);
	    
	}

	@When("i leave difficulty level empty")
	public void i_leave_difficulty_level_empty() {
	   r.set_duration("");
	   n.creat_program(r);
	}

	@When("i leave goals empty")
	public void i_leave_goals_empty() {
	    r.set_goals("");
	    n.creat_program(r);
	}

	@When("i dont upload video tutorial or image or document")
	public void i_dont_upload_video_tutorial_or_image_or_document() {
	   r.set_duration("");
	   n.creat_program(r);
	}
	

	//===================================================================================

	@Given("I am logged in as an instructor")
	public void i_am_logged_in_as_an_instructor() {
		sign.sign_in("dania@gmail.com", "1111", A);
	}

	@Given("the  program titel {string} that i want to delete this fitness program")
	public void the_program_titel_that_i_want_to_delete_this_fitness_program(String string) {
		String tit="stringlifts";
	}

	@When("I am clic in delete")
	public void i_am_clic_in_delete() {
		initial();
		n.delete_program("Janbaz Basics");
	}

	@Then("I should SEE {string}")
	public void i_should_see1(String string) {
		assertTrue(n.msg=="program deleted");
	}
	
	//======================================================================

	@Given("I am logged in as an instuctor")
	public void i_am_logged_in_as_an_instuctor() {
		sign.sign_in("dania@gmail.com", "1111", A); 
	}
	
	@When("i clic creat new schedule")
	public void i_clic_creat_new_schedule() {
		n.set_schedule(s);
	}


	@When("a fitness program titled {string} exists")
	public void a_fitness_program_titled_exists(String string) {
		s.set_titel("dania");
	}

	@When("I add a new session with the date {string}")
	public void i_add_a_new_session_with_the_date(String string) {
		s.set_date("2024-12-10");
	}

	@When("I set the time to {string}")
	public void i_set_the_time_to(String string) {
		s.set_time( "6:00 PM");
	}

	@When("I choose the session type as {string}")
	public void i_choose_the_session_type_as(String string) {
		s.set_type("Online");
	}

	@When("I provide a meeting link {string}")
	public void i_provide_a_meeting_link(String string) {
		s.set_place("https://example.com/session");
	}

	@Then("the schedule for the online group session should be created successfully")
	public void the_schedule_for_the_online_group_session_should_be_created_successfully() {
		assertTrue(n.msg=="schedule not added");
	}
//=================

@Given("I WANT TO UPDATE PrOgRaM")
public void i_want_to_update_pr_og_ra_m() {
   logger.info("i want to update prpgram");
}

@When("I CLIC to PrOgRaM UPDATE1")
public void i_clic_to_pr_og_ra_m_update1() {
	initial();
	n.update_project("ana","duration");
}

@Then("THE DuRaTion must BE updated")
public void the_du_ra_tion_must_be_updated() {
	assertTrue(n.msg=="duration updated");
}

@When("I CLIC to PrOgRaM UPDATE2")
public void i_clic_to_pr_og_ra_m_update2() {
	initial();
	n.update_project("ana","level");
}

@Then("THE LEveL must BE updated")
public void the_l_eve_l_must_be_updated() {
	assertTrue(n.msg=="level updated");
}

@When("I CLIC to PrOgRaM UPDATE3")
public void i_clic_to_pr_og_ra_m_update3() {
	initial();
	n.update_project("ana","goals");
}

@Then("THE GoOlS  must BE updated")
public void the_go_ol_s_must_be_updated() {
	assertTrue(n.msg=="goals updated");
}

@When("I CLIC to PrOgRaM UPDATE4")
public void i_clic_to_pr_og_ra_m_update4() {
	initial();
	n.update_project("ana","link");
}

@Then("THE LiNK must BE updated")
public void the_li_nk_must_be_updated() {
	assertTrue(n.msg=="link updated");
}

@When("I CLIC to PrOgRaM UPDATE5")
public void i_clic_to_pr_og_ra_m_update5() {
	initial();
	n.update_project("ana","price");
}

@Then("THE PrICE   must BE updated")
public void the_pr_ice_must_be_updated() {
	assertTrue(n.msg=="price updated");
}

@When("I CLIC to PrOgRaM UPDATE6")
public void i_clic_to_pr_og_ra_m_update6() {
	initial();
	n.update_project("ananada","price");
}

@Then("THE pRoGrAm must BE Not updated")
public void the_p_ro_gr_am_must_be_not_updated() {
	assertTrue(n.msg=="program titel not found.");
}


}
