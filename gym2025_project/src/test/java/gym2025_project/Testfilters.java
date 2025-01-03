package gym2025_project;

import static org.junit.Assert.assertTrue;


import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Testfilters {
	
	
	public instructor n = new instructor();
	public ArrayList<program> allPrograms = new ArrayList<program>();
    public ArrayList<program> filteredPrograms = new ArrayList<program>();
	public program testprogram1 = new program();
	public program testprogram2 = new program();
	public program testprogram3 = new program();
	public program testprogram4 = new program();
	public program testprogram5 = new program();
	
	program d=new program();
	program h=new program();
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
	    /*
		testprogram1.set_level("Beginner");
		testprogram1.set_goals("Weight Loss");
		testprogram1.s
	    allPrograms.add(testprogram1);
	    
		testprogram2.set_level("Intermediate");
		testprogram2.set_goals("Muscle Building");
		allPrograms.add(testprogram2);
	    
	    testprogram3.set_level("Advanced");
		testprogram3.set_goals("Flexibility");
		allPrograms.add(testprogram3);
	    
	    testprogram4.set_level("Beginner");
		testprogram4.set_goals("Yoga");
		allPrograms.add(testprogram4);
	    
	    testprogram5.set_level("Advanced");
		testprogram5.set_goals("Strength Training");
		allPrograms.add(testprogram5);
*/
		
	}
	
	
	
	client testclient = new client();

    @Given("the client is logged in")
    public void the_client_is_logged_in() {
    	first();
        System.out.println("inside filters");
    }

    @When("the client browses programs by selecting filters like1 {string}")
    public void the_client_browses_programs_by_selecting_filters_like1(String string) {
    	//first();
    	filteredPrograms = testclient.filterD("Beginner", n.programList);
    }

    @Then("THE system should display the programs matching the selected filter1 {string}")
    public void the_system_should_display_the_programs_matching_the_selected_filter1(String string) {
        assertTrue(testclient.msg.equals("the program is added(difficulty)"));
    }

    @When("the client browses programs by selecting filters like2 {string}")
    public void the_client_browses_programs_by_selecting_filters_like2(String string) {
    	//first();
    	filteredPrograms = testclient.filterD("Intermediate", n.programList);
    }

    @Then("the SYSTEM should display the programs matching the selected filter2 {string}")
    public void the_system_should_display_the_programs_matching_the_selected_filter2(String string) {
    	assertTrue(testclient.msg.equals("the program is added(difficulty)"));
    }

    @When("the client browses programs by selecting filters like3 {string}")
    public void the_client_browses_programs_by_selecting_filters_like3(String string) {
    	//first();
    	filteredPrograms = testclient.filterD("Advanced", n.programList);
    }

    @Then("the system Should display the programs matching the selected filter3 {string}")
    public void the_system_should_display_the_programs_matching_the_selected_filter3(String string) {
    	assertTrue(testclient.msg.equals("there is no program with this requirement"));
    }

    @When("the client browses programs by selecting filters like4  {string}")
    public void the_client_browses_programs_by_selecting_filters_like4(String string) {
    	//first();
    	filteredPrograms = testclient.filterF("Weight Loss", n.programList);
    }

    @Then("the system should Dispply the programs matching the selected filters4 {string}")
    public void the_system_should_dispply_the_programs_matching_the_selected_filters4(String string) {
       assertTrue(testclient.msg.equals("there is no program with this requirement"));
    }

    @When("the client browses programs by selecting filters like5  {string}")
    public void the_client_browses_programs_by_selecting_filters_like5(String string) {
    	//first();
    	filteredPrograms = testclient.filterF("Muscle Building", n.programList);
    }

    @Then("the system should display THE programs matching the selected filters5 {string}")
    public void the_system_should_display_the_programs_matching_the_selected_filters5(String string) {
    	assertTrue(testclient.msg.equals("the program is added(focus area) "));
    }

   /* @When("the client browses programs by selecting filters like6 {string}")
    public void the_client_browses_programs_by_selecting_filters_like6(String string) {
    	//first();
    	filteredPrograms = testclient.filterF("Flexibility", n.programList);
    }

    @Then("the system should display the PROGRAM matching the selected filters6 {string}")
    public void the_system_should_display_the_program_matching_the_selected_filters6(String string) {
    	assertTrue(testclient.msg.equals("the program is added(focus area) "));
    }
    
    //@Then("the system should display the PROGRAM matching the selected filters6{string}")
    //public void theSys
    
    */
    
    
}

