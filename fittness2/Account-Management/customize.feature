Feature: Client Features in Fitness Management System
	customize profiles with the following options:
	Personal details (e.g., age, fitness goals).
	Dietary preferences or restrictions.
	
	 Scenario: Client customizes their profile
    Given the client is logged in
    When the client updates their profile with personal details like age, fitness goals, and dietary preferences
    Then the system should save the client's profile information successfully

  Scenario: Client manages their privacy settings
    Given the client is logged in
    When the client adjusts their privacy settings to control visibility of their information
    Then the system should update the privacy settings accordingly
	