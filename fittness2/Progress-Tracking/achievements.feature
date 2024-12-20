Feature: Client Features in Fitness Management System
	View achievements or badges for completing programs.
	

  Scenario: Client views achievements and badges
    Given the client has completed certain program milestones
    When the client checks their achievements
    Then the system should show earned badges and recognition for completed goals

  Scenario: Client tracks program completion
    Given the client is enrolled in a program
    When the client checks their program progress
    Then the system should show the percentage of the program completed
	