Feature: Client Features in Fitness Management System
	Browse programs by filters:
	Difficulty level (Beginner, Intermediate, Advanced).
	Focus area (e.g., weight loss, muscle building, flexibility).
	
	Scenario: Client browses and filters programs based on difficulty and focus area
    Given the client is logged in
    When the client browses programs by selecting filters like "difficulty level" and "focus area"
    Then the system should display the programs matching the selected filters

  