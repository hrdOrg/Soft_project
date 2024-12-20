Feature: Client Features in Fitness Management System
	Rate and review completed programs
	
	Scenario: Client rates and reviews a completed program
    Given the client has completed a program
    When the client "rates" and "writes" a review for the program
    Then the system should save the rating and review for the program