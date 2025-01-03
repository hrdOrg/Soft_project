Feature: Client Features in Fitness Management System
	Enroll in programs and view schedules
	
	Scenario: Client enrolls in a fitness program
    Given the CLIENT has browsed the programs
    When THE client SELECT a program AND enrolls in it
    Then The System Should confirm the client's enrollment in the program

  Scenario: Client views program schedules
    Given the CLIENT is enrolled in a program
    When THE CLIENT VIEWS the program schedule
    Then the system should display THE PROGRAMS
