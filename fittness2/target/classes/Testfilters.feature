Feature: Client Features in Fitness Management System
	Browse programs by filters:
	Difficulty level (Beginner, Intermediate, Advanced).
	Focus area (e.g., weight loss, muscle building, flexibility).
	
    Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like1 "Beginner" 
    Then THE system should display the programs matching the selected filter1 "Beginner"
    
 Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like2 "Intermediate" 
    Then the SYSTEM should display the programs matching the selected filter2 "Intermediate"
    
     Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like3 "Advanced" 
    Then the system Should display the programs matching the selected filter3 "Advanced"
  
  Scenario: Client browses and filters programs based on focus area
    Given the client is logged in
    When the client browses programs by selecting filters like4  "weight loss"
    Then the system should Dispply the programs matching the selected filters4 "weight loss"
    
    Scenario: Client browses and filters programs based on focus area
    Given the client is logged in
    When the client browses programs by selecting filters like5  "muscle building"
    Then the system should display THE programs matching the selected filters5 "muscle building"
    
    
    