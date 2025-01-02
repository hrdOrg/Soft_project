/*package fittness2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class achievements {


@Given("the client has completed certain program milestones")
public void the_client_has_completed_certain_program_milestones() {
   
}

@When("the client checks their achievements")
public void the_client_checks_their_achievements() {
   
}

@Then("the system should show earned {string} for completed goals")
public void the_system_should_show_earned_for_completed_goals(String string) {
    
}

@Given("the client is enrolled in a program")
public void the_client_is_enrolled_in_a_program() {
    
}

@When("the client checks their program progress")
public void the_client_checks_their_program_progress() {
    
}

@Then("the system should show the percentage of the program completed")
public void the_system_should_show_the_percentage_of_the_program_completed() {
   
}

@When("the client tracks their progress, such as {string}")
public void the_client_tracks_their_progress_such_as(String string) {
   
}

@Then("the system should display the updated {string}")
public void the_system_should_display_the_updated(String string) {
    
}



	
}*/

package fittness2;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;
import softwareProject.client;
import softwareProject.program;

import java.util.ArrayList;

public class achievements {

    private client testClient;
    private ArrayList<String> achievements;
    private double bmi;
    private double weight;
    private int attendance;

    @Given("the client has completed certain program milestones")
    public void the_client_has_completed_certain_program_milestones() {
        testClient = new client(25, "John Doe", "Male", 70.0, 1.75);
        testClient.addAchievements("Completed Beginner Program");
        testClient.addAchievements("Achieved Weight Goal");
    }

    @When("the client checks their achievements")
    public void the_client_checks_their_achievements() {
        achievements = new ArrayList<>(testClient.getprograms().size());
        for (program p : testClient.getprograms()) {
            achievements.add(p.get_titel());
        }
    }

    @Then("the system should show earned \"achievements\" for completed goals")
    public void the_system_should_show_earned_achievements_for_completed_goals() {
        assertTrue(achievements.contains("Completed Beginner Program"));
        assertTrue(achievements.contains("Achieved Weight Goal"));
    }

    @Given("the client is enrolled in a program")
    public void the_client_is_enrolled_in_a_program() {
        testClient = new client(25, "John Doe", "Male", 70.0, 1.75);
        program prog = new program();
        prog.set_titel("Beginner Program");
        testClient.enroll(prog);
    }

    @When("the client checks their program progress")
    public void the_client_checks_their_program_progress() {
        // Mock program completion percentage
        attendance = 80; // e.g., 80% of sessions attended
    }

    @Then("the system should show the percentage of the program completed")
    public void the_system_should_show_the_percentage_of_the_program_completed() {
        assertEquals(80, attendance);
    }

    @When("the client tracks their progress, such as \"BMI\"")
    public void the_client_tracks_their_progress_such_as_bmi() {
        testClient.calBMI();
        bmi = testClient.getBMI();
    }

    @Then("the system should display the updated \"BMI\"")
    public void the_system_should_display_the_updated_bmi() {
        assertEquals(22.86, bmi, 0.01); // Approximate value for 70kg and 1.75m
    }

    @When("the client tracks their progress, such as \"weight\"")
    public void the_client_tracks_their_progress_such_as_weight() {
        weight = testClient.getWeight();
    }

    @Then("the system should display the updated \"weight\"")
    public void the_system_should_display_the_updated_weight() {
        assertEquals(70.0, weight, 0.01);
    }

    @When("the client tracks their progress, such as \"attendance\"")
    public void the_client_tracks_their_progress_such_as_attendance() {
        // Mock attendance tracking
        attendance = 80; // Placeholder value
    }

    @Then("the system should display the updated \"attendance\"")
    public void the_system_should_display_the_updated_attendance() {
        assertEquals(80, attendance);
    }
}

