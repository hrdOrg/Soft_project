package gym.project;

import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ExtraTest {
	
	public static final Logger logger = Logger.getLogger(ExtraTest.class.getName());	
	client c = new client();
	instructor n = new instructor();
	program d=new program();
	program h=new program();
	List <program> p=new ArrayList<program>();
	
	
	program H = new program();
	
	feedback feed = new feedback();
	Feed f ;
	improvement m ;
	rate r ;
	
	/*H.set_titel("Janggggbaz Basics");
	H.set_duration("one month");
	H.set_level("Beginner");
	H.set_goals("Muscle Building");
	H.set_link("https://www.youtube.com/watch?v=IdjDjxNn553fere9ws");
	H.set_price("100 NIS");
*/
	//n.creat_program(H);
	
	public void in() {
		H.set_titel("jJanbaz Basics"); 
		H.set_duration("tthree month");
		H.set_level("Intermediate");
		H.set_goals("Flexibility");
		H.set_link("https://www.youtube.com/watch?v=IdjDhtjxNn9ws");
		H.set_price("250 NIS");
		n.creat_program(H);
		c.enroll(H);
	}
	
	public void first(){
	
			d.set_titel("Janbaz Basics"); 
			d.set_duration("three month");
			d.set_level("Intermediate");
			d.set_goals("Flexibility");
			d.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
			d.set_price("150 NIS");
			
			h.set_titel("Janggggbaz Basics"); 
			h.set_duration("one month");
			h.set_level("Beginner");
			h.set_goals("Muscle Building");
			h.set_link("https://www.youtube.com/watch?v=IdjDjxNn553fere9ws");
			h.set_price("100 NIS");

			n.creat_program(d);
			n.creat_program(h);
			p.add(d);
			p.add(h);
	}
	
	@Given("t12134the client is logged in")
	public void t2134the_client_is_logged_in() {
	   logger.info("here in test");
	}

	@When("the client browses gcdsh programs by selecting filters like6  {string} & {string}")
	public void the_client_browses_gcdsh_programs_by_selecting_filters_like6(String string, String string2) {
		first();
		//ArrayList <program> H=new ArrayList<program>();
	   c.filters("Flexibility", "Intermediate", p);
	}

	@Then("the system sh8765ould display THE programs matching the selected filters6 {string} & {string}")
	public void the_system_sh8765ould_display_the_programs_matching_the_selected_filters6(String string, String string2) {
	   assertTrue(c.msg.equals("your are in filters"));
	}

	@Given("the client is logged56789 in")
	public void the_client_is_logged56789_in() {
		 logger.info("here in test");
	}

	@When("the client browses programs by selecting jsghjds filters like10  {string} && {string}")
	public void the_client_browses_programs_by_selecting_jsghjds_filters_like10(String string, String string2) {
	   first();
	   c.filters("Flexibility", "Beginner", p);
	}

	@Then("the system should display THE9723 programs matching the selected filters10 {string} &&  {string}")
	public void the_system_should_display_the9723_programs_matching_the_selected_filters10(String string, String string2) {
	    assertTrue(c.msg.equals("there is no program with this requirements"));
	}

	@Given("the client is logged hg78f in and enrolled in a program")
	public void the_client_is_logged_hg78f_in_and_enrolled_in_a_program() {
		 logger.info("here in test");
	}

	@When("the client wants to view his3348 programs & schedules")
	public void the_client_wants_to_view_his3348_programs_schedules() {
		in();
	    c.schedulesView();
	}

	@Then("the System should return the enrolled &&* programs & schedules")
	public void the_system_should_return_the_enrolled_programs_schedules() {
	   assertTrue(c.msg.equals("schedulesView"));
	}

	@Given("the client is logged in and98jd enrolled in a program")
	public void the_client_is_logged_in_and98jd_enrolled_in_a_program() {
		 logger.info("here in test");
	}

	@When("the client delete a program5666")
	public void the_client_delete_a_program56_$() {
	    in();
	    c.delProgram(H);
	    	    
	}

	@Then("the System should delete the program33 hbhj")
	public void the_system_should_delete_the_program33_hbhj() {
	   assertTrue(c.msg.equals("the program is deleted"));
	}

	@Given("THE2 client is logged in ksjfhcb^&")
	public void the2_client_is_logged_in_ksjfhcb() {
		 logger.info("here in test");
	}

	@When("the client2 add their profile h763 with personal details like2  {string}")
	public void the_client2_add_their_profile_h763_with_personal_details_like2(String string) {
	   c.addRestrictions("8 cups of water a day");
	}

	@Then("the system should add sbnv9833 the client's2 {string} successfully")
	public void the_system_should_add_sbnv9833_the_client_s2_successfully(String string) {
	    assertTrue(c.msg.equals("the restriction is add"));
	}

	@Given("THE3 client is logged ingt44")
	public void the3_client_is_logged_ingt44() {
		
		 logger.info("here in test");
	}

	@When("the client3 delete their399& profile with personal details like3  {string}")
	public void the_client3_delete_their399_profile_with_personal_details_like3(String string) {
		c.addRestrictions("8 cups of water a day");
	    c.deleteRestrictions("8 cups of water a day");
	}

	@Then("the system should delete the22hh client's3 {string} successfully")
	public void the_system_should_delete_the22hh_client_s3_successfully(String string) {
	    assertTrue(c.msg.equals("the restriction is deleted"));
	}

	@Given("the client is dkjfnie8767823 logged in")
	public void the_client_is_dkjfnie8767823_logged_in() {
		 logger.info("here in test");
	}

	@When("the client check their55 jj profile with personal details like {string}")
	public void the_client_check_their55_jj_profile_with_personal_details_like(String string) {
		c.addRestrictions("8 cups of water a day");
	    c.getRestrictions();
	}

	@Then("the system should return the92633 requierd personal details like {string}")
	public void the_system_should_return_the92633_requierd_personal_details_like(String string) {
	    assertTrue(c.msg.equals("this is our restriction"));
	}

	@Given("the3j3j client is logged in")
	public void the3j3j_client_is_logged_in() {
		 logger.info("here in test");
	}

	@When("thej3j366 client check their profile with personal details like {string}")
	public void thej3j366_client_check_their_profile_with_personal_details_like(String string) {
		c.addFittnessGoals("loos weight");
	    c.getFittnessGoals();
	}

	@Then("the87%$h system should return the requierd personal details like {string}")
	public void the87_$h_system_should_return_the_requierd_personal_details_like(String string) {
	    assertTrue(c.msg.equals("this is fittness goal"));
	}

	@Given("the client is 76hg#$ logged in")
	public void the_client_is_76hg_$_logged_in() {
		 logger.info("here in test");
	}

	@When("the client check their jkhf7w65 profile with personal details like {string}")
	public void the_client_check_their_jkhf7w65_profile_with_personal_details_like(String string) {
	    c.addDietary("vagan");
	    c.getDietary();
	    }

	@Then("the system should return the jf7& requierd personal details like {string}")
	public void the_system_should_return_the_jf7_requierd_personal_details_like(String string) {
	    assertTrue(c.msg.equals("get dietary"));
	}


	@Given("THE1 client sdf34 is logged in")
	public void the1_client_sdf34_is_logged_in() {
		 logger.info("here in test");
	}

	@When("the client1 add their profile gh323&^ with personal details like1 {string}")
	public void the_client1_add_their_profile_gh323_with_personal_details_like1(String string) {
	    c.setGender("Female");
	}

	@Then("the system jd87$% should add the client's1 {string} successfully")
	public void the_system_jd87$_should_add_the_client_s1_successfully(String string) {
	    assertEquals("Female",c.getGender());
	}

	@Given("THE1 client is logged in88kj@@#")
	public void the1_client_is_logged_in88kj() {
		 logger.info("here in test");
	}

	@When("the client1 add 7h8h5 their profile with personal details like1 {string}")
	public void the_client1_add_7h8h5_their_profile_with_personal_details_like1(String string) {
	    c.setName("heba");
	}

	@Then("the system should add $%jh&* the client's1 {string} successfully")
	public void the_system_should_add_$_jh_the_client_s1_successfully(String string) {
	    assertEquals("heba",c.getName());
	}

	@Given("THE156sd client is logged in")
	public void the156sd_client_is_logged_in() {
		 logger.info("here in test");
	}

	@When("the client48*^^{int} add their profile with personal details like1 {string}")
	public void the_client48_add_their_profile_with_personal_details_like1(Integer int1, String string) {
	    c.setHight(165);
	}

	@Then("the system should add 87ghh& the client's1 {string} successfully")
	public void the_system_should_add_87ghh_the_client_s1_successfully(String string) {
	    assertTrue(c.msg.equals("set hight"));
	}

	@Given("THE1 client is 87gh23 logged in")
	public void the1_client_is_87gh23_logged_in() {
		 logger.info("here in test");
	}

	@When("the client1 add their jhdf&^%%$ profile with personal details like1 {string}")
	public void the_client1_add_their_jhdf_$_profile_with_personal_details_like1(String string) {
	    c.setWeight(60);
	}

	@Then("the system should add hdf78 the client's1 {string} successfully")
	public void the_system_should_add_hdf78_the_client_s1_successfully(String string) {
	    assertTrue(c.msg.equals("set weight"));
	}

	@Given("the client jh&^fg is logged in")
	public void the_client_jh_fg_is_logged_in() {
		 logger.info("here in test");
	}

	@When("the client click on a {int}%^hg program to view {string}")
	public void the_client_click_on_a_hg_program_to_view(Integer int1, String string) {
	    feed.setImprovment("Dania", "she is good");
	    feed.getimprovement();
	}

	@Then("the system should return all jhf8g6 the available {string}")
	public void the_system_should_return_all_jhf8g6_the_available(String string) {
	   assertTrue(feed.massage.equals("improvement"));
	}

	@Given("the client is hg&66h logged in")
	public void the_client_is_hg_66h_logged_in() {
		 logger.info("here in test");
	}

	@When("the client click on a program gg88%% to view {string}")
	public void the_client_click_on_a_program_gg88_to_view(String string) {
	    feed.setFeedback("Janbaz Basics","Dania" , "i loved the program");
	    feed.getFeedback();
	}

	@Then("the system should return all the 4g4h5j available {string}")
	public void the_system_should_return_all_the_4g4h5j_available(String string) {
	    assertTrue(feed.massage.equals("the feedback"));
	}

	@Given("the client is gf&*{int} logged in")
	public void the_client_is_gf_logged_in(Integer int1) {
		 logger.info("here in test");
	}

	@When("the client click on a program to 7hj94f^* view {string}")
	public void the_client_click_on_a_program_to_7hj94f_view(String string) {
	  feed.setRate(5, "Janbaz Basics");
	  feed.getRate();
	}

	@Then("the system should return HF^%J all the available {string}")
	public void the_system_should_return_hf_j_all_the_available(String string) {
	    assertTrue(feed.massage.equals("rates"));
	}

	@Given("the client is HJ&$F logged in")
	public void the_client_is_hj_$f_logged_in() {
		 logger.info("here in test");
	}

	@When("the client cleck on avrage rate^&{int}")
	public void the_client_cleck_on_avrage_rate(Integer int1) {
	   feed.setRate(4, "a");
	   feed.setRate(5, "b");
	   feed.avgRate();
	}

	@Then("the system should return the avrage rate*$%hg")
	public void the_system_should_return_the_avrage_rate_$_hg() {
	    assertTrue(feed.massage.equals("avrage rate"));
	}

	@Given("the client is logged in hrhr^")
	public void the_client_is_logged_in_hrhr() {
		 logger.info("here in test");
	}

	@When("the client click handle on a hehe&& {string}")
	public void the_client_click_handle_on_a_hehe(String string) {
	    m = new improvement ("Jode","she is not good");
	    feed.handleImprovement(m);
	}

	@Then("the system should handle the hoho00 {string}")
	public void the_system_should_handle_the_hoho00(String string) {
	   assertTrue(feed.massage.equals("improvement handeled"));
	}

	@Given("the client is logged in {int}!df")
	public void the_client_is_logged_in_df(Integer int1) {
		 logger.info("here in test");
	}

	@When("the client click handle hg&^!d on a {string}")
	public void the_client_click_handle_hg_d_on_a(String string) {
	   f = new Feed("hi","Jode","she is good");
	   feed.handleFeed(f);
	}

	@Then("the system should handle {int}^&gh the {string}")
	public void the_system_should_handle_gh_the(Integer int1, String string) {
	   assertTrue(feed.massage.equals("feed handeled"));
	}
}
