package gym.project;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class test_set_getfunctions {
	
public static final Logger logger = Logger.getLogger(test_set_getfunctions.class.getName());
	activity aa=new activity();
	
@Given("i want to Cr_EaT ACtIvItY")
public void i_want_to_cr_ea_t_a_ct_iv_it_y() {
    logger.info("i want to set name ");
}

@When("I wA_nt to Set Name for UOSEr ACt")
public void i_w_a_nt_to_set_name_for_uos_er_a_ct() {
    aa.set_useremail("lana");
}

@Then("the username WAS SeTTing")
public void the_username_was_se_t_ting() {
	String gn=aa.getUserEmail();
	assertTrue(gn=="lana");
}

@Given("i want to Cr_EaT ACtIvItY22")
public void i_want_to_cr_ea_t_a_ct_iv_it_y22() {
	 logger.info("i want to set logins ");
}

@When("I wA_nt to Set f2 for UOSEr ACt")
public void i_w_a_nt_to_set_f2_for_uos_er_a_ct() {
   aa.Set_logins(6);
}

@Then("the PROGRAMEnroll WAS SeTTing")
public void the_program_enroll_was_se_t_ting() {
	int gl=aa.getLogins();
	assertTrue(gl==6);
}

@Given("i want to Cr_EaT ACtIvItY33")
public void i_want_to_cr_ea_t_a_ct_iv_it_y33() {
	 logger.info("i want to set programenroll ");
}

@When("I wA_nt to Set f3 for UOSEr ACt")
public void i_w_a_nt_to_set_f3_for_uos_er_a_ct() {
 aa.set_programenroll(3);
}

@Then("the LoogINS WAS SeTTing")
public void the_loog_ins_was_se_t_ting() {
	  int pe=aa.getProgramsEnrolled();
	assertTrue(pe==3);
}

}
