Feature: Client Features in Fitness Management System
	Enroll in programs and view schedules
	
	Scenario: Client enrolls in a fitness program
    Given the CLIENT has browsed the programs
    When the client selects a program and enrolls in it
    Then the system should confirm the client's enrollment in the program

  Scenario: Client views program schedules
    Given the CLIENT is enrolled in a program
    When the client views the program schedule
    Then the system should display the programs
