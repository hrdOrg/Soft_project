Feature: Client Features in Fitness Management System
	Submit improvement suggestions to instructors.
	
  Scenario: Client submits "improvement" for program improvements
    Given the client has completed a program
    When the client submits a "improvement" for improvement
    Then the system should save the "improvement" for the instructor to review
    
  Scenario: Client participates in community feedback
    Given the client has completed a program
    When the client engages in community "feedback" via discussion forums
    Then the system should allow the client to post "feedback" 
	
	Scenario: Client rates a completed program
    Given the client has completed a program
    When the client "rate" a the program
    Then the system should save the "rate" for the program
