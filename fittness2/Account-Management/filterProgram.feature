Feature: Client Features in Fitness Management System
	Browse programs by filters:
	Difficulty level (Beginner, Intermediate, Advanced).
	Focus area (e.g., weight loss, muscle building, flexibility).
	
    Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like "Beginner" 
    Then the system should display the programs matching the selected filter "Beginner"
    
 Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like "Intermediate" 
    Then the system should display the programs matching the selected filter "Intermediate"
    
     Scenario: Client browses and filters programs based on difficulty
    Given the client is logged in
    When the client browses programs by selecting filters like "Advanced" 
    Then the system should display the programs matching the selected filter "Advanced"
  
  Scenario: Client browses and filters programs based on focus area
    Given the client is logged in
    When the client browses programs by selecting filters like  "weight loss"
    Then the system should display the programs matching the selected filters "weight loss"
    
    Scenario: Client browses and filters programs based on focus area
    Given the client is logged in
    When the client browses programs by selecting filters like  "muscle building"
    Then the system should display the programs matching the selected filters "muscle building"
    
    Scenario: Client browses and filters programs based on focus area
    Given the client is logged in
    When the client browses programs by selecting filters like  "flexibility"
    Then the system should display the programs matching the selected filters "flexibility"
    
    