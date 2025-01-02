Feature: Client Features in Fitness Management System
	customize profiles with the following options:
	Personal details (e.g., age, fitness goals).
	Dietary preferences or restrictions.
	
	 Scenario: Client customizes their profile
    Given the client is logged in
    When the client add their profile with personal details like "age"
    Then the system should add the client's "age" successfully

    Scenario: Client customizes their profile
    Given the client is logged in
    When the client add their profile with personal details like  "fitness goals"
    Then the system should add the client's "fittness goals" successfully
    
    Scenario: Client customizes their profile
    Given the client is logged in
    When the client delete their profile with personal details like  "fitness goals"
    Then the system should delete the client's "fittness goals" successfully
    
    Scenario: Client customizes their profile
    Given the client is logged in
    When the client add their profile with personal details like  "dietary preferences"
    Then the system should add the client's "dietary preferences" successfully

Scenario: Client customizes their profile
    Given the client is logged in
    When the client delete their profile with personal details like "dietary preferences"
    Then the system should delete the client's "dietary preferences" successfully


  Scenario: Client manages their privacy settings
    Given the client is logged in
    When the client adjusts their privacy settings to control visibility of their information
    Then the system should update the privacy settings accordingly
	