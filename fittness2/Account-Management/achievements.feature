Feature: Client Features in Fitness Management System
	View achievements or badges for completing programs.
	

  Scenario: Client views "achievements"
    Given the client has completed certain program milestones
    When the client checks their achievements
    Then the system should show earned "achievements" for completed goals

  Scenario: Client tracks program completion
    Given the client is enrolled in a program
    When the client checks their program progress
    Then the system should show the percentage of the program completed
	
	Scenario: Client tracks personal fitness milestones "BMI"
    Given the client is enrolled in a program
    When the client tracks their progress, such as "BMI"
    Then the system should display the updated "BMI"
	
	Scenario: Client tracks personal fitness milestones "weight"
    Given the client is enrolled in a program
    When the client tracks their progress, such as "weight"
    Then the system should display the updated "weight"
	
	Scenario: Client tracks personal fitness milestones "attendance"
    Given the client is enrolled in a program
    When the client tracks their progress, such as "attendance"
    Then the system should display the updated "attendance"
	
	